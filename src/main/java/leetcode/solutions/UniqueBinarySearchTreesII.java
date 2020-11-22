
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 94
https://leetcode.com/problems/binary-tree-inorder-traversal/
    Time Complexity: O(n^n)
    Space Complexity: O(n^n)
	
*/

public class UniqueBinarySearchTreesII{
	public List<TreeNode> generateTrees(int n) {
		
		generate(1, n);
	}
	
	private List<TreeNode> generate(int s , int e){
		
		List<TreeNode> res = new LinkedList();
		
		if(s > e){ res.add(null); return res; }
		
		for(int i = s; i <= e; i++){
			
			List<TreeNode> leftSubtree = generate(s, i - 1);
			List<TreeNode> rightSubtree = generate(i + 1, e);
			for(TreeNode left: leftSubtree){
				for(TreeNode right: rightSubtree){
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					res.add(root);
				}
			}
		}
		
		return res;
	}
}