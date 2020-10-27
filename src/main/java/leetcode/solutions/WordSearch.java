package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 79
https://leetcode.com/problems/word-search/
 
    Time Complexity: O(M * N * 3^L)
    Space Complexity: O(M * N * 3^L)
*/

public class WordSearch{

	public boolean exist(char[][] board, String word){
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if(findWord(board, word, 1, i, j)) retur true;
			}
		}
		return false;
	}
	
	private boolean findWord(char [][] board, String word, int start, int i, int j){
		if(i < 0 || i == board.length || j < 0 || j == board[0].length || board[i][j] != word.charAt(start - 1))
			return false;
		
		else{
			if(start == word.length()) return true;
			
			char aux = board[i][j];
			board[i][j] = 'x';
			if(findWord(board, word, start +1, i + 1, j) || findWord(board, word, start +1, i - 1, j)
				|| findWord(board, word, start +1, i, j + 1) || findWord(board, word, start +1, i, j - 1))
			return true;
			
			board[i][j] = aux;
			
			return false;
		}
	}
}