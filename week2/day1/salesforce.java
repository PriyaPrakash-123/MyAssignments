package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	public static void main(String[] args) {
		//To launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the Salesforce Site Url
		driver.get(" https://login.salesforce.com");
		//maximize the window
		driver.manage().window().maximize();
		//To Enter the UserName
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//To Enter the Password
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		//To Click Login Button
		driver.findElement(By.id("Login")).click();
		//To Verify the Title
		String Title = driver.getTitle();
		System.out.println(Title);
	}
}
