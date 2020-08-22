package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 33
	https://leetcode.com/problems/search-in-rotated-sorted-array/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class SearchRotatedSortedArray{
	
	
	public int search(int[] nums, int target){
		
		int start = 0, end = nums.length -1;
		
		while(start <= end){
			int mid = start + (end - start)/2;
			
			if(nums[mid] == target) return mid;
			else if(nums[mid] >= nums[start]){
				
				if(target >= nums[start]&& nums[mid] > target){
					end = mid - 1;
				} else {
					start = mid + 1;	
				}
			} else {
				if(target <= nums[end] && target > nums[mid]){
					start = mid + 1;
				} else {
					end = mid -1;
				}
			}
			
		}
		
		return -1;
	}
	
}	