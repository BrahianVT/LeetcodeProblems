
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 886
	https://leetcode.com/problems/possible-bipartition/
    Time Complexity: O(n + m)
    Space Complexity: O(1)
*/
public class PossibleBipartition{

	public boolean possibleBipartition(int n, int[][] dislikes){
		List<List<Integer>> graph = new ArrayList();
		for(int i = 0; i <= n; i++)graph.add(new ArrayList());
		
		for(int[] d: dislikes){
			graph.get(d[0]).add(d[1]);
			graph.get(d[1]).add(d[0]);
		}
		
		int[] colors = new int[n + 1];
		
		for(int i = 0; i < n; i++){
			if(colors[i] == 0 && graph.get(i).size() > 0)
				if(!dfs(graph, s, colors, colors[graph.get(i)] != 0?colors[graph.get(i)]*-1:1))
					return false;
		}		
		return true;
	}
	
	private boolean dfs(List<List<Integer>> graph, int s, int[] colors, int c){
		colors[s] = c;
		for(int to: graph.get(s)){
			if(colors[to] == c || colors[to] == 0 && !dfs(graph, to, colors, c *-1))
				return false;
		}
		return true;
	}
	
}