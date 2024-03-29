
package leetcode.solutions;
import java.util.*;
/*
	Problem : 19
	Number leecode problem: 115
	https://leetcode.com/problems/distinct-subsequences/
    Time Complexity: O(n^2)
    Space Complexity: o(n^2)
*/




public class DistinctSubsequences{

	public int numDistinct(String s, String t) {
		int m = s.length(), n = t.length();
		int[][] dp = new int[n+1][m+1];
		
		for(int i = 0; i <= m; i++)dp[0][i] = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				if(s.charAt(j-1) != t.charAt(i-1))
					dp[i][j] = dp[i][j-1];
			}	else {
				dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
			}
		}
		return dp[n][m];
	}
}