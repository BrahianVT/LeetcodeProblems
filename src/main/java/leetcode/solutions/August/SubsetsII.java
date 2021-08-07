package leetcode.solutions;
import java.util.*;
/*
	Problem : 3
	Number leecode problem: 1
	
    Time Complexity: O(2n -1)
    Space Complexity: O(2n -1)
*/


public class SubsetsII{
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList();
		Arrays.sort(nums);
		back(res, new ArrayList(), nums, 0);
		
		return res;
    }
	
	private back(List<List<Integer>> res, List<Integer> aux, int[] nums, int s){
		res.add(new ArrayList(aux));
		
		for(int i = s; i < nums.length; i++){
			if(i > s && nums[i] == nums[i - 1])continue;
			back(res, aux.add(nums[i]), nums, s +1);
			aux.remove(aux.size()-1);
		}
	}
}