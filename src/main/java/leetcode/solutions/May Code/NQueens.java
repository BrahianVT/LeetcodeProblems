
package leetcode.solutions;
import java.util.*;
/*
	23
	Number leecode problem: 51
	https://leetcode.com/problems/n-queens/
	Time Complexity: O(n^2)
	Space Complexity: O(n)
*/   
public class NQueens{
	 int[][] coor = {{1,1},{1,-1},{-1,-1},{-1,1}};
	 char[] base;
	public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList();
		base = new char[n];
		for(int i = 0; i < n; i++)base[i]= '.';
		back(res, new ArrayList(), new boolean[n], 0, -2, n, new ArrayList());
		return res;
    }
	
	private void back(List<List<String>> res, List<String> aux, boolean[] used, int cont, int prev, int n, List<int[]> co){
		if(cont == n){ res.add(new ArrayList(aux)); return; }
		
		for(int i = 0; i <  n; i++){
			if(used[i] || (i == 0 && prev == i+1) || (i == n -1 && prev == i -1) || ( i > 0 && i < n-1 && (prev == i-1 || prev == i+1)) || !valD(cont, i ,co))continue;
			used[i] = true;
			co.add(new int[]{cont, i});
			back(res, queenAt(aux, i), used, cont + 1, i, n, co);
			used[i] = false;
			aux.remove(aux.size() -1);
			co.remove(co.size() - 1);
		}
	}
	
	
	private List<String> queenAt(List<String> aux, int j){
		base[j] = 'Q';
		aux.add(String.valueOf(base));
		base[j] = '.';
		return aux;
	}
	
	private boolean valD(int i ,int j, List<int[]> co){
		for(int[] c : co){
			int diff = Math.abs(i , c[0]);
			if(i + diff*coor[0][0] == c[0] && j + diff*coor[0][1] == c[1])return false;
			if(i + diff*coor[1][0] == c[0] && j + diff*coor[1][1] == c[1])return false;
			if(i + diff*coor[2][0] == c[0] && j + diff*coor[2][1] == c[1])return false;
			if(i + diff*coor[3][0] == c[0] && j + diff*coor[3][1] == c[1])return false;
		}
		return true;
	}
}