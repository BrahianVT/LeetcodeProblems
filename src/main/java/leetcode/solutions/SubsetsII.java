
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 39

	https://leetcode.com/problems/subsets-ii/
    Time Complexity: O(n^n)
    Space Complexity: O(n^n)  n: nums.length
*/

public class SubsetsII{
	
	public List<List<Integer>> subset(int[] nums){
		
		List<List<Integer>> res = new ArrayList();
		List<Integer> aux = new ArrayList();
		Arrays.sort(nums);
		backtracking(nums, res, aux, 0);
		
		return res;
	}
	
	private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> aux, int start){
		
		res.add(new ArrayList(aux));
		
		for(int i = start; i < nums.length; i++){
			if(i > start && nums[i] == nums[i-1]){ continue; }
			
			aux.add(nums[i]);
			backtracking(nums, res, aux, i + 1);
			aux.remove(aux.size() - 1);
		}
	}
}