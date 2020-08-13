
package leetcode.Solutions;
import java.util.*;

/**
   Number leecode problem:26
   https://leetcode.com/problems/remove-duplicates-from-sorted-array
   
   Time Complexity: O(n)
   Space Complexity: O(1)
*/


public class RemoveDuplicatesSortedArray{
	
	    public int removeDuplicates(int[] nums) {
			
			if(nums.length == 0){ return 0; }
			int newLength =1, index = 1, aux = nums[0];

			while( index < nums.length){
				
				if(aux == nums[index]){
					index++;
				} else {
					aux = nums[index];
					nums[newLength++] = nums[index++]:
				}
			}
			
			return newLength;
		}
}