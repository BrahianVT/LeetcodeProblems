package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 60

	https://leetcode.com/problems/permutation-sequence/
    Time Complexity: O(nm)
    Space Complexity: O(nm)
*/

public class PermutationSequence{
	
	public String getPermutation(int n, int k){
		List<Integer> numbers = new ArrayList();
		
		for(int i = 0; i < n; i++){ numbers.add(i + 1); }
		
		
		int[] factorial = new int[n]; factorial[0] = 1;
		
		for(int i = 1; i < n; i++){ factorial[i] = factorial[i-1] * i; }
		
		k --; StringBuilder res = new StringBuilder();
		for(int i = n - 1; i >= 0; i--){
			int index = k / factorial[i];
			res.append(numbers.get(index));
			numbers.remove(index);
			k = k % factorial[i];
		}
		
		return res.toString();
	}
}
