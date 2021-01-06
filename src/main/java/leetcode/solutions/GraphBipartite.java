
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 785
	https://leetcode.com/problems/is-graph-bipartite/
    Time Complexity: O(v + e)
    Space Complexity: O(v + e)
*/
public class GraphBipartite{
	public boolean isBipartite(int[][] graph) { // dfs
		int[] colors = new int[graph.length];
		
		for(int i = 0; i < graph.length; i++){
			if(colors[i] == 0)
				if(!isBipartite(graph, i, 1 , colors))return false;
		}
		return true
	}
	
	private boolean isBipartite(int[][] graph, int s , int color, int[] colors){
		colors[s] = color;
		for(int node : graph[s]){
			if(colors[s] == color || colors[s] == 0 && !isBipartite(graph, s, color * -1))return false;
		}
		return true;
	}
	
	public boolean isBipartite(int[][] graph){ // bfs
		int colors = new int[graph.length];
		
		for(int i = 0; i < graph.length; i++){
			if(colors[i] == 0){
				Queue<Integer> q = new ArrayList();
				q.offer(i);
				colors[i] = 1;
				while(!q.isEmpty()){
					int cur = queue.poll();
					for(int next: graph[cur]){
						if(colors[next] == 0){
							colors[next] = -colors[cur];
							queue.offer(next);
						} else if(colors[next] != -colors[cur])return false;
					}
				}
			}
		}
		return true;
	}
}