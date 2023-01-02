package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafPlatform {

	public static void main(String[] args) {
		//To launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load Testleaf Url
		driver.get("https://platform.testleaf.com/#/");
		//To maximize the window
		driver.manage().window().maximize();
		//To click on Signin
		driver.findElement(By.xpath("position: absolute; inset: 0px; cursor: default;")).click();
		
	}
}
