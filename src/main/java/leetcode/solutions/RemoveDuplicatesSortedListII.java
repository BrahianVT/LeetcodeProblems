
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 82
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

 public class RemoveDuplicatesSortedListII{
	 
	public ListNode deleteDuplicates(ListNode head){
		
		ListNode res = new ListNode(0);
		ListNode aux = res;
		
		while(head != null){
			if(head.next != null && head.val == head.next.val){
				while(head.next != null && head.val == head.next.val)head = head.next;
				head = head.next; continue;
			}
			aux.next = head;
			aux = aux.next;
			head = head.next;
		}
		
		return res.next;
	}
 }