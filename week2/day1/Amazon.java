package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		//To launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Load the Amazon Site Url
		driver.get("https://www.amazon.com/");
		//maximize the window
		driver.manage().window().maximize();
		//To signin 
		driver.findElement(By.className("a-button-text")).click();
		//To verify the Title of the page
	String title = driver.getTitle();
	System.out.println(title);
	//To Enter the UserName
	driver.findElement(By.id("ap_email")).sendKeys("priyaprakash1407@gmail.com");
	//To Continue
	driver.findElement(By.id("continue")).click();
	//To Enter the password
		driver.findElement(By.id("ap_password")).sendKeys("Rabbitcat123@");
	//To signin
		driver.findElement(By.id("signInSubmit")).click();
		
		
	}

}
