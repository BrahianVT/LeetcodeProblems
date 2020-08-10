
package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:20
   Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
   
   Time Complexity: O(n)
   Space Complexity: O(n)
*/

public class RemoveNodeFromEndList{
	
	int auxSize = 1;
	boolean increase = false;
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if( head.next == null){ return null; }
		
		return remove(head, n);
	}
	
	private void remove(ListNode head, int n){
		
		if(head.next == null){
			if(n == 1){ return null; }
			auxSize++; increase = true;
			return head;
		}
		
		head.next = remove(head.next, n);
		
		if(increase && auxSize == n){
			increase = false; 
			return head.next;
		}
		
		if(increase){ auxSize++; }
		return head;
	}
}