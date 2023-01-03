package week1.day3;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		//Declare String Input
		String test = "changeme";
		int Length = test.length();
		char[] Char1 = test.toCharArray();
		
		for(int i = 1;i<=Length;i++ )
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				Char1[i]= Character.toUpperCase(Char1[i]);
			}
		System.out.println(Char1.toString());
		System.out.println(new String(Char1));
		}
		
	}

}
