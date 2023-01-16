package week3.week3day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestAssignment1 {
		public static void main(String[] args) {
			
			int[] data = {3,2,11,4,6,7,2,3,3,6,7};  // Here is the input //output= 7; 
			Set<Integer> uniqueset = new TreeSet<Integer>();
			for(int i=0; i<data.length; i++)
			{
				uniqueset.add(data[i]);
			}
			System.out.println("Unique Set Elements : " +uniqueset); //Set removes duplicates and print only unique
			
			List<Integer> Elementlist = new ArrayList<Integer>();
			Elementlist.addAll(uniqueset);
			
			System.out.println("Element from Set into List format : " +Elementlist);
			int size = Elementlist.size();
			System.out.println(size);
			int index = Elementlist.size()-2;
			int Value = Elementlist.get(index);
			System.out.println("Second Largest Element is " +Value);

		}}
