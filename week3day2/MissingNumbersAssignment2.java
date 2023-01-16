package week3.week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbersAssignment2 {
	public static void main(String[] args) {
		
				int[] data = {1,2,4,5,5,4,6,5,8,9,10,2,4,8,5};
				Set<Integer> numbers = new TreeSet<Integer>();
				for (int i = 0; i < data.length; i++) {
					numbers.add(data[i]);
				}
				System.out.println("Sorted & Duplicate Removed : " +numbers);
				List<Integer> listvalue = new ArrayList<Integer>(numbers);
				System.out.println(listvalue);
				for(int i=0; i<listvalue.size()-1;i++){
					if((listvalue.get(i+1))!=(listvalue.get(i)+1))
							{
						System.out.println("Missing Number is : " +(listvalue.get(i)+1));
							}
				}
}	}
	