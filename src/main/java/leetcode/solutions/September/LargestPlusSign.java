package leetcode.solutions;
import java.util.*;
/*
	Problem : 9
	Number leecode problem: 764
	https://leetcode.com/problems/largest-plus-sign/
    Time Complexity: O(n^2)
    Space Complexity: O(n^2)
*/


public class LargestPlusSign{
	 public int orderOfLargestPlusSign(int n, int[][] mines) {
		int[][] mat = new int[n][n];
		
		for(int[] i: mat)Arrays.fill(i, 1);
		
		for(int[] i : mines)mat[i[0]][i[1]] = 0;
		
		int[][] lef, rig, top, bot;
		
		lef = Arrays.stream(mat).map(int[]::clone).toArray(int[][]::new);
		rig = Arrays.stream(mat).map(int[]::clone).toArray(int[][]::new);
		top = Arrays.stream(mat).map(int[]::clone).toArray(int[][]::new);
		bot = Arrays.stream(mat).map(int[]::clone).toArray(int[][]::new);
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int x = n - i - 1, y = n - j -1;
				if(i > 0 && top[i][j] == 1) top[i][j] += top[i-1][j];
				if(j > 0 && lef[i][j] == 1) lef[i][j] += lef[i][j-1];
				if(x < n-1 && bot[x][y] == 1)bot[x][y]+= bot[x+1][y];
				if(y < n-1 && rig[x][y] == 1)rig[x][y]+= rig[x][y+1];
			}
		}
		
		int res = 0;
		for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res= Math.max(res, Math.min(bot[i][j],Math.min(top[i][j],Math.min(lef[i][j], rig[i][j]))));      
            }
         }
        return res;
     }
}