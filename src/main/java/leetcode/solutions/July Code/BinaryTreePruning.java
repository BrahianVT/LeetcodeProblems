
package leetcode.solutions;
import java.util.*;
/*
	Problem : 23
	Number leecode problem: 814
	https://leetcode.com/problems/binary-tree-pruning/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class  BinaryTreePruning{
	
	public TreeNode pruneTree(TreeNode root) {
        if(dfs(root))return null;
		return root;
    }
	
	
	private boolean dfs(root){
		if(root == null)return false;
		if(root.left == null && root.right == null)
			return root.val == 1;
		boolean l = dfs(root.left);
		boolean r = dfs(root.right);
		if(!l)root.left = null;
		if(!r)root.right = null;
		return l || r || root.val == 1;
	}
}