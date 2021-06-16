

package leetcode.solutions;
import java.util.*;
/*
	Problem : 10
	Number leecode problem: 729
	https://leetcode.com/problems/my-calendar-i/
    Time Complexity: O(nlog n) 
    Space Complexity: O(n)
*/
public class MyCalendar1{
	List<int[]> list;
	public MyCalendar() {
        list = new ArrayList();
    }
    
    public boolean book(int start, int end) {
        int i = binarySearch(int start);
		if(i < list.size() && start < list.get(i)[1] && end > list.get(i)[0])return false;
		
		list.add(i, new int[]{start, end});
		return true;
    }
	
	private binarySearch(int e){
		int s = 0, end = list.length;
		while(s < end){
			int m = (s + end) / 2;
			int[] aux = list.get(m);
			if(e >= aux[1])
				s = m + 1;
			else 
				end = m;
		}
		return s;
	}
} 