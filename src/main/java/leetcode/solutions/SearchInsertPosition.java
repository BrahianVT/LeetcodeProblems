

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 35
	https://leetcode.com/problems/search-in-rotated-sorted-array/
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class SearchInsertPosition{

	public int searchInsert(int[] nums, int target){
		int start = 0, end = nums.length;
		
		while(start < end){
			int mid = (start + end)/ 2;
			
			if(nums[mid] < target) start = mid + 1;
			else end = mid;
		}
		
		
		return start;
	}
}