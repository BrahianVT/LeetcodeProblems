
package leetcode.solutions;
import java.util.*;
/*
	Problem : 18
	Number leecode problem: 282
	https://leetcode.com/problems/expression-add-operators/
    Time Complexity: O(n^2)
    Space Complexity: o(n^2)
*/


public class ExpressionAddOperators{
	
	public List<String> addOperators(String num, int target) {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    dfs(res, sb, num.toCharArray(), 0, target, 0, 0);
    return res;

	}
	
	public void dfs(List<String> res, StringBuilder sb, char[] num, int pos, int target, long prev, long multi){
		if(pos == num.length){
			if(target == prev)res.add(sb.toString());
			return;
		}
		long curr = 0;
		for(int i = pos; i < num.length; i++){
			if(num[pos] == '0' && i != pos)break;
			curr = 10 * curr + num[i] - '0';
			int len = sb.length();
			
			if(pos == 0){
				dfs(res, sb.append(curr), num, i +1, target, curr, curr);
			} else{
				dfs(res, sb.append("+").append(curr), num, i + 1, target, prev + curr, curr); 
				sb.setLength(len);
				dfs(res, sb.append("-").append(curr), num, i + 1, target, prev - curr, -curr); 
				sb.setLength(len);
				dfs(res, sb.append("*").append(curr), num, i + 1, target, prev - multi + multi * curr, multi * curr); 
				sb.setLength(len);
			}
		}
	}
}