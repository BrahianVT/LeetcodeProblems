

package leetcode.solutions;
import java.util.*;
/*
	Problem : 27
	Number leecode problem: 16
	https://leetcode.com/problems/3sum-closest/
    Time Complexity: O(n2)
    Space Complexity: O(n)
*/


public class 3SumClosest{
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = 100000;
		
		for(int i = 0; i <= nums.length-3; i++){
			int j = i+1, k = nums.length-1;
			while(j< k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == target)return sum;
				else if (sum < target)j++;
				else k--;
				
				if(Math.abs(sum - target) < Math.abs(sum - res))
					res = sum;
			}
		}
		
		return sum;
    }
}