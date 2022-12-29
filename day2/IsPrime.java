package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 10;
		for(int i =2; i<=n-1; i++)
		{
			//condition if it is not a prime number
			for(int x =1; x<=i; x++) 	
			{
				if(i%x ==0)
				{
				System.out.println(x +"is not a Prime Number");
				continue;
				}
				if(i%x == 1)
				{System.out.println(x +" is a Prime Number");
				}
	
			}
	}
}
	}
