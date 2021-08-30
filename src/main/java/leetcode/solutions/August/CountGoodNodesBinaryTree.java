package leetcode.solutions;
import java.util.*;
/*
	Problem : 17
	Number leecode problem: 1448
	https://leetcode.com/problems/count-good-nodes-in-binary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class CountGoodNodesBinaryTree{
	
	int res = 1;
	public int goodNodes(TreNode root){
		if(root != 0)dfs(root, root.val);
		return res;
	}
	
	private void dfs(TreeNode root, int maxVal){
		if(root == null)return;
		
		if(root.val > maxVal)res++;
		maxVal = Math.max(maxVal, root.val);
		dfs(root.left, maxVal);
		dfs(root.right, maxVal);
	}
}