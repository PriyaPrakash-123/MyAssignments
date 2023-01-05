package week2.week2day4org.system;

public class DesktopSingleInheritanceMethod extends ComputerSingleInheritanceMethod {
	public void desktopSize() {
		System.out.println("The Desktop Size should be displayed");
		
	}
    public static void main(String[] args) {
    	DesktopSingleInheritanceMethod desk = new DesktopSingleInheritanceMethod();
    	desk.desktopSize();
    	desk.ComputerModel();
	}
}
