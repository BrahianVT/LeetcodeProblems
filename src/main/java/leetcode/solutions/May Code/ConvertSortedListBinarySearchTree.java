package leetcode.solutions;
import java.util.*;
/*
	6
	Number leecode problem: 109
	https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    
public class ConvertSortedLisBinarySearchTree{
	
	public TreeNode sortedListToBST(ListNode head) {
        if(head == null)return head;
		return createTree(head);
    }
	
	private TreeNode createTree(ListNode head){
		ListNode fast = head;
		ListNode slow = head, pre = null;
		while(fast != null && fast.next != null){
			pre = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		pre.next = null;
		TreeNode root = new TreeNode(slow.val);
		root.left = createTree(head);
		root.right = createTree(slow.next);
		return root;
	}
	
}
