
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 602
	https://leetcode.com/problems/baseball-game/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class BaseballGame{
	public int calPoints(String[] ops){
		Stack<Integer> s = new Stack<>();
		int res = 0;
		for(String o: ops){
			case "+":
				Integer prev = s.pop(), next = prev + s.peek(); 
				s.push(prev); s.push(next);
			break;
			case "D":
				s.push(s.peek() * 2);
			break;
			default:
			s.push(Integer.parseInt(o));
			break;
		}
		
		while(!s.isEmpty())res+=s.pop();
		return res;
	}
}
