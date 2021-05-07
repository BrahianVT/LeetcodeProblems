


package leetcode.solutions;
import java.util.*;
/*
	17
	Number leecode problem: 1074
	https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
    Time Complexity: O(mnnn) 
    Space Complexity: O(m)
*/

public class NumberSubmatricesThatSumarget{
	
	public int numSubmatrixSumTarget(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length;
		int[] arr = new int[m];
		int res = 0;
		for(int i = 0; i < n; i++){
			Arrays.fill(arr, 0);
			for(int j = i; j < n; j++){
				for(int k = 0; k < m; k++){
					arr[k]+= matrix[k][j];
				}
			}
			res+= findSum(arr, target);
		}
		return res;
    }
	
	private int findSum(int[] nums, int target){
		int sum = 0, res = 0;
		Map<Integer, Integer> preSum = new HashMap<>();
		preSum.add(0,1);
		for(int i = 0; i < nums.length; i++){
			sum+=nums[i];
			if(preSum.containsKey(sum - target))
				res+= preSum.get(sum- target);
			
			preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
		}
		return res;
	}
}