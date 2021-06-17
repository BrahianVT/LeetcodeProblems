
package leetcode.solutions;
import java.util.*;
/*
	Problem : 11
	Number leecode problem: 1690
	https://leetcode.com/problems/stone-game-vii/
    Time Complexity: O(n^2) 
    Space Complexity: O(n)
*/

public class StoneGameVII{
	
	Integer[][] dp
	int[] preSum;
	public int stoneGameVII(int[] stones) {
        int n = stones.length;
		preSum = new int[n +1];
		dp = new int[n][n];
		for(int i = 0; i < n; i++){
			preSum[i + 1] = preSum[i] + stones[i];		
		}
		
		return getMax(0, n-1);
    }
	
	private int getSum(int l, int r){
		return preSum[r + 1] - preSum[l];
	}
	
	private int getMax(int l, int r){
		if(l > r)return 0;
		
		if(dp[l][r] != null) return dp[l][r];
		
		int removeLeft = getSum(l + 1 , r);
		int removeRight = getSum(l, r- 1);
		int res = Math.max(removeLeft - getMax(l+1, r), removeRight - getMax(l, r-1));
		
		return dp[l][r] = ans;
	}
}


