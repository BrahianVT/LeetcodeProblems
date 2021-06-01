
package leetcode.solutions;
import java.util.*;
/*
	30
	Number leecode problem: 164
	https://leetcode.com/problems/maximum-gap/
	Time Complexity: O(nlog n)
	Space Complexity: O(1)
*/

public class MaximumGap{
	public int maximumGap(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		if(nums.length < 2)return 0;
		for(int i = 1; i < nums.length; i++){
			res = Math.res(res, nums[i] - nums[i-1]);
		}
		return res;
    }
}