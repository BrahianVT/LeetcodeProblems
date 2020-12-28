
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 621
	https://leetcode.com/problems/task-scheduler/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class TaskScheduler{
	
	public int leastInterval(char[] tasks, int n) {
		int[] freq = new int[26];
		for(char c : tasks)freq[ c - 'A']++;
		
		PriorityQueue<Integer> pq = new PriorityQueue((p, p2)-> p2 - p);
		for(int f : freq)if(f != 0)pq.offer(f);
		
		int remaining = tasks.length, time = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		while(remaining > 0){
			Integer prev = map.get(time);
			if(prev != null)pq.offer(prev);
			Integer cur = pq.poll();
			if(cur != null){
					if( --cur > 0)map.put(time + n + 1, cur);
				remaining--;
			}
			time++;
		}
		
		return time;
	}

}










