package week1.day1;

public class Mobile2 {
	
public void makecall() {
	System.out.println("Calling.....Dad ");
	//creating variables 
	String mobileModel = "Samsung";
	float mobileWeight = 250.5F;	
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}

public void sendMsg() {
	System.out.println("Sending Message....");
	//Creating Variables
	boolean isfullCharged = true;
	int mobileCost = 42000;
	System.out.println(isfullCharged);
	System.out.println(mobileCost);
}

//Creating main Method
public static void main(String[] args) {
	//Creation of Object for class
	Mobile2 Details = new Mobile2();
	Details.makecall();
	Details.sendMsg();
	System.out.println("This is my Mobile");
}
}
