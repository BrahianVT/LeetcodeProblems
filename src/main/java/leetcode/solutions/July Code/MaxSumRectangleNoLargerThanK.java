package leetcode.solutions;
import java.util.*;
/*
	Problem : 3
	Number leecode problem: 363
	https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/
    Time Complexity: O(min(m,n)^2 * max(m,n)* log(max(m,n))) 
    Space Complexity: O(max(m,n))
*/


public class  MaxSumRectangleNoLargerThanK{
	
	public int maxSumSubmatrix(int[][] matrix, int k){
		int res = Integer.MIN_VALUE, rows = matrix.length, cols = matrix[0].length;	
		for(int t = 0; t < cols; t++){
			int[] sums = new int[rows];
			for(int j = t; j < cols; j++){
				int kadane = 0, maxKadane = Integer.MIN_VALUE;
				for(int i = 0; i < rows; i++){
					sums[i]+= matrix[i][j];
					kadane = Math.max(kadane + sum[i], sum[i]);
					maxKadane = Math.max(kadane, maxKadane);
				}
				
				if(maxKadane <= k){  res = Math.max(res,maxKadane); continue; }
				
				TreeSet<Integer> set = new TreeSet<>();
				set.add(0);
				int runSum = 0;
				for(int e: sums){
					runSum+= e;
					Integer pre = set.ceiling(runSum - k);
					if(pre != null) res  = Math.max(res, runSum - pre);
					runSum.add(runSum);
				}
			}
		}
		return res;
	}

}