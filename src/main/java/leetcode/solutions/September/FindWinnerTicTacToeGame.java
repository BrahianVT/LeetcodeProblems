
package leetcode.solutions;
import java.util.*;
/*
	Problem : 20
	Number leecode problem: 1275
	https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
    Time Complexity: O()
    Space Complexity: O()
*/

public class FindWinnerTicTacToeGame{
	
	public String tictactoe(int[][] moves) {
		int[] aRow = new int[3] , aCol = new int[3], bRow = new int[3], bCol = new int[3];
		int aDiag = 0, bDiag = 0, aDiag2 = 0, bDiag2 = 0;
		
		int n = moves.length;
		for(int i = 0; i < n; i++){
			int r = moves[i][0], c = moves[i][1];
			if(i % 2 == 1){
				if(++bRow[r] == 3 || ++bCol[c] == 3 || (r == c && ++bDiag == 3) || ( r + c == 2 && ++bDiag2 == 3))return "B";
				else {
					if(++aRow[r] == 3 || ++aCol[c] == 3 || (r == c && ++aDiag == 3) || (r + c == 2 && ++aDiag2 == 3))return "A";
				}
			}
		}
		return n == 9? "Draw" : "Pending";
    }
}

