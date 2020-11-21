package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 94
https://leetcode.com/problems/binary-tree-inorder-traversal/
    Time Complexity: O(n)
    Space Complexity: O(n)
	
*/


public class BinaryTreeInorderTraversal{
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList();
		Stack<Integer> s = new Stack();
		TreeNode cur = root;
		
		while(!s.isEmpty() && cur != null){
			
			while(cur != null){
				s.push(cur);
				cur = cur.left;
			}
			cur = s.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		
		return res;
	}
}