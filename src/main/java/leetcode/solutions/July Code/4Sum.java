
package leetcode.solutions;
import java.util.*;
/*
	Problem : 16
	Number leecode problem: 205
	https://leetcode.com/problems/4sum/
    Time Complexity: O(n3) 
    Space Complexity: O(1)
*/


public class 4Sum{
	public List<List<Integer>> fourSum(int[] nums, int target) {
        
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList();
		
		for(int a = 0; a <= nums.length-4; a++){
			if(a > 0 && nums[a] == nums[a-1])continue;
			for(int b = b+1; b <= nums.length-3; b++){
				if(b > 1 && nums[b] == nums[b-1] && b-1 != a)continue;
				int c = b + 1, d = nums.length -1;
				while(c < d){
					if(nums[a] + nums[b] + nums[c] + nums[d] == target){
						res.add(Arrays.asList(nums[a], nums[b],nums[c], nums[d]));
						while(c < d && nums[c] == nums[c+1])c++;
						while(d > c && nums[d] == nums[d-1])d--;
						c++; d--;
					} else if (nums[a] + nums[b] + nums[c] + nums[d] <= target){
						c++;
					} else d--;
				}
			}
		}
		return res;
    }
}