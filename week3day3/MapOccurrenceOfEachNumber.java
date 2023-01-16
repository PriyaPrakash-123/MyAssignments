package week3.week3day3;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class MapOccurrenceOfEachNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,1,5,6,2};
		 //To Find the occurrence of each numbers
		//int key and value ** one=2, two=3, three=1,Five=1,Six=1 
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int Key = nums[i];
			if(map.containsKey(Key))
			{
			Integer value = map.get(Key);
			map.put(Key, value+1);
			}
			else
			{
			map.put(Key,1);
			}
		}System.out.println(map);
		//Single occuring numbers
		for(Entry<Integer, Integer> eachEntry:map.entrySet())
		{
			if(eachEntry.getValue()==1)
			{System.out.println(eachEntry.getKey());
			}
		}
		//find maximum occurring number
		int maxoccurKey = 0;
		int maxoccurValue = 0;
		for(Entry<Integer, Integer> maxoEntry:map.entrySet())
		{
			if(maxoEntry.getValue()>maxoccurKey)
			{
				maxoccurKey = maxoEntry.getValue();
				maxoccurValue = maxoEntry.getKey();
			}
		}	
			System.out.println("Max Occurring : " +maxoccurValue+ "Two is occurred " +maxoccurKey +"times");	
			}

}