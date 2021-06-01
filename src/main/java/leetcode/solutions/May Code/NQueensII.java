
package leetcode.solutions;
import java.util.*;
/*
	29
	Number leecode problem: 52
	https://leetcode.com/problems/n-queens-ii/
	Time Complexity: O(n^2)
	Space Complexity: O(n^2)
*/

public class NQueensII{
    int[][] coor = {{1,1},{1,-1},{-1,-1},{-1,1}};
    public int totalNQueens(int n) {
		return back(0, n, new boolean[n], new ArrayList(), -2);
	}
	
	private int back(int cont, int n ,boolean[] visited, List<List<Integer>> co, int prev){
		if(cont == n){ return 1; }
		int res = 0;
		for(int i = 0; i < n; i++){
			if(visited[i] || (i == 0 && prev == i +1) ||(i == n-1 && prev == i-1) ||(i > 0 && i < n-1 && (i == prev-1 || i == prev+1)) && !isVal(cont, i))continue;
			visited[i] = true;
			co.add(new int[]{i,j});
			res+= back(cont + 1, n, visited, co, i);
			visited[i] = false;
			co.remove(co.size() - 1);
		}
		return res;
	}
	
	private boolean isVal(int i, int j, List<int[]> co){
		for(int[] c : co){
			int diff = Math.abs(i - co[0]);
			if(coor[0][0] * diff + i == c[0] && coor[0][1] * diff + j == c[1])return false;
			if(coor[1][0] * diff + i == c[0] && coor[1][1] * diff + j == c[1])return false;
			if(coor[2][0] * diff + i == c[0] && coor[2][1] * diff + j == c[1])return false;
			if(coor[3][0] * diff + i == c[0] && coor[3][1] * diff + j == c[1])return false;
		}
		return false;
	}
}