package leetcode.Solutions;

/**
   Number leecode problem: 2
   Link: https://leetcode.com/problems/add-two-numbers/
   
   Time Complexity: O(n)
   Space Complexity: O(n)
*/

public class AddTwoNumbers{
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		
		ListNode res = new ListNode(0);
		ListNode aux = res;
		int sum = 0;
		while(l1 != null && l2 != null){
			// The max value can be 18 whis this you get the carry that will be 1 
			sum/=10;
			
			if(l1 != null){
				sum+=l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null){
				sum+=l2.val;
				l2 = l2.next;
			}
			
			// just store one digit if the number is 11 store 1
			aux.next = new ListNode(sum%10);
			aux = aux.next;
		}
		// check if there is a last carry
		if(sum/10 == 1){
			aux.next = new ListNode(1);
		}
		
		return res.next;
	}
}
