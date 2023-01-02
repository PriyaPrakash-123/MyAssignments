package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {
	public static void main(String[] args) {
		//To launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the Leaftaps Site Url
		driver.get("http://leaftaps.com/opentaps");
		//maximize the window
		driver.manage().window().maximize();
		//To Enter the UserName
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//To Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//To Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//To Verify the Title
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}
