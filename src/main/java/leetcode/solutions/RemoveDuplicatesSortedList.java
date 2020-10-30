
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 83
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 
    Time Complexity: O(n)
    Space Complexity: O(1)
	
*/

public class RemoveDuplicatesSortedList{
	public ListNode deleteDuplicates(ListNode head) {
		ListNode res = new ListNode(0);
		ListNode aux = res;
		
		while(head != null){
			while(head.next != null && head.val == head.next.val)head = head.next;
				
			aux.next = head;
			aux = aux.next;
			head = head.next;
		}
		
		aux.next = null;
		
		return res.next;
	}

}

