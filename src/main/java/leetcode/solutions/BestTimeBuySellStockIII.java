package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 123
	https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BestTimeBuySellStockIII{
	public int maxProfit(int[] prices) {
		int buy = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
		int sell = 0, sell2 = 0;
		for(int i = 0; i < prices.length; i++){
			buy = Math.min(buy, prices[i]);
			sell = Math.max(sell, prices[i] - buy);
			buy2 = Math.min(buy2, prices[i] - sell);
			sell2 = Math.max(sell2, prices[i] - buy2);
		}
		
		return sell2;
	}
}