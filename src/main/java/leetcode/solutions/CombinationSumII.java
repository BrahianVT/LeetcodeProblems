
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 40

	https://leetcode.com/problems/combination-sum-ii/
     Time Complexity: O(n^n)
    Space Complexity: O(n^n)  n: nums.length
*/

public class CombinationSumII{
	
	public List<List<Integer>> combinationSum2(int[] nums, int target){
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList();
		List<Integer> list = new ArrayList();
		
		backt(res, nums, target, 0, list, 0);
		
		return res;
	}
	
	
	private void backt(List<List<Integer>> res, int[] nums, int target, int start, List<Integer> aux, int sum){
		if(sum == target){
			res.add(new ArrayList(aux)); return;
		} else if (sum > target){ return ;}
		else {
			
			for(int i = start; i < nums.length; i++){
				if(i > 0 && i > start && nums[i] == nums[i -1]) continue;
				
				aux.add(nums[i]);
				backt(res, target, i +1, aux, nums[i] + sum);
				aux.remove(aux.size() -1);
			}
		}
	}
}