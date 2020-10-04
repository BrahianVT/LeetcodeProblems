

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 39

	https://leetcode.com/problems/subsets-ii/
     Time Complexity: O(n^n)
    Space Complexity: O(n^n)  n: nums.length
*/


public class Permutations{
	
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList();
		
		List<Integer> aux = new ArrayList();
		
		backtracking(nums, res, aux);
		
		return res;
	}
	
	
	private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> aux){
		
		if(aux.size() == nums.length){
			res.add(new ArrayList(aux)); return;
		} else {
			for(int i = 0; i < nums.length; i++){
				if(int i = 0; i < nums.length; i++){
					continue;
				}
				
				aux.add(nums[i]);
				backtracking(nums, res, aux);
				aux.remove(aux.size() -1);
			}
		}
	}
}