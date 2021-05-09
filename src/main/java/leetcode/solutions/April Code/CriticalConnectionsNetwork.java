
package leetcode.solutions;
import java.util.*;
/*
	24
	Number leecode problem: 1192
https://leetcode.com/problems/critical-connections-in-a-network/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    

public class CriticalConnectionsNetwork{
	int id = 0;
	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		List<List<Integer>> graph = new ArrayList();
		for(int i = 0; i < n; i++)graph.add(new ArrayList());
		for(List r: connections){
			graph.get(r.get(0)).add(r.get(1));
			graph.get(r.get(1)).add(r.get(0));
		}
		int[] ids = new int[n], low = new int[n];
		
		List<List<Integer>> res = new ArrayList();
		Arrays.fill(ids, -1);
		for(int i = 0; i < n; i++){
			if(ids[i] == -1)dfs(graph, ids, low,i,res,i);
		}
		
		return res;
	}
	
	
	
	private void dfs(List<List<Integer>> graph, int[] ids, int[] low, int prev, List<List<Integer>> res,int start){
		ids[start] = low[start] = id++;
		for(int i = 0; i < graph.get(start).size(); i++){
			int to = graph.get(start).get(i);
			if(to == prev)continue;
			if(ids[to] == -1) dfs(graph, ids, low, start,res, to);
			low[start] = Math.min(low[start, low[to]);

			if(ids[start] < low[to]){
				res.add(Arrays.asList(start, to));
			}
		}
	}
}
