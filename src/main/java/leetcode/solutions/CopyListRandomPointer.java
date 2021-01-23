package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1328
	https://leetcode.com/problems/copy-list-with-random-pointer/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class CopyListRandomPointer{
	
	public Node copyRandomList(Node head) {
		return getCopy(head);
	}
	Map<Node,Node> map = new HashMap<>();
	public Node getCopy(Node head){
		if(head == null)return head;
		if(map.contains(head))return map.get(head);
		
		Node root = new Node(head.val);
		map.put(head, root);
		root.next = getCopy(head.next);
		root.random = getCopy(head.random);
		return root;
	}
	
}