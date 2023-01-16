package week3.week3day2;
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacterNameAssignment4 {
		public static void main(String[] args) {
			String name = "Prakash";
			char[] charArray = name.toCharArray();
			Set<Character> val = new HashSet<Character>();
			for(int i =0; i<charArray.length; i++)
			{
				boolean add = val.add(charArray[i]);
			if(!add)
			{
				System.out.println(charArray[i]);
				val.remove(charArray[i]);
			}
			}
			System.out.println(val);
			}
}
