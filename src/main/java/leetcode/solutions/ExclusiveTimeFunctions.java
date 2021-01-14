
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 636
	https://leetcode.com/problems/exclusive-time-of-functions/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class ExclusiveTimeFunctions{
		
	public int[] exclusiveTime(int n, List<String> logs){
		int[] res = new int[n];
		Stack<Integer> stack = new Stack();
		int prev = 0;
		for(String l : logs){
			String[] ele = l.split(":");
			if(!stack.isEmpty())res[stack.peek()]+= Integer.parseInt(ele[2]) - prev;
			prev = Integer.parseInt(ele[2]);
			if(ele[1].equals("start"))stack.push(Integer.parseInt(ele[0]));
			else {
				res[stack.pop()]++;
				prev++;
			}
		}
		return res;
	}
}