package leetcode.solutions;
import java.util.*;
/*
	26
	Number leecode problem: 1689
	https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
	Time Complexity: O(n)
	Space Complexity: O(1)
*/

public class PartitioningMinimumNumberDeciBinaryNumbers{
	
	public int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }
}
