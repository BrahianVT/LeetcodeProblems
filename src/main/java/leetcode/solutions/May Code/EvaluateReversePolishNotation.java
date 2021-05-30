
package leetcode.solutions;
import java.util.*;
/*
	25
	Number leecode problem: 150
	https://leetcode.com/problems/evaluate-reverse-polish-notation/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/

public class EvaluateReversePolishNotation{
	public int evalRPN(String[] tokens) {
        Stack<Integer> aux = new Stack();      
        for(String t: tokens){
                switch(t){
                    case "-": int a = aux.pop();aux.push(aux.pop() - a); break;
                    case "+": aux.push(aux.pop() + aux.pop()); break;
                    case "/": int b = aux.pop(); aux.push(aux.pop()/b); break;
                    case "*": aux.push(aux.pop() * aux.pop()); break;
                    default: aux.push(Integer.parseInt(t)); break;
                }    
        }
        
        return aux.pop();
    }
}