package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 559
	https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class MaximumDepthNTree {
	public int maxDepth(Node root){
		if(root == null || root.children.size() == 0)return root == null?0:1;
		int max = 0;
		for(int i = 0; i < root.children().size(); i++){
			max = Math.max(max, maxDepth(root.children.get(i)));
		}
		return max + 1;
	}
}