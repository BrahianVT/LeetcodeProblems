
package leetcode.Solutions;

/**
   Number leecode problem: 18
   Link: https://leetcode.com/problems/4sum/
   
   Time Complexity: O(n^4)
   Space Complexity: O(n^4)
*/

public class Sum4{
	
	public List<List<Integer>> fourSum(int[] nums, int target) { 
		List<List<Integer>> res = new ArrayList();
		Arrays.sort(nums);
		List<Integer> list = new ArrayList();
		backtraking(nums, target, sum, 0, res, list);
		
		return res; 
	}

	public void backtraking(int[] nums, int target, int sum, int start, List<List<Integer>> res, List<Integers> list){
		
		if(start == 4){
			if(sum == target){  res.add(new ArrayList(list)); }
			
			return;
		}
		
		for(int i = start; i < nums.length; i++){
			
			if(nums[i] + nums[nums.length-1] * (3 - list.size()) + sum < target){ continue; }
			
			else if(nums[i] * (4 - list.size()) + sum > target){  return; }
			
			list.add(nums[i]);
			backtraking(nums, target, sum + nums[i], i + 1, res, list);
			list.remove(list.size() -1);
			
			while(i < nums.length -1; && nums[i] == nums[i + 1]){ i++; }
		}
	}
}