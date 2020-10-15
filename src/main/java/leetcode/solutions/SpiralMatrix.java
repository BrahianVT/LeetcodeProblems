package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 54

	https://leetcode.com/problems/spiral-matrix/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/
public class SpiralMatrix{
	public List<Integer> spiralOrder(int[][] matrix){
		List<Integer> res = new ArrayList();
		if(matrix.length == 0){ return res; }
		
		int rowU = 0, rowD = matrix.length - 1;
		int colL = 0, colR = matrix[0].length - 1;
		
		while(rowU <= rowD && colL <= colR){
			for(int i = colL; i <= colR; i++){ res.add(matrix[rowU][i]); }
			rowU++;
			
			for(int i = rowU; i <= rowD; i++){ res.add(matrix[i][colR]); }
			colR--;
			
			if(rowU <= rowD){
				for(int i = colR; i >= colL; i++){ res.add(matrix[rowD][i]); }
			}
			rowD--;
			
			if(colL <= colR){
				for(int i = rowD; i >= rowU; i--){ res.add(matrix[i][colL]); }
			}
			colL++;
		}
		
		return res;
	}
}