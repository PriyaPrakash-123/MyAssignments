package week2.week2day4;

public class MyVehicles {
	public static void main(String[] args) {
		AshokLeyland ashok = new AshokLeyland();
		//Value Pull from AshokLeyland Class
		ashok.Location();
		ashok.SpareParts();
		//Value Pull form Truck Class
		ashok.Trucktype();
		//Value pull from Vehicle Class
		ashok.drive();
		ashok.applyBrake();
		
		System.out.println("-------------------");
		
		Mahindra Mahind = new Mahindra();
		//Values pull from Mahindra Class
		Mahind.Cars();
		//Value pull from Jeep Class
		Mahind.JeepType();
		//Value pull from Vehicle Class
		Mahind.drive();
		Mahind.applyBrake();
	}
}
