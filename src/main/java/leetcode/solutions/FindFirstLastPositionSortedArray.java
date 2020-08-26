package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 34
	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

public class FindFirstLastPositionSortedArray{
	
	
	public int[] searchRange(int[] nums, int target){
		if(nums.length == 0){ return new int[]{-1, -1}; }
		
		int start = 0, end = nums.length -1;
		int start2 = -1;
		
		int mostLeft = -1;
		
		while(start <= end){
			int mid = start + (end - start)/2;
			
			if(nums[mid] == target){
				mostLeft = mid; end = mid -1;
				start2 = mid + 1;
			}
			else if(nums[mid] < target){
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		end = nums.length -1;
		int mostRight = -1;
		
		if(start2 > -1){
			while( start2 <= end){
				int mid = start2 + (end - start2)/2;
				
				if(nums[mid] == target){
					mostRight = mid; start2 = mid +1;
				} else if(nums[mid] < target){
					start2 = mid + 1;
				} else {
					end = mid - 1;
				}
			}	
		}
		
		if(mostRight == -1){ mostRight = mostLeft; }
		if(mostLeft == -1){ mostLeft = mostRight; }
		
		return new int[]{mostLeft, mostRight};
	}
}