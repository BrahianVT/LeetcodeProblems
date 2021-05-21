
package leetcode.solutions;
import java.util.*;
/*
	14
	Number leecode problem: 114
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
	Time Complexity: O(nm)
	Space Complexity: O(nm)
*/   

public class FlattenBinaryTreeLinkedList{
	
	public void flatten(TreeNode root) {
		
		 pre(root, null);
    }
	
	private TreeNode pre(TreeNode root, TreeNode last){
		if(root == null)return last;
		
		root.right = pre(root.left, pre(root.right, last));
		root.left = null;
		return root;
	}
}

