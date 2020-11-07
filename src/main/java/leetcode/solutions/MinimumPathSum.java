package leetcode.solutions;
import java.util.*;

/**
 Number leecode problem: 64

	https://leetcode.com/problems/minimum-path-sum/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/
public class MinimumPathSum {
	
	public int minPathSum(int[][] grid){
		if(grid.length == 0) return 0;
		
		int n = grid.length, m = grid[0].length; 
		int dp[][] = new int[n + 1][m + 1];
		
		int aux = 1000000;
		for(int i = 0; i < n + 1; i++){ dp[i][0] = aux; }
		for(int j = 0; j < m + 1; j++){ dp[0][j] = aux; }
		
		dp[1][0] = 0;
		
		 for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				int min = Math.min(dp[i - 1][j] + grid[i - 1][j - 1], dp[i][j - 1] + grid[i - 1][j - 1]);
				dp[i][j]+=min;
			}
		 }
		 
		return dp[n][m];
	}
}