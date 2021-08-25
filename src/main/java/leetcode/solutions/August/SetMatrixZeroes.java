package leetcode.solutions;
import java.util.*;
/*
	Problem : 13
	Number leecode problem: 73
	https://leetcode.com/problems/set-matrix-zeroes/
    Time Complexity: O(nm)
    Space Complexity: O(1)
*/

 public class SetMatrixZeroes{
	 public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][0] == 0)firstRow = true;
			for(int j = 1; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					matrix[i][0] = 0; matrix[0][j] = 0;
				}
			}
		}
		
		for(int i = matrix.length -1 ; i >= 0; i--){
			for(int j = matrix[0].length-1; j >=0; j--){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] == 0
				}
			}
			if(firstRow) matrix[i][0] = 0;
		}
    }
	
 }
