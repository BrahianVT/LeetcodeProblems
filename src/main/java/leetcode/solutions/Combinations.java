
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 77
	https://leetcode.com/problems/combinations/
 
    Time Complexity: O(n!/(n-k)!)
    Space Complexity: O(kn)
*/

public class Combinations{
	
	
	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = LinkedList();
		LinkedList<Integer> aux = new LinkendList();
		
		backtracking(n, k, res, aux, 1);
		
		return res;
	}
	
	private void backtracking(int n, int k, List<List<Integer>> res, LinkedList<Integer> aux, int s){
		if(k == 0){
			res.add(new ArrayList(aux)); return;
		}
		for(int i = s; i <= n - k + 1; i++){
			aux.addLast(i);
			backtracking(n, k-1, res, aux, i + 1);
			aux.removeLast();
		}
	}
}