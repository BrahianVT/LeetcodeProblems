
package leetcode.solutions;
import java.util.*;
/*
	1
	Number leecode problem: 234
	https://leetcode.com/problems/palindrome-linked-list/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/
public class PalindromeLinkedList{
	public boolean isPalindrome(ListNode head){
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null)slow = slow.next;
		slow = reverse(head);
		while(slow != null && head.val == slow.val){
			slow = slow.next; head = head.next;
			
		}
		return slow == null;
	}
	
	private ListNode reverse(ListNode root){
		ListNode prev = null;
		while(root != null){
			ListNode next = root.next;
			root.next = prev;
			prev = root;
			root = next;
		}
		return prev;
	}
}