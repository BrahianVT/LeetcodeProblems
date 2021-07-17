package leetcode.solutions;
import java.util.*;
/*
	Problem : 11
	Number leecode problem: 295
	https://leetcode.com/problems/find-median-from-data-stream/
    Time Complexity: O(n log n) 
    Space Complexity: O(n)
*/

public class FindMedianDataStream{
	
	PriorityQueue<Integer> max = new PriorityQueue(max, (p1, p2) -> p2 - p1);
	PriorityQueue<Integer> min = new PriorityQueue();
	public MedianFinder() {}
    
    public void addNum(int num) {
        max.offer(num);
		min.offer(max.poll());
		if(max.size() < min.size())
			max.offer(min.poll());
    }
    
    public double findMedian() {
        if(max.size() == min.size()) return (max.peek() + min.peek()) /2.0;
		else
			return max.peek();
    }
}