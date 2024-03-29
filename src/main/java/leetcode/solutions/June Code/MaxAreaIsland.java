
package leetcode.solutions;
import java.util.*;
/*
	Problem : 1
	Number leecode problem: 695
	https://leetcode.com/problems/max-area-of-island/
    Time Complexity: O(n*m) 
    Space Complexity: O(n)
*/

public class MaxAreaIsland{
	
	public int maxAreaOfIsland(int[][] grid){
		
		int res = 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == 1)res = Math.max(res, dfs(grid, i, j));
			}
		}
		
		return res;
	}
	
	private int dfs(int[][] grid, int i, int j){
		if( i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 0)return 0;
		grid[i][j] = 0;
		int sum = dfs(grid, i + 1, j) + dfs(grid, i-1, j) + dfs(grid, i,j-1) + dfs(grid, i,j+1) + 1;
		return sum;
	}
}