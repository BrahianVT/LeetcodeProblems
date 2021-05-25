
package leetcode.solutions;
import java.util.*;
/*
	19
	Number leecode problem: 609
	https://leetcode.com/problems/find-duplicate-file-in-system/
	Time Complexity: O(nlogn)
	Space Complexity: O(n)
*/   

public class MinimumMovesEqualArrayElementsII{

	public int minMoves2(int[] nums){
		int m = 0, res = 0;
		Arrays.sort(nums);
		m = nums[nums.length/2];
		for(int n : nums)res+= Math.abs(n - m);
		
		return res;
    }
}