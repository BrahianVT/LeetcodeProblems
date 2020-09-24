package leetcode.solutions;


/**
 Number leecode problem: 7
   https://leetcode.com/problems/reverse-integer/
    Time Complexity: O(n)
   Space Complexity: O(1)
*/
public class ReverseInteger{
	
	public int reverse(int x) {
		
		int res = 0, aux = 0;
		
		while(x != 0){
			
			int digit = x %10;
			
			aux = res* 10 + digit;
			
			// Validate the overflow
			if(res != (aux - digit) /10){ return 0; }
			
			res = aux; x/=10;
		}
		
		return res;
	}
	
}
