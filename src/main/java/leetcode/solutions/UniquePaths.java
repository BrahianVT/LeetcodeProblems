

/**
 Number leecode problem: 60

	https://leetcode.com/problems/unique-paths/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class UniquePaths{
	
	public int uniquePaths(int m, int n){
		int dp[][] = new int[n][m];
		dp[1][0] = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		
		return dp[n][m];
	}
}