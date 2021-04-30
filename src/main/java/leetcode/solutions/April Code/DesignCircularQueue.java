package leetcode.solutions;
import java.util.*;
/*
	4
	Number leecode problem:622
	https://leetcode.com/problems/design-circular-queue
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class DesignCircularQueue{
	final int a[];
	int front, rear = -1, len = 0;
	public DesignCircularQueue(int k){ a = new int[k]; }
	
	public boolean enQueue(int val){
		if(isFull())return false;
		
		rear = (rear + 1) %a.length;
		a[rear] = val; len++;
		return true;
	}
	
	public boolean deQueue(){
		if(isEmpty())return false;
		
		front = (front + 1) % a.length;
		len--;
		return true;
	}
	
	public int Front(){ return isEmpty()?-1:a[front]; } //first value
	public int Rear(){ return isEmpty()?-1:a[rear]; } // last Value
	public boolean isEmpty(){ return 0 == len; }
	public boolean isFull(){ return len == a.length; }
}