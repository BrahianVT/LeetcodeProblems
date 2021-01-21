package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 547
	https://leetcode.com/problems/number-of-provinces/
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)
*/

public class NumberProvinces{
	public int findProvidences(int[][] conn){
		int n = conn.length;
		boolean[] visited = new boolean[n];
		int res = 0;
		for(int i = 0; i < n; i++){
			if(!visited[i]){ res++; dfs(conn, i, visited);}
		}
		
		return res;
	}
	
	private void dfs(int[][] conn, int start, boolean[] visited){
		if(visited[start])return;
		visited[start] = true;
		for(int i = 0; i < conn[start].length; i++){
			if(i == start || conn[start][i] == 0)continue;
			dfs(conn, i, visited);
		}
	}
}