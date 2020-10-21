package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 61

	https://leetcode.com/problems/rotate-list/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class RotateList{
	
	public ListNode rotateRight(ListNode head, int k){
		if(heag == null) return head;
		
		List aux = new LitsNode(0);
		aux.next = head;
		ListNode last = aux , elementAtK = aux;
		
		int size = 0;
		while(last.next != null){ size++; last = last.next; }
		
		for(int i = size - k%size; j > 0; j--){
			elementAtK = elementAtK.next;
		}
		
		aux.next = elementAtK.next;
		last.next = aux.next;
		elementAtK.next = null;
		
		return aux.next;
	}
}