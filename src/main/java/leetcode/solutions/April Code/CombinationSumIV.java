


package leetcode.solutions;
import java.util.*;
/*
	19
	Number leecode problem: 377
https://leetcode.com/problems/combination-sum-iv/
    Time Complexity: O(2^n) 
    Space Complexity: O(target)
*/                                 
public class CombinationSumIV {
	public int combinationSum4(int[] nums, int target){
		Arrays.sort(nums);
		int[] dp = new int[target + 1];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		return calculate(nums, target, dp);
	}
	
	private int calculate(int[] nums, int target, int[] dp){
		if(dp[target] != -1)return dp[target];
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] <= target)
				res+= calculate(nums,  target - nums[i], dp);
			else 
				break;
		}
		
		return dp[target] = res;
	}
}
