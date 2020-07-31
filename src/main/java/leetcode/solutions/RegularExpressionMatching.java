package leetcode.solutions;
/**
 Number leecode problem: 10
   https://leetcode.com/problems/regular-expression-matching/
    Time Complexity: O(s.length() * p.length())
   Space Complexity: O(s.length() * p.length())
*/

public class RegularExpressionMatching{
	public boolean isMatch(String s, String p) {
		if(s == nul || p == null){ return false; }
		
		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
		
		dp[0][0] = true;
		
		
		for(int j = 2; j<= p.length(); j++){
			dp[0][j] = p.charAt(j-1) == '*' && dp[0][j-2];
		}
		
		for(int j = 1; j <= p.length(); j++){
			for(int i = 1; i<= s.length(); i++){
				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
					dp[i][j] = dp[i-1][j-1];
				} else if(p.charAt(j-1) == '*') {
					dp[i][j] = dp[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2)) && dp[i-1][j]);
				}
			}
		}
		
		return dp[s.length()][p.length()];
	}
}