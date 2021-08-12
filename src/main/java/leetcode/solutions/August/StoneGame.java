package leetcode.solutions;
import java.util.*;
/*
	Problem : 5
	Number leecode problem: 877
	https://leetcode.com/problems/stone-game/
    Time Complexity: O(n2)
    Space Complexity: O(n2)
*/


public class StoneGame{
	public boolean stoneGame(int[] piles) {
        int n = piles.length;
		int[][] dp = new int[n][n];
		for(int i = 0; i < n; i++)dp[i][i] = i;
		
		for(int d = 1; d < n; d++){
			for(int i = 0; i < n-d; i++){
				dp[i][i + d] = Math.max(p[i] - dp[i +1][i + d], p[i + d] - dp[i][i - d - 1]);
			}
		}
    }
}