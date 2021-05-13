package leetcode.solutions;
import java.util.*;
/*
	4
	Number leecode problem: 665
	https://leetcode.com/problems/non-decreasing-array/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    

public class Non-decreasingArray{
	
	public boolean checkPossibility(int[] nums) {
        
		int err = 0;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] < nums[i - 1])
				if(err++ > 0 || (i > 1 && i < nums.length - 1 && nums[i-2] > nums[i] && nums[i+1] < nums[i-1]))
					return false;
		}
    }
}