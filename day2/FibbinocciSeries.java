package week1.day2;

public class FibbinocciSeries{
	public static void main(String[] args) {
	//initialize the values for variables
	int a1 = 0;
	int b1 = 1;
	int c1 = 0; 
	System.out.println(a1); 
	for(int i = 1; i <= 11; i++)
	{
		c1 = a1+b1;
		a1 = b1;
		b1 = c1;
		System.out.println(a1);
	}
}
}
