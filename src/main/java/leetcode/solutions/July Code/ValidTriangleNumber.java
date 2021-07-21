
package leetcode.solutions;
import java.util.*;
/*
	Problem : 15
	Number leecode problem: 205
	https://leetcode.com/problems/valid-triangle-number/
    Time Complexity: O(n log n) 
    Space Complexity: O(1)
*/



public class ValidTriangleNumber{
	
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums)
		int res = 0;
		for(int i  = nums.length -1; i >= 2; i--){
			int l = 0, r = i-1;
			while(l < r){
				if(nums[l] + nums[r] > nums[i]){
					res+=r-l; r--;
				} else
					l++;
			}
		}
		return res;
    }
}