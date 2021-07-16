



package leetcode.solutions;
import java.util.*;
/*
	Problem : 10
	Number leecode problem: 639
	https://leetcode.com/problems/decode-ways-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/



public class DecodeWays11{

	public int numDecodings(String s){
		int n = s.length(), mod = (int) 1e9 + 7;
		int[] dp = new int[n +1];
		if(s.charAt(0) == '0')return 0;
		dp[0] = 1; 
		dp[1] = s.charAt(0) == '*':9:1;
		
		for(int i = 2; i <= n; i++){
			char first = s.charAt(i-1), second = s.charAt(i-2);
			if(first == '*')
				dp[i]+=dp[i-1]* 9;
			else
				dp[i]+=dp[i+1];
			
			if(second == '*'){
				if(first == '*'){
					dp[i]+= dp[i-2]*15;
				}
				else if (first <= '6')
					dp[i]+= dp[i-2] * 2
				else dp[i]+= dp[i-2];
			} else if (second == '1' || second == '2'){
				if(first == '*')
					dp[i] = second == '1'?dp[i]+dp[i-2]*9:dp[i]+6*dp[i-2];
				else if((second - '0') * 10 + first -'0' >= 26)
					dp[i]+=dp[i-2];
			}
			dp[i]%=mod;
		}
		return(int)dp[n];
	}
}