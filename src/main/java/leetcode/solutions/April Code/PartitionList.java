
package leetcode.solutions;
import java.util.*;
/*
	14
	Number leecode problem: 86
	https://leetcode.com/problems/partition-list/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class PartitionList{
	
	public ListNode partition(ListNode head, int x) {
		ListNode res = new ListNode(0);
		ListNode l = new ListNode(0), r = new ListNode(0);
		ListNode l2 = l, r2 = r;
		while(head != null){
			if(head.val < x){
				l2.next = head; l2 = l2.next;
			} else {
				r2.next = head; r2 = r2.next;
			}
		}
		s1.next = r2.next;
		r2.next = null;
		return l.next;
    }
}
