package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 51

	https://leetcode.com/problems/n-queens/
    Time Complexity: O(2^n)
    Space Complexity: O(2^n)
*/
public class N-Queens{
	char[] base;
	int[][] coordinates ={{-1, 1},{-1, -1},{1, -1},{1, 1}};
	public List<List<String>> solveNQueens(int n){
		
		List<List<String>> res = new ArrayList();
		List<String> aux = new ArrayList();
		List<int[]> coor = new ArrayList();
		
		for(int i = 0; i < n; i++){ base[i] = '.'; }
		backtracking(res, aux, n, 0, new boolean[n], -2, coor);
		
		return res;
	}
	
	
	private void backtracking(List<List<String>> res, List<String> aux, int n, int cont, boolean[] visited, int prev, List<int[]> coor){
		
		if(cont == n){
			res.add(new ArrayList(aux)); return;
		} else {
			for(int i = 0; i < n; i++){
				if(visited[i] || (i == 0 && i + 1 == prev) || (i == n -1 && i - 1 == prev) || i > 0 && i < n - 1 && (i-1 == prev ||i +1 == prev))continue;
				if(!validateD(cont, i ,coor))continue;
				
				coor.add(new int[]{cont, i});
				visited[i] = true;
				backtracking(res, queenAt(aux, i), n, cont + 1, visited, i, coor);
				aux.remove(aux.size() - 1);
				coor.remove(coor.size() - 1);
				visited[i] = false;
			}
		}
	}
	
	private List<String> queenAt(List<String> aux, int i){
		base[i] = 'Q';
		aux.add(String.valueOf(base));
		base[i] = '.';
		return aux;
	}
	
	private boolean validateD(int depth, int i, List<int[]> coor){
		for(int[] c: coor){
			int diff = Math.abs(depth - c[0]);
			if(diff == 1){ continue; }
			else {
				 if(coordinates[0][0] * diff + depth == c[0] && coordinates[0][1] * diff + i == c[1]) return false;
				 if(coordinates[1][0] * diff + depth == c[0] && coordinates[0][1] * diff + i == c[1]) return false;
				 if(coordinates[2][0] * diff + depth == c[0] && coordinates[2][1] * diff + i == c[1]) return false;
                 if(coordinates[3][0] * diff + depth == c[0] && coordinates[3][1] * diff + i == c[1]) return false;
            }
			}
		}
		return true;
	}
	
}