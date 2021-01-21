package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 239
	https://leetcode.com/problems/sliding-window-maximum/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class SlidingWindowMaximum{
	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int[] left = new int[n], right = new int[n];
		for(int i = 1; i < n; i++){
			left[i] = i%k==0?nums[i]:Math.max(nums[i], nums[i-1]);
			int j = n - i - 1;
			right[i] = j%k==0?nums[j]:Math.max(nums[j], nums[j-1]);
		}
		
		int[] res = new int[n -k +1];
		int index = 0;
		for(int j = 0; j + k <= n; j++){
			res[index++] = Math.max(left[j+k -1], right[j]);
		}
		
		return res;
	}
}