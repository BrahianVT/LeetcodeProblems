
package leetcode.solutions;
import java.util.*;
/*
	Problem : 7
	Number leecode problem: 132
	https://leetcode.com/problems/palindrome-partitioning-ii/
    Time Complexity: O(n^2)
    Space Complexity: O(n^2)
*/

public class  PalindromePartitioningII {
	
	public int minCut(String s){
		char[] c = s.toCharArray();
		int n = c.length, min = 0;
		
		int[] cut = new int[n];
		boolean[][] dp = new int[n][n];
		
		for(int i = 0; i < n; i++){
			 min = i;
			for(int j = 0; j <= i; j++){
				if(c[i] == c[j] && (i -j < 3 || dp[j+1][i-1])){
					dp[j][i] = true;
					min = j == 0?0:Math.min(min, cut[j-1] + 1);
				}
			}
			cut[i] = min;
		}
		return min;
	}
}