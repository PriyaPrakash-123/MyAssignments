package week1.day2;
public class Calculator {
	public int addThreeNumbers(int i1, int i2, int i3) {
		return i1+i2+i3;
	}
    public int multiply(int a, int b) {	
    	return a*b;
    }
    public void divide()
    {
    	int x = 10;
    	int y = 5;
    	int z = x/y;
    	System.out.println("Division:" +z);
    	
    }
    public static void main(String[] args) {
    	Calculator calc = new Calculator();
    	int add = calc.addThreeNumbers(10,20,5);
    	System.out.println("Addition:" +add);
    	int mult = calc.multiply(2, 3);
    	System.out.println("Multiply:" +mult);
    	calc.divide();
  
	}
}

