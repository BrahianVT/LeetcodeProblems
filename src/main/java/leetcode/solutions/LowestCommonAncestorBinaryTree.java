
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 236
	https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class LowestCommonAncestorBinaryTree{
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || p == root || q == root)return root;
		
		TreeNode left = lowestCommonAncestor(root, p, q);
		TreeNode right = lowestCommonAncestor(root, p, q);
		
		if(left != null && right !=  null)return root;
		
		return left != null?left:right;
	}
}