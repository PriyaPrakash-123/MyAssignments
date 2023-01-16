package week3.week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordAssignment3 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textval = text.split(" ");
		
		Set<String> unique = new LinkedHashSet<String>();
		for(String each : textval)
		{
			unique.add(each);
		}
		System.out.println(unique);
		}
	}

