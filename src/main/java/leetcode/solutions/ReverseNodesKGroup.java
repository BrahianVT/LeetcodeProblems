

package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:25
	https://leetcode.com/problems/reverse-nodes-in-k-group/
   
   Time Complexity: O(n)
   Space Complexity: O(1)
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
public ReverseNodesKGroup{

	 public ListNode reverseKGroup(ListNode head, int k) {
		 
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode cur = res, prev = res, nex = res;
		int count = 0;
		while(cur.next != null){ count++; cur = cur.next; }
		
		while(count >= k){
			cur = prev.next;
			nex = cur.next;
			
			for(int i = 1; i < k; i++){
				cur.next = nex.next;
				nex.next = prev.next;
				prev.next = nex;
				nex = cur.nex;
			}
			prev = cur;
			count-= k;
		}
		
		return res.next;
	 }
}