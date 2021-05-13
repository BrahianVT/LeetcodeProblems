

package leetcode.solutions;
import java.util.*;
/*
	2
	Number leecode problem: 630
	https://leetcode.com/problems/course-schedule-iii/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    
public class CourseScheduleIII{
	public int scheduleCourse(int[][] courses) {
		Arrays.sort(courses, (p1,p2) -> p1[1] - p2[1]);
		int totalTime = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(p1, p2 -> p2 - p1);
		for(int i = 0; i < courses.length; i++){
			totalTime+=courses[i][0];
			pq.add(courses[i][0]);
			if(totalTime > courses[i][1])totalTime-=pq.poll();
		}
		return pq.size();
    }
	
}