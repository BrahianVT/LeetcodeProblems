package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 952
	https://leetcode.com/problems/largest-component-size-by-common-factor/
    Time Complexity: O(N*sqrt(W)) 
    Space Complexity: O(n)
*/
public class LargestComponentSizeCommonFactor{
	int[] p;
	private int get(int x){
		return x == p[x]?x:(p[x] = get(p[x]));
	}
	private void add(int x, int y){
		p[get(x)] = p[get(y)];
	}
	public int largestComponentSize(int[] A) {
		int max = 0;
		for(int n: A)max = Math.max(max, n);
		p = new int[max + 1];
		for(int i = 1; i < p.length; i++)p[i] = i;
		
		for(int n: A){
			for(int i = (int)Math.sqrt(n); i>=2; i--){
				if(n % i == 0){
					add(n, i);
					add(n, n/i);
				}
			}
		}
		int res = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int n: A){
			int i = get(n);
			map.put(i, map.getOrDefault(i, 0) + 1);
			res = Math.max(res, map.get(i));
		}
		
		return res;
	}
}
