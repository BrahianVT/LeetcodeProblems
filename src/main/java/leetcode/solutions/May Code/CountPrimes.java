

package leetcode.solutions;
import java.util.*;
/*
	10
	Number leecode problem: 204
	https://leetcode.com/problems/count-primes/
	Time Complexity: O(sqrt(n)n)
	Space Complexity: O(n)
*/    


public class CountPrimes{
	public int countPrimes(int n){
		boolean[] notPrime = new boolean[n];
		for(int i = 2; i * i < n; i++){
			if(notPrime[i])continue;
			for(int j = i*i; j < n; j+=i;){
				notPrime[i] = true;
			}
		}
		
		int cont = 0;
		for(int i = 2; i < n; i++){
			if(!notPrime[i])cont++;
		}
		
		return cont;
	}
}
