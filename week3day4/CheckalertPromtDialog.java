package week3.week3day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckalertPromtDialog {
	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//************Prompt Alert Dialog*****************//
			driver.findElement(By.xpath("(//span[@class = 'ui-button-text ui-c'])[6]")).click();
			//switch control to alert
			Alert alert = driver.switchTo().alert();
			//get text from popup
			String text = alert.getText();
			System.out.println(text);
			
			//Enter Name in text box and accept the alert
			alert.sendKeys("Joshvik");
			alert.accept();
			String text1 = driver.findElement(By.xpath("//span[text() = 'User entered name as: Joshvik']")).getText();
			if(text1.contains("Joshvik"))
					{
					System.out.println("Alert Accepted");
					}
			else
			{
				System.out.println("Alert Cancelled");
			}
		
}
}