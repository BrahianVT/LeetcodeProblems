

package leetcode.solutions;
import java.util.*;
/*
	20
	Number leecode problem: 102
	https://leetcode.com/problems/binary-tree-level-order-traversal/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/   
public class BinaryTreeLevelOrderTraversal{
	TreeMap<Integer, List<Integer>> map = new TreeMap();
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList();
		pre(root, 0);
		
		for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
			res.add(e.getValue());
		}
    }
	
	
	public void pre(TreeNode root, int deep){
		if(root == null)return;
		
		if(map.containsKey(deep) == null)map.put(deep, new ArrayList());
		map.get(deep).add(root.val);
		pre(root.left, deep +1);
		pre(root.right, deep +1);
	}
}