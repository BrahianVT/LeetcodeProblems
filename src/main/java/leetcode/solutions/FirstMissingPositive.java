

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 41

	https://leetcode.com/problems/first-missing-positive/
     Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class FirstMissingPositive{
	
	public int firstMissingPositive(int[] nums){
		int n = nums.length;
		
		for(int i = 0; i < n; i++){
			if(nums[i] > n || nums[i] <= 0){ nums[i] = n + 1; }
		}
		
		for(int i = 0; i < n; i++){
			int index = Math.abs(nums[i]);
			if(index > n){ continue; }
			else{
				index--;
				if(nums[index] > 0){ nums[index] = -nums[index]; }
			}
		}
		
		
		for(int i = 0; i < n; i++){
			if(nums[i] > 0){ return i + 1; }
		}
		
		return n + 1;
	}
}