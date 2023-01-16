package week3.week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingCollectionAssignment5 {
		public static void main(String[] args) {
				String[] Values = {"HCL", "Wipro", "Aspire Systems", "CTS"};
				int len = Values.length;
				Set<String> words = new TreeSet<String>();
				for(int i=0; i<len; i++)
				{
					words.add(Values[i]);
				}
				System.out.println(words);
				List<String> arrList = new ArrayList<String>(words);
				int size = arrList.size();
				System.out.println("Size of List : "+size);
				for(int i=size-1; i>=0; i--)
				{
					System.out.println(arrList.get(i)+ " ");
				}
			}

	}

