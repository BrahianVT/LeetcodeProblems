package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 78
https://leetcode.com/problems/subsets/
 
    Time Complexity: O(n * 2^n)
    Space Complexity: O(n * 2^n)
*/

public class Subsets{
	
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res = new ArrayList();
		List<Integer> aux = new LinkedLisrt<>();
		
		backtracking(res, (LinkedList)aux, 0, nums);
		return res;
	}
	
	private void backtracking(List<List<Integer>> res, LinkedList<Integer> aux, int start, int[] nums){
		res.add(new ArrayList(aux));
		
		for(int i = start; i < nums.length; i++){
			aux.add(nums[i]);
			backtracking(res, aux, i + 1, nums);
			aux.removeLast();
		}
	}
}