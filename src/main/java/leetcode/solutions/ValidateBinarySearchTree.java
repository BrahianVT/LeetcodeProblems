
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 98
https://leetcode.com/problems/validate-binary-search-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ValidateBinarySearchTree{
	public boolean isValidBST(TreeNode root) {
			
	return is(root, null, null);
	}
	
	public boolean isValid(TreeNode root, Integer low, Integer max){
		if(root == null)return true;
		
		return (low == null || root.val > low) && (max == null || root.val < max)
			&& isValid(root.left, low, root.val) && isValid(root.right, root.val, max);
	}
}