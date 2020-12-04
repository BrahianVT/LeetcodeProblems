package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 523
	https://leetcode.com/problems/continuous-subarray-sum/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ContinuousSubarraySum{
	public boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0,-1);
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum+= nums[n];
			sum%=k;
			Integer prev = map.get(sum);
			
			if(prev != null){
				if( i - prev > 1){ return true; }
			} else
				map.put(sum, i);
		}
		
		return false;
	}
	
}