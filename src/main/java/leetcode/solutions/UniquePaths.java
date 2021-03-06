package leetcode.solutions;
import java.util.*;

/**
 Number leecode problem: 60

	https://leetcode.com/problems/unique-paths/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class UniquePaths{
	
	public int uniquePaths(int m, int n){
		int dp[][] = new int[n + 1][m + 1];
		dp[1][0] = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		
		return dp[n][m];
	}
}