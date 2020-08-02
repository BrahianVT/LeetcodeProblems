

package leetcode.Solutions;

/**
   Number leecode problem: 15
   Link: https://leetcode.com/problems/3sum/
   
   Time Complexity: O(n^2)
   Space Complexity: O(1)
*/

import java.util.*;
public class Sum3{
	
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);
		
		List<List<Integers>> res = new ArrayList();
		
		for(int i = 0; i <= nums.length -3; i++){
			
			if(i == 0 || nums[i] == nums[i-1]){
				int start = i + 1, end  = nums.length -1, sum = 0 - nums[i];
				
				while( start < end){
					
					int aux = nums[start] + nums[end];
					if(aux == sum){
						
						res.add(Arrays.asList(nums[i]), nums[start], nums[end]);
						while( start < end && nums[start] == nums[start + 1])
							start++;
						
						while(start < end && nums[end] == nums[end -1])
							end--;
						
						start++; end--;
					}
					else if(aux < sum) {
						start++;
					}
					else {
						end--;
					}
				}
				
				
			}
		}
		return res;
	}
}