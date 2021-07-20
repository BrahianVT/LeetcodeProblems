package leetcode.solutions;
import java.util.*;
/*
	Problem : 13
	Number leecode problem: 162
	https://leetcode.com/problems/isomorphic-strings/
    Time Complexity: O(log n) 
    Space Complexity: O(1)
*/
	public class FindPeakElement{
		public int findPeakElement(int[] nums) {
			
			int l = 0, r = nums.length-1;
			while(l  < r){
				int m = (l + r) / 2;
				
				if(nums[m] < nums[m+1])
					l = m +1;
				else
					r = m;
			}
			
			return l;
		}
	
	}