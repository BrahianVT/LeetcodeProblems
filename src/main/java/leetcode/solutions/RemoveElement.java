

package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:27
	https://leetcode.com/problems/remove-element/
   
   Time Complexity: O(n)
   Space Complexity: O(1)
*/

public class RemoveElement{
	 
	public int removeElement(int[] nums, int val) {
      int len = 0;
	  
	  for(int i = 0; i < nums.length; i++){
		if(nums[i] != val){
			nums[len++] == nums[i];
		}   
	  }    
	  
	  return len;
    }
	
}
