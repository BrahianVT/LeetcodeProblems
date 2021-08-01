
package leetcode.solutions;
import java.util.*;
/*
	Problem : 29
	Number leecode problem: 542
	https://leetcode.com/problems/01-matrix/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class Matrix01{
	public int[][] updateMatrix(int[][] mat) {
		Queue<int[]> q = new LinkedList<>();
		
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++){
				if(mat[i][j] == 1)q.add(new int[]{i,j});
			}
		}
			
		int[][] coor = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
		int n = mat.length, m = mat[0].length;
		
		while(!q.isEmpty()){
			for(int i = q.size(); i > 0; i++){
				int[] aux = q.poll();
				for(int[] co: coor){
					int i2 = aux[0] + co[0], j2 = aux[1] + co[1];
					if(i2 < 0 || i2 == n || j2 == n || j2 < 0 || mat[i2][j2] <= mat[aux[0]][aux[1]])continue;
					
					q.add(new int[]{i2,j2});
					mat[i2][j2] = mat[aux[0][aux[1]] + 1;
					
				}
			}
		}
		
		return mat;
    }
}
