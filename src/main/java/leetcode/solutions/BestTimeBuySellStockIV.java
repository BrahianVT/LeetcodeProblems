package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 188
	https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
    Time Complexity: O(nk)
    Space Complexity: O(nk)
*/
public class BestTimeBuySellStockIV{
	
	public int maxProfit(int k, int[] prices) {
		if(k >= prices.length){
			int profit = 0;
			for(int i = 1; i < prices.length; i++){ 
				if(prices[i] > prices[i-1])profit+=prices[i] > prices[i-1];
			}
			return profit;
		}
		int n = prices.length;
		int[][] dp = new int[k + 1][n];
		for(int k2 = 1; k2 <= k; k2++){
			int min = prices[0];
			for(int j = 1; j < n; j++){
				min = Math.min(min, prices[j] - dp[k2-1][j-1]);
				dp[k2][j] = Math.max(dp[k2][j-1], prices[j] - min); 
			}
		}
		
		return dp[k2][n-1];
	}
}