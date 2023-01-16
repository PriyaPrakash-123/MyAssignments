package week3.week3day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumberAssignment2 {
public static void main(String[] args) {
	//Find the most duplicate number
	String alph = "abbaba";
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	char[] charArray = alph.toCharArray();
	for(int i=0; i<charArray.length; i++)
	{	
		char Key = charArray[i]; //charArray[0] = a
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
	//find maximum occurring number
			char maxoccurKey = 0;
			int maxoccurValue = 0;
			for(Entry<Character, Integer> maxoEntry:map.entrySet())
			{
				if(maxoEntry.getValue()>maxoccurKey)
				{
					maxoccurKey = maxoEntry.getKey();
					maxoccurValue = maxoEntry.getValue();
				}
			}	
				System.out.println("Max Occurring : " +maxoccurKey+ " is occurred " +maxoccurValue +" times");	
				}
	}
