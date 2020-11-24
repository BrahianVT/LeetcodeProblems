
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 99
https://leetcode.com/problems/recover-binary-search-tree/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class RecoverBinarySearchTree{
	
	public void recoverTree(TreeNode root) {
		TreeNode pre = null, first = null, second = null;
		while(root != null){
			if(root.left != null){
				TreeNode left = root.left;
				while(left.right != null && left.right != null)left = left.right;
				if(left.right == null){
					left.right = root; root = root.left;
				} else left.right = null;
			}
			if(pre != null && root < pre.next){
				if(first == null)first = pre;
				second = root;
			}
			pre = root;
			root = root.right;
		}
		int aux = first.val;
		first.val = second.val;
		second.val = aux;
		
	}
}