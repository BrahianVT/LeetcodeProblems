
package leetcode.solutions;
import java.util.*;
/*
	Problem : 23
	Number leecode problem: 653
	https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class TwoSumIVInputBST{

	public boolean findTarget(TreeNode root, int k){
		dfs(root, k);
	}
	Set<Integer> map = new HashSet<>();
	private boolean dfs(TreeNode root, int k){
		if(root == null) return false;
		
		if(map.contains(k - root.val))return true;
		map.add(root.val);
		return dfs(root.left, k) || dfs(root.right, k);
	}
}