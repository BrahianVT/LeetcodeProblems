
package leetcode.solutions;
import java.util.*;
/*
	7
	Number leecode problem: 583
	https://leetcode.com/problems/delete-operation-for-two-strings/
    Time Complexity: O(nm) 
    Space Complexity: O(nm)
*/    
public class DeleteOperationTwoStrings {
	public int minDistance(String word1, String word2) {
        
		int n = word1.length, m = word2.length;
		int[][] dp = new int[n +1][m + 1];
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <=m; j++){
				dp[i][j] = word1.charAt(i -1) == word2.charAt(j - 1)?dp[i-1][j-1] + 1:Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		return n + m - 2 * dp[n][m];
    }
}