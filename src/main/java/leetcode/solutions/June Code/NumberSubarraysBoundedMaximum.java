


package leetcode.solutions;
import java.util.*;
/*
	Problem : 17
	Number leecode problem: 795
	https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/

public class NumberSubarraysBoundedMaximum{
	
	public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0, sum = 0,a = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > right){ sum = 0;  a = i + 1;}
			else if(nums[i] >= left){
				sum = i - a + 1;
			}
			res += sum;
		}
		return res;
    }
}
