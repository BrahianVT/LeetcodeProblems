package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 865
	https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class SmallestSubtreeDeepestNodes{
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
	
		return findDeepestNode.getValue();
	}
	
	private Pair<Integer, TreeNode> findDeepestNode(TreeNode root){
		if(root == null)return new Pair<0, null>;
		
		Pair<Integer, TreeNofe> left = findDeepestNode(root.left);
		Pair<Integer, TreeNofe> right = findDeepestNode(root.right);
		
		int leftDeep = left.getKey(); int rightDeep = right.getKey();
		
		if(leftDeep == rightDeep)return new Pair<>(leftDeep + root);
		
		return leftDeep > rightDeep?new Pair(leftDeep + 1, left.getValue()):new Pair(rightDeep + 1, right.getValue());
	}
}
