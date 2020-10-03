
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 39

	https://leetcode.com/problems/subsets-ii/
    Time Complexity: O()
    Space Complexity: O()
*/

public class SubsetsII{
	
	public List<List<Integer>> subset(int[] nums){
		
		List<List<Integer>> res = new ArrayList();
		List<Integer> aux = new ArrayList();
		Arrays.sort(nums);
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