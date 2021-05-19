
package leetcode.solutions;
import java.util.*;
/*
	12
	Number leecode problem: 304
	https://leetcode.com/problems/range-sum-query-2d-immutable/
	Time Complexity: O(nm)
	Space Complexity: O(nm)
*/    

public class RangeSumQuery2DImmutable{
	int[][] matrix, dp;
	int n = 0, m = 0;
	public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
		n = matrix.length, m = matrix[0].length;
		dp = new int[n + 1][m + 1];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i-1][j-1];
			}
		}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row1][col2 +1] - dp[row2 + 1][col1]  + dp[row1][col1];
    }
}