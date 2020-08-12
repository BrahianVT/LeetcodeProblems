


import java.util.*;

/**
   Number leecode problem:23
   https://leetcode.com/problems/merge-k-sorted-lists/
   
   Time Complexity: O(n log n), n = total nodes of all the lists
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
 
public class MergeKSortedLists{
		
	public ListNode mergeKLists(ListNode[] lists) {
		
		PriorityQueue<ListNode> pq = new PriorityQueue<>((p1, p2) -> p1.val - p2.val);
		
		for(ListNode list: lists){
			while(list != null){
				pq.offer(list);
				list = list.next;
			}
		}
		ListNode res = new ListNode(0);
		ListNode aux = res;
		while(!pq.isEmpty()){
			aux.next = pq.poll();
			aux = aux.next;
		}
		aux.next = null;
		
		return res.next;
	}
}