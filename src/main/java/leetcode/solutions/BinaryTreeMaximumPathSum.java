package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 124
	https://leetcode.com/problems/binary-tree-maximum-path-sum/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BinaryTreeMaximumPathSum{
	int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root){
		if(root == null)return max;
		
		return Math.max(max, getMax(root));
	}
	
	private int getMax(TreeNode root){
		if(root == null)return 0;
		int left = getMax(root.left);
		int right = getMax(root.right);
		int aux = left + root.val + right;
		max = Math.max(aux, max);
		max = Math.max(max, Math.max(left, right) + root.val);
		return Math.max(root.val,Math.max(left, right) + root.val);
	}
}