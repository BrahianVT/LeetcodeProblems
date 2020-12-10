package leetcode.solutions;
import java.util.*;

/*
	Number leecode problem: 257
	https://leetcode.com/problems/binary-tree-paths/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BinaryTreePaths{
	public List<String> binaryTreePaths(TreeNode root) {    
        List<String> res = new ArrayList<>();

        return res;
	}
	
	private void dfsFindPaths(TreeNode root, List<String> res, String aux){
		
		if(root == null)res.add(aux + root.val); return;
		
		if(root.left != null){
			StringBuilder l = new StringBuilder(aux);
			l.append("->").append(root.val);
			dfsFindPaths(root, res, l.toString());
		}
		if(root.right != null){
			StringBuilder r = new StringBuilder(aux);
			r.append("->").append(root.val);
			dfsFindPaths(root, res, r.toString());
		}
	}

}






