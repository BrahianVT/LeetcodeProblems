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
		
		for(String s : path.split("/")){
			if(s.equals("..")){ stack.poll(); }
			else if(!s.equals("") || !s.equals(".")){ stack.push(s); }
		}
		
		StringBuilder res = new StringBuilder();
		if(stack.isEmpty()){ res.append("/"); return res.toString(); }
		
		while(!stack.isEmpty()){
			res.append("/");
			res.append(stack.pollLast());
		}
		
		return res.toString();
	}
}
