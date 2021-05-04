package leetcode.solutions;
import java.util.*;
/*
	10
	Number leecode problem:329
	https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
    Time Complexity: O(n,m) 
    Space Complexity: O(n,m)
*/

public class LongestIncreasingPathMatrix{
	
	 public int longestIncreasingPath(int[][] matrix) {
		 int n = matrix.length, m = matrix[0].length, res = 0;
		 int[][] dp = new int[n][m];
		 
		 for(int i = 0; i < n; i++){
			 for(int j = 0; j < m; j++){
				 res = Math.max(res, dfs(matrix, i, j, dp, -1));
			 }
		 }
		 return res;
	 }
	 
	 private dfs(int[][] matrix, int  i, int j , int[]dp, int cur){
		int n = matrix.length, m = matrix[0].length, res = 0;
		if(i < 0 || i>= m || j < 0 || j>=n || matrix[i][j] <= cur)return 0;
		if(dp[i][j] != 0)return dp[i][j];
		
		res = Math.max(res, dfs(matrix, i+1, j,dp, matrix[i][j]));
		res = Math.max(res, dfs(matrix, i-1, j,dp, matrix[i][j]));
		res = Math.max(res, dfs(matrix, i, j+1,dp, matrix[i][j]));
		res = Math.max(res, dfs(matrix, i, j-1,dp, matrix[i][j]));
		res++;
		return dp[i][j] = res;
	 }
}