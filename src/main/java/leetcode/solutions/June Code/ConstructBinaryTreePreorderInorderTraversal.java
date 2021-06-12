package leetcode.solutions;
import java.util.*;
/*
	Problem : 8
	Number leecode problem: 105
	https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class ConstructBinaryTreePreorderInorderTraversal{

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Stack<TreeNode> s = new Stack();
		TreeNode node = new TreeNode(preorder[0]);
		TreeNode aux = node;
		int n = preorder.length, m = inorder.length ,j = 0;
		for(int i = 1; i < n; i++){
			if(aux.val != inorder[j]){
				aux.left = new TreeNode(preorder[i]);
				s.push(aux);
				aux = aux.left;
			} else {
				j++;
				while(!s.empty() && s.peek().val == inorder[j]){
					aux = s.pop(); j++;
				}
				aux.right = new TreeNode(preorder[i]);
				aux = aux.right;
			}
			
		}
		return node;
    }
}