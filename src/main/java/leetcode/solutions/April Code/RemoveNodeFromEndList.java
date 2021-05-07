


package leetcode.solutions;
import java.util.*;
/*
	18
	Number leecode problem: 19
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    Time Complexity: O(m) 
    Space Complexity: O(m)
*/
public class RemoveNodeFromEndList{
	
	int auxN = 0;
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head.next == null)return null;
		
		return removeNode(head, n);
    }
	
	private removeNode(ListNode head, int n){
		if(head.next == null){
			auxN++;
			if(n == 1)return null;
			return head;
		}
		
		head.next = removeNode(head.next, n);
		auxN++;
		if(auxN == n){
			return head.next;
		} else{
			return head;
		}
	}
}