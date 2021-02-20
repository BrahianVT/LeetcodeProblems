package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1240
	https://leetcode.com/problems/tiling-a-rectangle-with-the-fewest-squares/
    Time Complexity: O(m2^n)
    Space Complexity: O(n)
*/
public class TilingRectangleFewestSquares{
	
	int res  = Integer.MAX_VALUE, rows = 0, cols = 0;
    public int tilingRectangle(int n, int m) {
		rows = n; cols = m;
		dfs(0, 0, new boolean[n][m], 0);
		return res;
	}
	
	private void dfs(int r, int c, boolean[][] rect, int aux){
		if(aux > res){ return ; }
		
		if(r >= rows){ res = aux; return; }
		if(c >= cols){dfs(r + 1, c, rect, aux); return; }
		if(rect[r][c]){ dfs(r, c + 1, rect, aux);  return; }
		
		for(int k = Math.min(rows - r, cols - c); k > 0 && isValid(rect, r,c,k); k--){
			cover(rect, r,c,k);
			dfs(r,c,rect, aux + 1);
			uncover(rect, r, c, k);
		}
	}
	
	private boolean isValid(boolean[][] rect, int r, int c, int k){
		for(int i = 0; i < k; i++){
			for(int j = 0; j < k; j++){
				if(rect[i+ r][j+ c])return false;
			}
		}
		return true;
	}
	
	private boolean cover(boolean[][] rect, int r, int c, int k){
		for(int i = 0; i < k; i++){
			for(int j = 0; j < k; j++){
				rect[i+ r][j+ c] = true;
			}
		}
	}
	
	private boolean uncover(boolean[][] rect, int r, int c, int k){
		for(int i = 0; i < k; i++){
			for(int j = 0; j < k; j++){
				rect[i+ r][j+ c] = false;
			}
		}
	}
}