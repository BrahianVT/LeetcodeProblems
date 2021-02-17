
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 37
	https://leetcode.com/problems/sudoku-solver/
    Time Complexity: O(1)
    Space Complexity: O(1)
*/

public class SudokuSolver{
	public void solveSudoku(char[][] board) {
		int n = board.length, sec = 1;
		boolean[][] rows = new boolean[n + 1][n + 1], cols = new boolean[n +1][n + 1], sectors[n + 1][n + 1];
		for(int i  = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int i2 = i + 2*i; i2 < i + 3; i2++){
					for(int j2 = j + 2*j; j2 < j + 3; j2++){
						if(board[i2][j2] != '.'){
							char e = board[i2][j2];
							rows[i2 + 1][e - '0'] = true;
							cols[j2 + 1][e - '0'] = true;
							sectors[sec][e - '0'] = true;
						}
					}
				}
			sec++;	
			}
		}
		back(board, rows, cols, sectors, 0, 0);
	}
	
	int[][] sec = {{1,2,3},{4,5,6},{7,8,9}};
	private boolean back(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] sectors,int i , int j){
		if(i < board.length - 1 && j == cols[0].length){ i++; j = 0;}
		if(i == board.length -1 && j == cols[0].length){ return true; }
		if(board[i][j] == '.') return back(board, rows, cols, sectors, i ,j + 1);
		
		for(int t = 1 t <= 9; t++){
			if(rows[i + 1][t] || cols[j + 1][t] || sectors[sec[i/3][j/3]][t])continue;
			board[i][j] = (char)(t + '0'); rows[i + 1][t] = cols[j + 1][t] = sectors[sec[i/3][j/3]][t] = true;
			if(back(board, rows, cols, sectors, i, j))return true;
			board[i][j] = '.'; rows[i + 1][t] = cols[j + 1][t] = sectors[sec[i/3][j/3]][t] = false;
		}
		return false;
	}
}
