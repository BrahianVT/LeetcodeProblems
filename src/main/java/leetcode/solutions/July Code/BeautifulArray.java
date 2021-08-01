

package leetcode.solutions;
import java.util.*;
/*
	Problem : 28
	Number leecode problem: 932
	https://leetcode.com/problems/beautiful-array/
    Time Complexity: O(2n)
    Space Complexity: O(n)
*/



public class BeautifulArray{	
	public int[] beautifulArray(int n) {
		ArrayList<Integer> res = new ArrayList();
		res.add(1);
		
		while(res.size() < n){
			ArrayList<Integer> tmp = new ArrayList();
			for(int i: res)if(i * 2 -1 <= n)tmp.add(i*2-1);
			for(int i: res)if(i*2 <= n)tmp.add(i *2);
			res = tmp;
		}
		
		return res.stream().mapToInt(i -> i).toArray();
    }

}