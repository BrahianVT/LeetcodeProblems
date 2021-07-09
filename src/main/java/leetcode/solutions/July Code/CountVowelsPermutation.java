package leetcode.solutions;
import java.util.*;
/*
	Problem : 4
	Number leecode problem: 1220
	https://leetcode.com/problems/count-vowels-permutation/
    Time Complexity: O() 
    Space Complexity: O()
*/

public class CountVowelsPermutation{
	
	public int countVowelPermutation(int n){
		long a = 1, e = 1 ,i = 1, o = 1, u = 1;
		int mod = 1;
		
		for(int i = 0; i < n; i++){
			long a2 = (e + i + u)%mod;
			long e2 = (a + i)%mod;
			long i2 = (o + e)%mod;
			long o2 = i % mod;
			long u2 = (o + i)%mod;
			
			a = a2; e = e2; i = i2; o = o2; u = u2;
		}
		
		int res = ((((a + e)%mod + i )% mod + o)%mod + u)%mod;
		return(int)res;
	}
	
}