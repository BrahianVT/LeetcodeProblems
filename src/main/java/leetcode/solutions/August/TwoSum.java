package leetcode.solutions;
import java.util.*;
/*
	Problem : 2
	Number leecode problem: 1
	https://leetcode.com/problems/two-sum/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class TwoSum{
	
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(target - nums[i])){
				return new int[]{map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		
		return res;
	}
}