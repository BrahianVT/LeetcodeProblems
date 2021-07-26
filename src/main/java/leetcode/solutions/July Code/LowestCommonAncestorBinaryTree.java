
package leetcode.solutions;
import java.util.*;
/*
	Problem : 19
	Number leecode problem: 927
	https://leetcode.com/problems/three-equal-parts/submissions/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/


public class LowestCommonAncestorBinaryTree{
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root = p || root == q)return root;
		
		TreeNode l = lowestCommonAncestor(root.left, p, q);
		TreeNode r = lowestCommonAncestor(root.right, p, q);
		
		if(l != null && r != null)return root;
		
		return l == null?r:l;
    }	
}