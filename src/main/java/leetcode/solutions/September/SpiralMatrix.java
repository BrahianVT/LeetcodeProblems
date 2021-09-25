
package leetcode.solutions;
import java.util.*;
/*
	Problem : 16
	Number leecode problem: 54
	https://leetcode.com/problems/spiral-matrix/
    Time Complexity: O(n)
    Space Complexity: o(n)
*/

public class SpiralMatrix{
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
		int top = 0, down = n-1, right = m -1, left = 0;
		
		List<Integer> res = new ArrayList();
		
		while(left <= right && top <= down){
			for(int i = left; i <= right; i++){
				res.add(matrix[top][i]);
			}
			top++;
			for(int i = top; i <= down; i++){
				res.add(matrix[i][right]);
			}
			right--;
			if(top <= down){
				for(int i = right; i >= left; i--){
					res.add(matrix[down][i]);
				}
			}
			down--;
			if(left <= right){
				for(int i = down; i >= top; i--){
					res.add(matrix[i][left]);
				}
			}
			left++;
		}
		
		return res;
    }
}