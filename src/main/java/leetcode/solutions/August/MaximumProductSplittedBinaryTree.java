package leetcode.solutions;
import java.util.*;
/*
	Problem : 19
	Number leecode problem: 1339
	https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class MaximumProductSplittedBinaryTree{
	long res = 0;
	int mod = (int)1e9 + 7;
	public int maxProduct(TreeNode root) {
        long sumTree = sum(root);
		res(root, sumTree);
		return (int)(res % mod);
    }
	
	private int sum(TreeNode root){
		return root == null?0:root.val + sum(root.left) + sum(root.right);
	}
	
	private int res(TreeNode root, long sumTree){
		if(root == null)return 0;
		
		int l = res(root.left, sumTree);
		int r = res(root.right, sumTree);
		
		int sumSubtree = l + r + root.val;
		
		res = Math.max(res, (sumTree - sumSubtree) * sumSubtree);
		return l + r + root.val;
	}
}