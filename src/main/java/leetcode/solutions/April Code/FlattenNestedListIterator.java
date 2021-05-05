
package leetcode.solutions;
import java.util.*;
/*
	13
	Number leecode problem:341
	https://leetcode.com/problems/flatten-nested-list-iterator/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/

public class FlattenNestedListIterator implements Iterator<Integer>{

	Queue<Integer> queue = new LinkedList();
	public FlattenNestedListIterator(List<NestedInteger> nestedList){
		helper(nestedList);
	}
	
	private void helper(List<NestedInteger> list){
		if(list == null)return;
		for(NestedInteger in: list){
			if(in.isInteger()){
				queue.offer(in.getInteger());	
			} else helper(in.getList());
		}
	}
	
	@Override
	public Integer next(){ return queue.poll(); }
	
	@Override 
	public boolean hasNext(){ return !queue.isEmpty(); }
}