

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 47

	https://leetcode.com/problems/permutations-ii/
     Time Complexity: O(n!*n)
    Space Complexity: O(n!*n)  n: nums.length
*/



public class PermutationsII{
	public List<List<Integer>> permuteUnique(int[] nums){
		
		List<List<Integer>> res = new ArrayList();
		List<Integer> aux = new ArrayList();
		Arrays.sort(nums);
		
		backtracking(res, aux, new boolean[nums.length]);
		
		return res;
	}
	
	private void backtracking(List<List<Integer>> list, List<Integer> aux, boolean[] used, int[] nums){
		
		if(aux.size() == nums.length){ 
			list.add(new ArrayList(aux)); return;
		}else {
			
			for(int i = 0; i < nums.length; i++){
				if(used[i] || i > 0 && nums[i] == nums[i -1] && !used[i -1])continue;
				used[i] = true;
				aux.add(nums[i]);
				backtracking(list, aux, used, nums);
				aux.remove(aux.size() -1);
				used[i] = false;
			}
		}
	}
}
