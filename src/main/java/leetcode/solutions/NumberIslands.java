package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 200
	https://leetcode.com/problems/number-of-islands/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class NumberIslands{
	int res = 0;
	public int numIslands(char[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == '1'){ dfs(grid, i, j ); res++; }
			}
		}
		
		return res;
	}
	
	private dfs(char[][] grid, int i, int j){
		if( i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == '0')return;
		grid[i][j] = '0';
		dfs(grid, i + 1, j); dfs(grid, i - 1, j); dfs(grid, i, j + 1); dfs(grid, i, j - 1);
	}
}
