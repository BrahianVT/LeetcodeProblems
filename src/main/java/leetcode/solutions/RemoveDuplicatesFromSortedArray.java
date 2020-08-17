
package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:26
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
   
   Time Complexity: O(n)
   Space Complexity: O(1)
*/


public class RemoveDuplicatesFromSortedArray{
	
	public int removeDuplicates(int[] nums) {
		int len = 1, aux = nums[0];
		for( int i = 1; i < nums.length; i++){
			if(aux != nums[i]){
				aux = nums[i];
				nums[len++] = nums[i];
			}
		}
		
		return len;
	}
}