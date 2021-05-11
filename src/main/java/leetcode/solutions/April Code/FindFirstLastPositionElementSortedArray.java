package leetcode.solutions;
import java.util.*;
/*
	29
	Number leecode problem: 34
https://leetcode.com/problems/unique-paths-ii/
    Time Complexity: O(log n) 
    Space Complexity: O(1)
*/

public class FindFirstLastPositionElementSortedArray{

	public int[] searchRange(int[] nums, int target) {
        int left = -1, right = -1;
		if(nums.length == 0)return new int[]{left, right};
		
		left = binarySearch(0, nums.length-1, 0, nums, target);
		right = binarySearch(left + 1, nums.length-1, 1, nums, target);
		if(right == -1)right = left;
		if(left == -1)left = right;
		return new int[]{left, right};
    }
	
	private int binarySearch(int s, int e, int flag, int nums, int target){
		int res = -1;
		while(s <= e){
			int m = s + (e - s) /2;
			if(nums[m] == target && flag == 0){
				e = m-1; res = m;
			} else if(nums[m] == target && flag == 1){
				s = m + 1; res = m;
			} else if(nums[m] < target){
				s = m + 1;
			} else {
				e = m -1;
			}
		}
		return res;
	}
}