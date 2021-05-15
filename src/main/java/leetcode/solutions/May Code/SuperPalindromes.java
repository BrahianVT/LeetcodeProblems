
package leetcode.solutions;
import java.util.*;
/*
	8
	Number leecode problem: 906
	https://leetcode.com/problems/super-palindromes/

*/    

public class SuperPalindromes{
	public int superpalindromesInRange(String left, String right) {
		long l = Long.parseLong(left), r = Long.parseLong(right);
		long i = (int)Math.sqrt(l);
		int res = 0;
		if(isPalin(i) && i * i == l)res++;
		i++;
		
		for(; i*i <= r ;){
			long aux = nextPal(i);
			if(aux * aux <= r && isPalin(aux * aux))
				res++;
			
			i = aux + 1;
		}
		
		return res;
	}
	
	/*
	  	public int superpalindromesInRange(String left, String right) {
			int ans = 9 >= Long.parseLong(left) && 9 <= Long.parseLong(right)?1:0;
			for(int i = 1; i < 19684; i++){
				String num = Integer.toString(i, 3);
				if(isPalin(Long.parseLong(num))){
					long square = Long.parseLong(num) * Long.parseLong(num);
					if(square > Long.parseLong(right)) return ans;
					if(square >= Long.parseLong(left) && isPalin(Long.parseLong(square)))
						ans++;
				}
			}
		
			return ans;
		}
	
	*/
	
	private long nextPal(long l){
		String s = "" + l;
		int n = s.length();
		String half = s.substring(0, (n+ 1)/2);
		String reverse = new StringBuilder(half.substring(0, n/2)).reverse().toString();
		long first = Long.valueOf(half + reverse);
		if(first >= l)return first;
		
		String nextHalf = Long.toString(Long.valueOf(half) + 1);
		String reverseNextHalf = new StringBuilder(nextHalf.substring(0,n/2)).reverse().toString();
		long second = Long.valueOf(nextHalf + reverseNextHalf);
		return second;
	}
	
	private boolean isPalin(long number){
		long s = number;
		long aux;
		while(number > 0){
			aux = aux*10 + number%10;
			number/=10;
		}
		return s == aux;
	}
}