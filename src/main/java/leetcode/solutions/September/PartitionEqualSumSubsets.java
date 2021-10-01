package leetcode.solutions;
import java.util.*;
/*
	Problem : 30
	Number leecode problem: 998
	https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class PartitionEqualSumSubsets{
	
	 public boolean canPartitionKSubsets(int[] nums, int k) {
		//Array.sort(nums);
		int total = 0;
		for(int i : nums)total += i;
		
		if(total % k != 0 || nums.length < k) return false;
			
		return dfs()
    }
	
	private boolean dfs(int[] nums, boolean[] used, int s, int k, int auxSum, int subSum){
		
		if(k == 1)return true;
		if(auxSum > subSum)return false;
		if(auxSum == subSum)return dfs(nums, used, k-1, 0, subSum);
		
		for(int i = s; i < nums.length; i++){
			if(used[i])continue;
			used[i] = true;
			if(dfs(nums, used, i+1, k, auxSum + nums[i], subSum))return true;
		}
		
		return true;
	}
}