package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 680
	https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/




public class KSmallestElementBST{
	
	int res = -1, auxK = 0;
	public int kthSmallest(TreeNode root, int k) {
		find(root, k);
		return res;
	}
	
	private void find(TreeNode root, int k){
		if(root == null || res != -1)return;
		
		find(root.left, k);
		
		if(++auxK == k){ res = root.val; return; }
		find(root.right, k);
	}
}