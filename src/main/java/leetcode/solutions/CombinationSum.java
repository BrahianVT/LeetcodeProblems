package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 39
	https://leetcode.com/problems/combination-sum/
	
    Time Complexity: O(N^target) N: nums.length
    Space Complexity: O()
*/


public class CombinationSum{
	
	public List<List<Integer>> combinationSum(int[] nums, int target){
		
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList();
		
		List<Integer> aux = new ArrayList();	
		backtracking(nums, target, res, aux, 0);
		
		return res;
	}
	
	
	private void backtracking(int[] candidates, int target, List<List<Integer>> res, List<Integer> aux, int start){
		
		if(target == 0){
			res.add(new ArrayList(aux));
		} else if( target < 0){
			return;
		} else {
			
			for(int  i = start; i < candidates.length; i++){
				aux.add(candidates[i]);
				backtracking(candidates, target - candidates[i], res, aux, i);
				aux.remove(aux.size() -1);
			}
		}
	}
}