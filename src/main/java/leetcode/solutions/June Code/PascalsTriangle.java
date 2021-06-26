
package leetcode.solutions;
import java.util.*;
/*
	Problem : 21
	Number leecode problem: 118
	https://leetcode.com/problems/pascals-triangle/
    Time Complexity: O(n^2) 
    Space Complexity: O(n^2)
*/

public class PascalsTriangle{

	 public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList();
		
		List<Integer> aux = new ArrayList();
		for(int i = 0; i < numRows; i++){
			aux.add(0, 1);
			for(int j = 1; j < aux.size()-1; j++)
				aux.set(j,aux.get(j) + aux.get(j+1));
			res.add(new ArrayList(aux));
		}
		
		return res;
     }
}