package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 221
	https://leetcode.com/problems/sudoku-solver/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class MaximalSquare{
	public int maximalSquare(char[][] matrix){
		int n = matrix.length, m = matrix[0].length;
		int height[] = new int[m], left[] = new int[m], right = new int[m];
		Arrays.fill(right, m);
		int res = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(matrix[i][j] == '1')height[i]++;
				else {
					height[i] = 0; 
				}
			}
			int maxLeft = 0, minRight = m;
			for(int j = 0; j < m; j++){
				if(matrix[i][j] == '1')left[j] = Math.max(left[j],maxLeft);
				else {
					left[j] = 0; maxLeft = j + 1;
				} 
			}
			for(int j = m-1; j>=0; j++){
				if(matrix[i][j] == '1')right[i] = Math.min(right[i], minRight);
				else {
					right[j] = 0; minRight = j;
				}
			}
			for(int j = 0; j < m; j++){
				if(right[j] - left[j] >= height[i]){
					res = Math.max(res, height[i] * height[i]);
				}
			}
		}
		return res;
	}
}