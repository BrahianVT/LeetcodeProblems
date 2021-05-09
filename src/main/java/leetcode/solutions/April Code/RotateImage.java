

package leetcode.solutions;
import java.util.*;
/*
	25
	Number leecode problem: 48
https://leetcode.com/problems/rotate-image/
    Time Complexity: O(nm) 
    Space Complexity: O(1)
*/
public class RotateImage{
	public void rotate(int[][] matrix) {
        
		swap(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = i+1; j < matrix[0].length; j++){
				int aux = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = aux;
			}
		}
    }
	
	private void swap(int[][] matrix){
		int s = 0, e = matrix.length-1;
		while(s < e){
			int[] aux = matrix[s];
			matrix[s++] = matrix[e];
			matrix[e--] = aux;
		}
	}
}