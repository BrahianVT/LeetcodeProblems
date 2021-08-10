
package leetcode.solutions;
import java.util.*;
/*
	Problem : 4
	Number leecode problem: 113
	https://leetcode.com/problems/path-sum-ii/
    Time Complexity: O(n+m)
    Space Complexity: O(2´k-1)
*/



public class PathSumII{
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> res = new ArrayList();
		if(root != null) dfs(root, targetSum, 0, res, new ArrayList());
		return res;
    }
	
	private void dfs(TreeNode root, int targetSum, int aux , List<List<Integer>> res, List<Integer> aux){
		
		aux.add(root.val);
		if(root.left == null && root.right == null){
			if(root.val + aux == targetSum){
				res.add(new ArrayList(aux));
			}
			return;
		}
		
		if(root.left != null){
			dfs(root.left, targetSum, aux + root.val, res, aux);
			aux.remove(aux.size() -1);
		}
		
		if(root.right != null){
			dfs(root.right, targetSum, aux + root.val, res, aux);
			aux.remove(aux.size() -1);
		}
	}
		
}