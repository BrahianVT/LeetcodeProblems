
package leetcode.solutions;
import java.util.*;
/*
	Problem : 7
	Number leecode problem: 746
	https://leetcode.com/problems/min-cost-climbing-stairs/
    Time Complexity: O(n) 
    Space Complexity: O(0)
*/

public class MinCostClimbingStairs{
	public int minCostClimbingStairs(int[] cost) {
     
		int one = cost[0], two = cost[1];
		for(int i = 2; i < cost.length; i++){
			int curr = cost[i] + Math.min(one,two);
			one = two;
			two = curr;
		}
		
		return Math.min(one,two);
    }
}