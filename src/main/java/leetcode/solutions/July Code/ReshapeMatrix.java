package leetcode.solutions;
import java.util.*;
/*
	Problem : 5
	Number leecode problem: 566
	https://leetcode.com/problems/count-vowels-permutation/
    Time Complexity: O(nm) 
    Space Complexity: O(nm)
*/


    public class ReshapeMatrix{
		public int[][] matrixReshape(int[][] mat, int r, int c) {
			int a = mat.length, b = mat[0].length;
			if(a*b != r*c) return mat;
			
			int[][] res = new int[r][c];
			int i2 = 0, j2 = 0;
			for(int i = 0; i < a; i++){
				for(int j = 0; j < b; j++){
					res[i2][j2++] = mat[i][j];
					if(j2 == c){ i2++; j2 = 0;}
				}
			}
			return res; 
		}
	}