package leetcode.solutions;
import java.util.*;
/*
	Problem : 20
	Number leecode problem: 36
	https://leetcode.com/problems/valid-sudoku/
    Time Complexity: O(1)
    Space Complexity: O(1)
*/

public class ValidSudoku{
	public boolean isValidSudoku(char[][] board) {
		boolean[][] rows = new boolean[10][10], cols = new boolean[10][10], sectors = new boolean[10][10]; 
		
		int auxSector = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				int i2 = i + 2*i, j2 = j + 2*j
				for(int r = i2; r < i2 + 3; r++){
					for(int c = j2; c < j2+ 3; c++){
						if(board[r][c] != '.'){
							int ele = board[r][c] - '0';
							if(rows[r + 1][ele] || cols[c +1][ele] || sectors[auxSector][ele])return false;
							rows[r + 1][ele] = true;
							cols[c +1][ele] = true;
							sectors[auxSector][ele] = true;
						}
					}
				}
			}
			auxSector++;
		}
		return true;
    }
}
