package week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Facebook {
	public static void main(String[] args) {
		
		//To launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Load the Facebook Site Url https://www.facebook.com/
		driver.get("https://en-gb.facebook.com");
		//maximize the window
		driver.manage().window().maximize();
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on Create New Button "//button[contains(text(),'Login')]"
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		//Enter firstname
		driver.findElement(By.name("firstname")).sendKeys("Joshvik");
		//Enter lastname
		driver.findElement(By.name("lastname")).sendKeys("Kishan");
		//Enter mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("912345678");
		//Enter Password
		driver.findElement(By.id("password_step_input")).sendKeys("Lion@123");
		//Handle all the 3dropdown
		
		WebElement Date = driver.findElement(By.name("birthday_day"));
		Select s1  =new Select(Date);
		s1.selectByIndex(17);
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select s2  =new Select(Month);
		s2.selectByValue("10");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select s3  =new Select(Year);
		s3.selectByVisibleText("2018");
		
		//Select the radio Button
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}
}
