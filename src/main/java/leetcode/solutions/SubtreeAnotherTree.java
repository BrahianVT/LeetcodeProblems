package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 752
	https://leetcode.com/problems/subtree-of-another-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class SubtreeAnotherTree{
	
	public boolean isSubTree(TreeNode s, TreeNode t){
		if(s == null)return false;
		if(isSame(s,t))return true;
		return isSubTree(s.left, t.left) && isSubTree(s.right, t.right);
	}
	
	private boolean isSame(TreeNode s, TreeNode t){
		if(s == null && t == null)return true;
		if(s == null || t== null || s.val != t.val)return false;
		return isSame(s.left, t.left) && isSame(s.right, t.right);
	}
}
