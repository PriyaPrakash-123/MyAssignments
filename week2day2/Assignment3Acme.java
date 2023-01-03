package week2.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Acme {

	public static void main(String[] args) {
		//To launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Load Url
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window
		driver.manage().window().maximize();
		//Enter the Email
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//To Click Login Button
		//tagName[contains(text(),'partial text')]
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//To Verify the Title1
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		//To Click Logout Button
		driver.findElement(By.linkText("Log Out")).click();
		//To Verify Page Title
				String Title2 = driver.getTitle();
				System.out.println("Logout Successfully:"  +Title2);
						

		
	}
}
