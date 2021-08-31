package leetcode.solutions;
import java.util.*;
/*
	Problem : 26
	Number leecode problem: 331
	https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class VerifyPreorderSerializationBinaryTree{
	
	 public boolean isValidSerialization(String preorder) {
        String[] eles = preorder.split(",");
		Stack<Integer> stack = new Stack<>();
		
		int i = 0;
		while(i < eles.length){
			String cur = eles[i];
			while(cur.contains("#") && !stack.isEmpty() && eles[stack.peek()].equals(cur)){
				stack.pop();
				if(stack.isEmpty())return false;
				stack.pop();
			}
			stack.push(i++);
		}
		
		return stack.size() == 1 && eles[stack.peek()].equals("#");
    }	
}