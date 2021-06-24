
package leetcode.solutions;
import java.util.*;
/*
	Problem : 19
	Number leecode problem: 629
	https://leetcode.com/problems/k-inverse-pairs-array/
    Time Complexity: O(nk) 
    Space Complexity: O(nk)
*/

public class KInversePairsArray{

	public int kInversePairs(int n, int k) {
		int[][] dp = new int[n+1][k+1];
		int mod = 1000000007;
		for(int i = 0; i <= n; i++)dp[i][0] = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <=k; j++){
				dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod;
				if(j-i >= 0)dp[i][j] = (dp[i][j] - dp[i-1][j-1] + mod)%mod;
			}	
		}
		
		return dp[n][k];
    }
}