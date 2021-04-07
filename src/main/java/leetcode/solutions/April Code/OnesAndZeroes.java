
package leetcode.solutions;
import java.util.*;
/*
	2
	Number leecode problem: 474
	DP knapsack approach
	https://leetcode.com/problems/ones-and-zeroes/
    Time Complexity: O(sl * smn)  l :average length of a string within the array.
    Space Complexity: O(nm)
*/
public class OnesAndZeroes{
	
	public int findMaxForm(String[] strs, int m, int n){
		int[][] dp = new int[m+1][n+1];
		for(String str: strs){
			int one = 0, zero = 0;
			for(char c: str.toCharArray()){
				if(c == '1')one++;
				else zero++;
			}
			
			for(int i = m; i >= zero; i--){
				for(int j = n; j >= one; j--){
					if(one <= j && zero <= i)
						dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
				}
			}
		}
		
		return dp[m][n];
	}
}