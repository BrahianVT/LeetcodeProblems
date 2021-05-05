package leetcode.solutions;
import java.util.*;
/*
	11
	Number leecode problem:1302
	https://leetcode.com/problems/deepest-leaves-sum/
    Time Complexity: O(h) 
    Space Complexity: O(h)
*/
public class DeepestLeavesSum{
	int deepLevel = 0, res = 0;
	public int deepestLeavesSum(TreeNode root) {
		dfs(root, 1);
		return res;
    }
	
	private void dfs(TreeNode root, int deep){
		if(root == null)return;
		if(root.left == null && root.right == null){
			if(deepLevel == deep)res+=root.val;
			else if(deepLevel < deep){
				deepLevel = deep; res = root.val;
			}
		}
		dfs(root.left deep +1); dfs(root.right, deep + 1);
	}
}