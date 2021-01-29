
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 652
	https://leetcode.com/problems/find-duplicate-subtrees/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class FindDuplicateSubtreesFindDuplicateSubtrees{
	List<TreeNode> res = new ArrayList();
	Map<String, Integer> map = new HashMap();
	public List<TreeNode> findDuplicates(TreeNode root){
		dfs(root);
		return res;
	}
	private String dfs(TreeNode root){
		if(root == null)return "N";
		String hash = root.val + ","+dfs(root.left) + "," + dfs(root.right);
		map.put(hash, map.getOrDefault(hash, 0) + 1);
		if(map.get(hash) == 2)res.add(root);
		
		return hash;
	}
}