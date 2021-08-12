

package leetcode.solutions;
import java.util.*;
/*
	Problem : 6
	Number leecode problem: 877
	https://leetcode.com/problems/n-ary-tree-level-order-traversal/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class NTreeLevelOrderTraversal{

	public class List<List<Integer>> levelOrder(Node root){
		List<List<Integer>> res = new ArrayList();
		if(root == null)return res;
		
		Queue<Node> q = new LinkedList();
		
		q.add(root);
		while(!q.isEmpty()){
			List<Integer> aux = new ArrayList();
			for(int i = q.size(); i > 0; i--){
				Node a = q.poll();
				aux.add(a.val);
				for(Node b: a.children)q.add(b);
				
			}
		}
		
		return res;
	}
}