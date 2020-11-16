package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 86
	https://leetcode.com/problems/partition-list/
    Time Complexity: O(n)
    Space Complexity: O(1)
	
*/
public class PartitionList{
	
	public ListNode partition(ListNode head, int x) {
		
		ListNode first = new ListNode(0), second = new ListNode(0);
		
		ListNode aux = res, iter = first, iter2 = second;
		
		while(head != null){
			if(head.val < x){
				iter = iter.next = head;
				head = head.next;
			} else {
				iter2 = iter2.next = head;
				head = head.next;
			}
		}
		iter.next = second.next;
		iter2.next = null;
		return first.next;
    }
}