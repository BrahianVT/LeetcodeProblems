
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 560
	https://leetcode.com/problems/subarray-sum-equals-k/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class SubarraySumEqualsK{
	public int subarraySum(int[] nums, int k){
		int res = 0,sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		
		for(int i = 0; i < nums.length; i++){
			sum+=nums[i];
			if(map.containsKey(sum - k))
				res+= map.getOrDefault(sum - k , 0);
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		return res;
	}
}