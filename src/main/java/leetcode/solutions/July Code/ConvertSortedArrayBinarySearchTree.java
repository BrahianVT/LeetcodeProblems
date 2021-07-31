

package leetcode.solutions;
import java.util.*;
/*
	Problem : 26
	Number leecode problem: 108
	https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class ConvertSortedArrayBinarySearchTree{

	public TreeNode sortedArrayToBST(int[] nums) {
		return create(nums, 0, nums.length-1);
    }
	
	private TreeNode create(int[] nums, int a, int b){
		if(a >= b)return null;
		
		int m = (a + b)/2;
		
		TreeNode root = new TreeNode(nums[m]);
		root.left = new TreeNode(nums, a, m -1);
		root.right = new TreeNode(nums, m+1, b);
		
		return root;
	}
	
}