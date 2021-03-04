
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1679
	https://leetcode.com/problems/max-number-of-k-sum-pairs/
    Time Complexity: O(nlogn)
    Space Complexity: O(1)
*/

public class MaxNumberKSumPairs{
	public int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0, j = nums.length -1, res = 0;
		for(i < j){
			if(nums[i] + nums[j] > k)j--;
			else if(nums[i] + nums[j] < k)i++;
			else{
				i++;j--; res++;
			}
		}
		
		return res;
	}
}
