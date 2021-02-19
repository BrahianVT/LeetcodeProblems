
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 36
	https://leetcode.com/problems/valid-sudoku/
    Time Complexity: O(1)
    Space Complexity: O(1)
	because is always a constant 9
*/


public class ValidSudoku{
	public boolean isValidSudoku(char[][] board){
		Set<Character> val  = new HashSet<Character>();
		
		for(char[] row: board){
			val.clear();
			for(char c : row){
				if(val.contains(c) && c != '.')return false;
				else val.add(c);
			}
		}
		
		for(int i = 0; i < 9; i++){
			val.clear();
			for(int j = 0; j < 9; j++){
				if(val.contains(board[j][i]) && board[j][i] != '.')return false;
				else val.add(board[j][i]);
			}
		}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				int i2 = i + 2*i, j2 = j + 2*j;
				val.clear();
				if(val.contains(board[i2][j2]) && board[i2][j2] != '.') return false;
					val.add(board[i2][j2]);
				if(val.contains(board[i2][j2 + 1]) && board[i2][j2 + 1] != '.')return false;
					val.add(board[i2][j2 + 1]);
				if(val.contains(board[i2][j2 + 2]) && board[i2][j2 + 2] != '.') return false;
                val.add(board[i2][j2 + 2]); 
               
                if(val.contains(board[i2 + 1][j2]) && board[i2 + 1][j2] != '.') return false;
                	val.add(board[i2 + 1][j2]); 
                if(val.contains(board[i2 + 1][j2 + 1]) && board[i2 + 1][j2 + 1] != '.') return false;
                	val.add(board[i2 + 1][j2 + 1]); 
                if(val.contains(board[i2 + 1][j2 + 2]) && board[i2 + 1][j2 + 2] != '.') return false;
                	val.add(board[i2 + 1][j2 + 2]); 
                
               	if(val.contains(board[i2 + 2][j2]) && board[i2 + 2][j2] != '.') return false;
                	val.add(board[i2][j2 + 2]); 
                if(val.contains(board[i2 + 2][j2 + 1]) && board[i2 + 2][j2 + 1] != '.') return false;
                	val.add(board[i2 + 2][j2 + 1]); 
                if(val.contains(board[i2 +2][j2 +2]) && board[i2 + 2][j2 + 2] != '.') return false;
                	val.add(board[i2 + 2][j2 +2]); 
			}
		}
		
		return true;
	}
	
}
