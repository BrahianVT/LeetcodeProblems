
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 416
	https://leetcode.com/problems/partition-equal-subset-sum/
    Time Complexity: O(n^2)
    Space Complexity: O(n^2)
*/

public class PartitionEqualSubsetSum{
	
	public boolean canPartition(int[] nums) {
		
		int sum = 0;
		for(int i : nums)sum+=i;
		
		Arrays.sort(nums);
		if(sum % 2 == 1)return false;
		boolean[] visited = new boolean[sum/2 + 1];
		return dfs(nums, target, 0, 0, visited);
	}
	
	private boolean dfs(int[] nums, int target, int i,int sum, boolean[] visited){
		if(sum == target)return true;
		if(sum > target || i == nums.length)return false;
		
		if(visited[sum])return false;
		
		if(dfs(nums, target, i+1, sum + nums[i], visited) || dfs(nums, target, i+1, sum, visited))
			return true;
		
		visited[sum] = true;
		
		return false;
	}
}

