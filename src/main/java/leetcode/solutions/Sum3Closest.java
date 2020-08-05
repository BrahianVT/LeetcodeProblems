package leetcode.Solutions;

/**
   Number leecode problem: 16
   Link: https://leetcode.com/problems/3sum-closest/
   
   Time Complexity: O(n^2)
   Space Complexity: O(1)
*/

import java.util.*;
public class Sum3Closest{
	
	public int threeSumClosest(int[] nums, int target) {  
	
		// the max difference it may contains
		int minDiff = 200000;
		
		int res = 0, sum = 0;
		
		for(int i = 0; i <= nums.length -3; i++){
			
			int start = i +1, end = nums.length-1;
			
			while(start < end){
				sum = nums[start] + nums[i] + nums[end];
				if(sum == target){ return sum; }
				else if( sum < target){
					start++;
				} else {
					end--;
				}
				
				int diff = Math.abs(sum - target);
				if(diff < minDiff){
					minDiff = diff;
					res = sum;
				}
			}
		}
		
		return res;
	}
}
