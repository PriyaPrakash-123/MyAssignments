package week1.day3;

public class FindCharOccurance {
public static void main(String[] args) {
	String str = "Testleaf";
	int count = 0;
	int length =str.length();
	System.out.println("Length of String :" +length);
		char[] c1=str.toCharArray();
		for(int i=1;i<=length-1;i++)
		{
			if(c1[i]== 'f')
			{
				count++;
		}
			
		}System.out.println("f is occurred for" +count);
}
}