

package leetcode.solutions;
import java.util.*;
/*
	Problem : 31
	Number leecode problem: 153
	https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/


public class FindMinimumRotatedSortedArray{

	 public int findMin(int[] nums) {
		int l = 0, r = nums.length-1;
		while(l < r){
			int m = (l + r)/2;
			if(nums[m] < nums[r])
				r = m;
			else
				l = m+1;
		}
		
		return nums[l];
     }
}