package leetcode.solutions;
import java.util.*;
/*
	Problem : 29
	Number leecode problem: 922
	https://leetcode.com/problems/sort-array-by-parity-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/



public class SplitLinkedListParts{
	
	public ListNode[] splitListToParts(ListNode head, int k) {
		int size = 0;
		ListNode aux = head;
		while(aux != null){ size++; aux = aux.next; }
		
		int each = size/k, remaining = size % k;
		aux = head;
		ListNode[] res = new ListNode[k];
		if(size < k){
			each = 1; remaining = 0;
		}
		
		for(int i = 0; i < k; i++){
			res[i] = head;
			for(int j = 0; j < each-1; j++)head = head.next;
			
			if(i < remaining && head != null)head = head.next;
			
			if(head != null){
				ListNode aux2 = head.next;
				head.next = null;
				head = aux2; 
			}
		}
		
		return res;
    }
}