package week1.day1;

public class Mobile {
	public void sendSMS() {
		System.out.println("SMS Sent : Good Vibes ");
	}
	public void takeSnap() {
		System.out.println("Snap : Smile Please");
	}
	public static void main(String[] args) {
		Mobile messages = new Mobile();
		messages.sendSMS();
		messages.takeSnap();
		
	}

}
