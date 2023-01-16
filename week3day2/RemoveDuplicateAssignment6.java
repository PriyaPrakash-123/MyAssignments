package week3.week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateAssignment6 {
	
		public static void main(String[] args) {		
			String companyname = "PayPal India";
			char[] letters = companyname.toCharArray();
			System.out.println("Characters in companyname : " +companyname);
			Set<Character> uniquecharset = new TreeSet<Character>();
			Set<Character> duplicatecharset = new TreeSet<Character>();
			for(int i =0; i<letters.length; i++)
			{
				if(!uniquecharset.contains(letters[i]))
				{
				uniquecharset.add(letters[i]);
				}
				else
				{
				duplicatecharset.add(letters[i]);
				}
			}
			System.out.println("Unique Characters : " +uniquecharset);
			System.out.println("Duplicate Characters : " +duplicatecharset);
			
			List<Character> uchar = new ArrayList<Character>(uniquecharset);
			List<Character> dupchar = new ArrayList<Character>(duplicatecharset);
			
			for(int i =0; i<uchar.size(); i++) {
				for(int j=0; j<dupchar.size(); j++) {
					
					if(uchar.get(i)==dupchar.get(j))
					{
						uchar.remove(i);
					}
				}
			}
			System.out.println("Unique Characters after removed duplicate value from it: " +uchar);
			for(int k =0; k<uchar.size(); k++) {
				if((uchar.get(k)).equals(' '))
				{
					uchar.remove(k);
				}
			}System.out.println("Unique Characters after removed space : " +uchar);
		}

	}