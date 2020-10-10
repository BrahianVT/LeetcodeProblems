package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 548

	https://leetcode.com/problems/rotate-image/
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/

public class RotateImage{
	public void rotate(int[][] matrix){
		swap(matrix, 0, matrix.length - 1);
		
		
		for(int i = 0; i < matrix.length; i++){
			for(int  j = i + 1; j < matrix[0].length; i++){
				int aux = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = aux;
			}
		}
		
	}
	
	
	private void swap(int[][] matrix, inr fRow, int lRow){
		
		while(fRow < lRow){
			int[] aux = matrix[lRow];
			matrix[lRow] = matrix[fRow];
			matrix[fRow] = aux;
		}
	}
}