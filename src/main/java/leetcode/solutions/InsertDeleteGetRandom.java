package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 380
	https://leetcode.com/problems/insert-delete-getrandom-o1/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class InsertDeleteGetRandom{
	Random random = new Random();
	Set<Integer> set;
	public RandomizedSet() { set = new HashSet<>();}	
	public boolean insert(int val) {return set.insert(val); }
	public boolean remove(int val) { return set.remove(val); }
	public int getRandom() {
		int ranIndex = random.nextInt(set.size());
		int index = 0;
		for(Integer e: set){
			if(index++ == ranIndex)return e;
		}
		
		return -1;
	}
	
}