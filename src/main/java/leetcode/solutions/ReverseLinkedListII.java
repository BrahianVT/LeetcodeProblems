
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 92
https://leetcode.com/problems/reverse-linked-list-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
	
*/


public class ReverseLinkedListII{
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null)return head;
		ListNode prevNode = null, nodeAtM = null, nodeAtN = null,postNode = null iter = head; 
		
		while(n != 1){
			if(m == 2)prevNode =iter;
			iter = iter.next; n--; m--;
		}
		
		nodeAtM = prevNode != null:prevNode.next?head;
		nodeAtN = iter; postNode = nodeAtN.next;
		
		iter = nodeAtM;
		ListNode next = null;
		ListNode prev = postNode; 
		
		while(iter != nodeAtN){
			next = iter.next;
			iter.next = prev;
			prev = iter;
			iter = iter.next;
		}
		
		iter.next = prev;
		if(prevNode != null){
			prevNode.next = nodeAtN;
			return head;
		} else {
			return iter;
		}
	}	
	  
}
