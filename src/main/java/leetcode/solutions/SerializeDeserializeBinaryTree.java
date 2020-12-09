package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 297
	https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/


public class SerializeDeserializeBinaryTree{

	public String serialize(TreeNode root) {
		if(root == null)return "#";
		return root.val + "," + serialize(root.left) + "," + serialize(root.right);
	}
	
	public String deserialize(TreeNode root) {
		Queue<String> queue = new LinkedList(Arrays.asList(root.split(",")));
		
		return deserialize(queue);
	}

	private TreeNode deserialize(Queue<String> queue){
		String val = queue.poll();
		if(val.equals("#"))return null;
		
		TreeNode root = new TreeNode(Integer.valueOf(val));
		root.left = deserialize(queue);
		root.right = deserialize(queue);
		
		return root;
	}	
}

