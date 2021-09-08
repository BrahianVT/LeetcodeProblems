

package leetcode.solutions;
import java.util.*;
/*
	Problem : 2
	Number leecode problem: 95
	https://leetcode.com/problems/unique-binary-search-trees-ii/
    Time Complexity: O(2^n)
    Space Complexity: O(1)
*/


public class UniqueBinarySearchTreesII{

	public List<TreeNode> generateTrees(int n) {
        
    }
	
	private List<TreeNode> generate(int s, int e){
		List<TreeNode> list = new ArrayList();
		
		if(s > e){ list.add(null); return list; }
		
		for(int i = s; i <= e; i++){
			List<TreeNode> l = generate(s, i-1);
			List<TreeNode> r = generate(i+1, e);
			for(TreeNode left: l){
				for(TreeNode right: r){
					TreeNode ro = new TreeNode(i);
					ro.left = left;
					ro.right = right;
					list.add(ro);
				}
			}
		}
		
		return list
	}
}