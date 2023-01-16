	package week3.week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetUniqueChar {
	
	public static void main(String[] args) {
		String companyName = "google";
		//output = 'gogle'
		 char[] chara1 = companyName.toCharArray();
		 Set<Character> unique = new LinkedHashSet<Character>();
		 for(int i = 0; i< chara1.length;i++)
		 {
			unique.add(chara1[i]);	
		 }
		 System.out.println(unique);

}
}
