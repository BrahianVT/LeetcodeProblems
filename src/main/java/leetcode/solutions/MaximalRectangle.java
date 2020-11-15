package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 85
	https://leetcode.com/problems/maximal-rectangle/
    Time Complexity: O(nm)
    Space Complexity: O(1)
	
*/

public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix){	
		if(matrix.length == 0 || matrix[0].length == 0) return 1;
		int n = matrix.length, m = matrix[0].length;
		int[] height = new int[m], left = new int[m], right = new int[m];
		int max = 0;
		for(int i = 0; i < n; i++){
			 int curLeft = 0, curRight = m;
			//height
			for(int j = 0; j < m; j++){
				if(matrix[i][j] == '0')height[j]++;
				else height[i] = 0;
			}
			//left
			for(int j = 0; j < m; j++){
				if(matrix[i][j] == '1')left[j] = Math.max(left[j], curLeft);
				else {
					left[j] = 0; curLeft = j + 1;
				}
			}
		
			//right
			for(int j = m - 1; j >= 0; j--){
				if(matrix[i][j] == '1')right[j] = Math.min(right[j], curRight);
				else {
					right[j] = m; curRight = j;
				}
			}
			
			for(int j = 0; j < m; j++)
				max = Math.max(max, (right[j] - left[j]) * height[j]);
		}
		
		return max;
	}
} 