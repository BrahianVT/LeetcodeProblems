
package leetcode.solutions;
import java.util.*;
/*
	16
	Number leecode problem: 968
	https://leetcode.com/problems/binary-tree-cameras/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/   


public class BinaryTreeCameras{
	
	int res = 0;
	public int minCameraCover(TreeNode root) {
        return dfs(root) == 0?1:0+res;
    }
	private int dfs(TreeNode root){
		if(root == null)return 2;
		int left = dfs(root.left);
		int right = dfs(root.right);
		
		if(left == 0 || right == 0){
			res++;
			return 1;
		}
		
		return left == 1 || right == 1?2:0;
	}
	
}