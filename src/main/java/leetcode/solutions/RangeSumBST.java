

package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 938
	https://leetcode.com/problems/range-sum-of-bst/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

 public class RangeSumBST{
	
	public int rangeSumBST(TreeNode root, int low, int high){
		if(root == null) return 0;
		
		if(root.val > high) return rangeSumBST(root.left, low,right);
		if(root.val < low) return rangeSumBST(root.right, low, right);
		
		return rangeSumBST(root.left,low, high) + rangeSumBST(root.right, low, high) + root.val;
	}
 }