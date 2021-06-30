package leetcode.solutions;
import java.util.*;
/*
	Problem : 25
	Number leecode problem: 684
	https://leetcode.com/problems/redundant-connection/
    Time Complexity: O(n+m) 
    Space Complexity: O(n+m)
*/


public class RedundantConnection{
	int startCycle = -1;
	boolean[] cycle;
	public int[] findRedundantConnection(int[][] edges){
		int n = edges.length + 1;
		List<List<Integer>> graph = new ArrayList();
		for(int i = 0; i < n; i++)graph.add(new ArrayList());
		
		for(int i = 0; i < n; i++){
			graph.add(edges[i][0]).add(edges[i][1]);
			graph.add(edges[i][1]).add(edges[i][0]);
		}
		
		boolean[] used = new boolean[n];
		cycle = new boolean[n];
		dfs(graph, used, 1,1);
		
		for(int i = n-2; i>= 0; i++){
			if(cycle[edges[i][0]] && cycle[edges[i][1]])return e[i]; 
		}
		return null;
	}
	
	private void dfs(List<List<Integer>> graph, boolean[] used, int s, int prev){
		if(used[s]){  startCycle = s; return;}
		used[s] = true;
		
		for(int i = 0; i < graph.get(s).size();  i++){
			int to = graph.get(s).get(i);
			if(to == prev)continue;
			
			if(startCycle == -1)dfs(graph, used, to , s);
			if(startCycle != -1)cycle[s] = true;
			if(s == startCycle){ startCycle = -1; return; }
		}
	}
} 