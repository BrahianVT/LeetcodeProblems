package leetcode.solutions;
import java.util.*;
/*
	Problem : 7
	Number leecode problem: 206
	https://leetcode.com/problems/reverse-linked-list/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ReverseLinkedList{
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
		
		ListNode aux = reverseList(head.next);
		
		head.next.next = head;
		head.next = null;
		return aux;
    }
}