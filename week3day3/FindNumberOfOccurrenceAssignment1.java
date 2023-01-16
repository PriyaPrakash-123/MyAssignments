package week3.week3day3;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurrenceAssignment1 {
	public static void main(String[] args)
	{
		int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
		 //To Find the number of occurrence of each numbers
		//int key and value ** minus one=1, one=2, two=3, three=2,Four=1,Five=1,Six=2
		Map<Integer, Integer> mapOccurrence = new TreeMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int Key = nums[i];
			if(mapOccurrence.containsKey(Key))
			{
			Integer value = mapOccurrence.get(Key);
			mapOccurrence.put(Key, value+1);
			}
			else
			{
			mapOccurrence.put(Key,1);
			}
		}System.out.println(mapOccurrence);
	}
}