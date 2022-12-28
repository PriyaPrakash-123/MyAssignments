package week1.day1;

public class Bike4 {
	
	public void applyBrake() {
		System.out.println("Applied Break");
		}
    public void soundHorn() {
    	System.out.println("Sound Horn");
    	}

	
	public static void main(String[] args) {
		//Creating Object for Car Class
		Car4 obj1 = new Car4();
		obj1.applyBrake();
		obj1.soundHorn();
		
		//Creating Object for Bike Class 
		Bike4 obj2 = new Bike4();
		obj2.applyBrake();
		obj2.soundHorn();
	}

}
