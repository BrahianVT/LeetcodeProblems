


package leetcode.solutions;
import java.util.*;
/*
	Problem : 18
	Number leecode problem: 927
	https://leetcode.com/problems/three-equal-parts/submissions/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/

public class ReverseNodeskGroup{

	
	 public ListNode reverseKGroup(ListNode head, int k) {
		 
		 ListNode res = new ListNode(0);
		 res.next = head;
		 ListNode prev = res, cur = head, nex = res;
		 
		 int count = 0;
		 while(cur != null){ cur= cur.next; count++; }
		 
		 while(count >= k){
			 cur = prev.next;
			 nex = cur.next;
			 
			 for(int i = 1; i < k; i++){
				 cur.next = nex.next;
				 nex.next = prev.next;
				 prev.next = nex;
				 nex = cur.next;
			 }
			 prev = cur;
			 size-=k;
		 }
		 
		 return res.next;
	 }
}