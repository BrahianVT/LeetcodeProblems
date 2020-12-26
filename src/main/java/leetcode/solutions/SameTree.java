package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 100
https://leetcode.com/problems/same-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class SameTree{
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p == null && q == null)return true;
		else if(p == null || q == null || p.val != q.val)return false;
		
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
	}
}
