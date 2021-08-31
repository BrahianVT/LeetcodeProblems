
/*
package leetcode.solutions;
import java.util.*;
/*
	Problem : 21
	Number leecode problem: 36
	https://leetcode.com/problems/sudoku-solver/
    Time Complexity: O(2^n)
    Space Complexity: O(1)
*/

*/
public class SudokuSolver{
	public void solveSudoku(char[][] board){
		boolean[][] rows = new boolean[10][10], cols = new boolean[10][10], sectors[10][10];

		int auxSec = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				int r = i + 2*i, c = j + 2*j;
				for(int i2 = r; i2 < r +3; i2++){
					for(int j2 = c; j2 < c + 3; j2++){
						if(board[i2][j2] != '.'){
							int a = board[i2][j2] - '0';
							rows[i2 + 1][a] = cols[j2 + 1][a] = sectors[auxSec][a] = true;
						}
					}
				}
				auxSec++;
			}
		}
	}
	
	int[][] coor = {{1,2,3},{4,5,6},{7,8,9}};
	
	private boolean back(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] sectors, int i, int j){
		if(i <= 7 && j == 9){ i++; j = 0; }
		if(i == 8 && j == 9){ return true; }
		
		if(board[i][j] != '.')return back(board, rows, cols, sectors,i, j + 1);
		
		for(int t = 1; t <= 9; t++){
			if(rows[i+1][t] || cols[j+1][t] || sectors[coor[i/3][i/3]][t])continue;
			rows[i+1][t] = cols[j+1][t] = sectors[coor[i/3][i/3]][t] = true;
			board[i][j] = (char)(t + '0');
			if(back(board, rows, cols, sectors, i, j+1))return true;
			rows[i+1][t] = cols[j+1][t] = sectors[coor[i/3][i/3]][t] = false;
			board[i][j] = '.';
		}
		return false;
	}
}