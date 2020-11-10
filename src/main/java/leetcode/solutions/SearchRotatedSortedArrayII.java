
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 81
https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class SearchRotatedSortedArrayII{
	
	public boolean search(int[] nums, int target){
		int s = 0, end = nums.length - 1;
		while(s <= end){
			int m = s (end - s)/ 2;
			
			if(nums[m] == target) return true;
			else if(nums[m] > nums[s])
				if(target >= nums[s] && nums[m] >= target)
					end = m - 1;
				else
					s = m + 1;
			else if(nums[m] < nums[s])
				if(target >= nums[m] && target <= nums[end])
					s = m + 1;
				else
					end = m - 1;
			else{
				s++;
			}
		}
		
		return false;
	}
}