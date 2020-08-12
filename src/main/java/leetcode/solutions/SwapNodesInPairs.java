package leetcode.Solutions;
import java.util.*;

/**
   Number leecode problem:24
   https://leetcode.com/problems/swap-nodes-in-pairs/
   
   Time Complexity: O(n)
   Space Complexity: O(n)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class SwapNodesInPairs{

    public ListNode swapPairs(ListNode head) {
		 
		return swapNodes(head);
		   
	}

	private ListNode swapNodes(ListNode n1){
		if(n1 == null || n1.next == null){ return n1; }
		
		ListNode n2 = n1.next;
		n1.next = swapNodes(n2.next);
		
		n2.next = n1;
		
		return n2;
	}
}