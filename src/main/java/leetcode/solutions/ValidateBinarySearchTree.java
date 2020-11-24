
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 95
https://leetcode.com/problems/interleaving-string/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ValidateBinarySearchTree{
	public boolean isValidBST(TreeNode root) {
			
	
	}
	
	public boolean isValid(TreeNode root, Integer low, Integer max){
		if(root == null)return true;
		
		return (low == null || root.val > root.low) && (max == null || root.val < max)
			&& isValid(root.left, low, root.val) && isValid(root.right, root.val, max);
	}
}