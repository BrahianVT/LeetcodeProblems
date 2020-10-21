package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 71
	https://leetcode.com/problems/simplify-path/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/


public class SimplifyPath{
	public String simplyfyPath(String path){
		Deque<String> stack = new LinkedList();
		
		for(String s : psth.split("/")){
			if(s.equals("..")){ stack.poll(); }
			else if(!s.equals("")){ stack.push(s); }
		}
		
		while(!stack.isEmpty()){
			res.append("/");
			res.append(stack.pollLast());
		}
		
		return res.toString();
	}
}