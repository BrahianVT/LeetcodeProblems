package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 329
	https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/
public class LongestIncreasingPathMatrix{
	int max = 1;
    public int longestIncreasingPath(int[][] matrix) {
		int n = matrix.length, m = matrix[0].length;
	        int[][] dp = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				back(matrix, i, j, dp, 0);
			}
		}
		return aux;
	}
	
	public int back(int[][] matrix, int i , int j , int[][] dp, int aux){
		if(dp[i][j] != 0)return dp[i][j] + aux;
		int a = matrix[i][j]; matrix[i][j] = 0;
		
		if(i + 1 < matrix.length && matrix[i+1][j] > a){
			int down = back(matrix, i+1, j, dp, aux +1);
			dp[i][j] = Math.max(dp[i][j], down - aux);
			max = Math.max(max, dp[i][j]);
		}
		if(i - 1 >= 0 && matrix[i-1][j] > a){
			int up = back(matrix, i-1, j, dp, aux +1);
			dp[i][j] = Math.max(dp[i][j], up - aux);
			max = Math.max(max, dp[i][j]);
		}
		if(j + 1 < matrix.length && matrix[i][j + 1] > a){
			int right = back(matrix, i, j+1, dp, aux +1);
			dp[i][j] = Math.max(dp[i][j], right - aux);
			max = Math.max(max, dp[i][j]);
		}
		if(j - 1 >= 0 && matrix[i][j -1] > a){
			int left = back(matrix, i, j -1, dp, aux +1);
			dp[i][j] = Math.max(dp[i][j], down - aux);
			max = Math.max(max, dp[i][j]);
		}
		
		dp[i][j] = Math.max(dp[i][j], 1); matrix[i][j] = a;
		return Math.max(aux +1, dp[i][j] + aux);
	}
}
