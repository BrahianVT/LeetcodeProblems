package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 729
	https://leetcode.com/problems/my-calendar-i/
    Time Complexity: O(log n)
    Space Complexity: O(n)
*/

public class CalendarI{
	List<int[]> eles = new ArrayList();
	public boolean book(int start, int end){
		int i = binarySearch(start, end);
		if(i < eles.size() && start < eles.get(i)[1] && end > eles.get(i)[0])
			return false;
		else {
			eles.add(i, new int[]{start, end});
			return true;
		}	
	}
	private int binarySearch(int a, int b){
		int s = 0, e = eles.size();
		while(s < e){
			int m = (e + s) / 2;
			int[] cur = eles[m];
			if(a >= cur[1]) s = m +1;
			else e = m;
		}
		return start;
	}
}