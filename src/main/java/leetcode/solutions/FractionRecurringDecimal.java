package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 166
	https://leetcode.com/problems/fraction-to-recurring-decimal/
    Time Complexity: O(d)
    Space Complexity: O(d)
*/

public class FractionRecurringDecimal{
	public String fractionToDecimal(int numerator, int denominator) {
		if(numerator == 0)return "0";
		StringBuilder res = new StringBuilder();
		Long n = new Long(numerator), d = new Long(denominator);
		if (n < 0 ^ d < 0)res.append("-");
		if(n%d == 0){ res.append(n / m); return res.toString(); }
		res.append(n/d).append(".");
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(Long r = n%d; r > 0; r%=d){
			if(map.constains.key(r)){
				res.insert(map.get(r),"(");
				res.append(")");
				break;
			}
			map.put(r, res.size());
			r*=10;
			res.append(r/10);
		}
		
		return res.toString();
	}
}