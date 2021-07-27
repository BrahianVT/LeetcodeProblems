

package leetcode.solutions;
import java.util.*;
/*
	Problem : 23
	Number leecode problem: 92
	https://leetcode.com/problems/reverse-linked-list-ii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class ReverseLinkedListII{
	 public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = null, l = null, r = null, cur = head;
		
		while(right != 1){
			if(left == 2)pre = cur;
			cur = cur.next; left--; right--;
		}
		l = pre!=null?pre.next:head;
		r = cur;
		cur = l; ListNode prev = r.next;
		while(cur != r){
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur; 
			cur = next;
		}
		cur.next = prev;
		if(pre == null)
			return r;
		else{
			pre.next = r;
			return head;
		}
    }
}
