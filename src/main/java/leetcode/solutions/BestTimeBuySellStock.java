package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 121
	https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BestTimeBuySellStock{
	
	public int maxProfit(int[] prices) {
		if(prices.length == 0)return 0;
		int min = prices[0], res = 0;
		for(int i = 1; i < prices.length; i++){
			if(prices[i]> min){
				res = Math.max(res, prices[i] - min); continue;
			}
			min = Math.min(min, prices[i]);
		}
		return res;
	}
	
}
