package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 80
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public  class RemoveDuplicatesSortedArrayII{
	
	public int removeDuplicates(int[] nums){
		int len = 0, dupli = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(i > 0 && nums[i] == nums[i-1] && ++ dupli <= 2)
				nums[len++] = nums[i];
			else if(i > 0 && nums[i] != nums[i - 1])
				nums[len++] = nums[i]; dupli = 1;
			else if(i == 0){ len++; dupli++; }
		}
		
		return len;
	}
}