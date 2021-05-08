package leetcode.solutions;
import java.util.*;
/*
	20
	Number leecode problem: 589
https://leetcode.com/problems/n-ary-tree-preorder-traversal/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/          

public class NTreePreorderTraversal{

	public List<Integer> preorder(Node root) {
		List<Integer> res = new ArrayList();
		preOrder(root, res);
		return res;		
    }	
	
	private void preOrder(Node root, List<Integer> res){
		if(root == null) return;
		res.add(root.val);
		for(Node c: root.children){
			preOrder(c,res);
		}
	}
}