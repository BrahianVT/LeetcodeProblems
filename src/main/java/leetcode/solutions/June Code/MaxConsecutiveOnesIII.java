package leetcode.solutions;
import java.util.*;
/*
	Problem : 29
	Number leecode problem: 1004
	https://leetcode.com/problems/max-consecutive-ones-iii/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/

public class MaxConsecutiveOnesIII{

	public int longestOnes(int[] nums,int k){
		int i = 0, j = 0;
		
		for(; j  < nums.length; j++){
			if(nums[j] == 0)
				k--;
			if(k < 0 && nums[i++] == 0)k++;
		}
		
		return j-i;
	}
}
