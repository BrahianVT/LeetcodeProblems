
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 1192
	https://leetcode.com/problems/critical-connections-in-a-network/
    Time Complexity: O( e + v)
    Space Complexity: O(e + v)
*/

public class CriticalConnectionsNetwork{

	int id = 0;
	public List<List<Integer>> criticalConnetions(int n, List<List<Integer>> connections){
		int s = connections.size();
		
		List<List<Integer>> graph = new ArrayList(s * 2);
		
		for(int i = 0; i < n; i++){ graph.add(new ArrayList()); }
		for(int i = 0; i < connections.size(); i++){
			int from = connections.get(i)[0], to = connections.get(i)[1];
			graph.get(from).add(to);  graph.get(to).add(from);
		}
		
		int[] ids = new int[n]; int[] low = new int[n];
		Arrays.fill(ids, -1);
		List<List<Integer>> res = new ArrayList();
		
		for(int i = 0; i < n; i++){
			if(ids[i] == -1) findComponents(i, ids, low, graph, i, res);
		}
		
		return res;
	}
	
	private void findComponents(int start, int[] ids, int[] low, List<List<Integer>> graph, int prev, List<List<Integer>> res){
		low[start] = ids[start] = id++;
		
		for(int i = 0; i < graph.get(start).size(); i++){
			int to = graph.get(start).get(i);
			if(to == prev) continue;
			if(ids[to] == -1)findComponents(to, ids, low, graph, start, res);
			low[start] = Math.min(low[start], low[to]);
			if(low[to] > ids[start]){
				res.add(Arrays.asList(start, to));
			}
		}
	}
}
