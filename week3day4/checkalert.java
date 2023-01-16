package week3.week3day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkalert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//************Confirm Alert Dialog*****************//
		driver.findElement(By.xpath("(//span[@class = 'ui-button-text ui-c'])[2]")).click();
		//switch control to alert
		Alert alert = driver.switchTo().alert();
		//get text from popup
		String text = alert.getText();
		System.out.println(text);
		
		//dismiss alert
		alert.dismiss();
		String text1 = driver.findElement(By.xpath("//span[text() = 'User Clicked : Cancel']")).getText();
		if(text1.contains("User Clicked : Cancel"))
				{
				System.out.println("Alert Canceled");
				}
		else
		{
			System.out.println("Alert Accepted");
		}
		}
	
		// Click Show(Prompt dialog)
		//Alert alert1 = driver.switchTo().alert();
		//get text from popup
		//String text1 = alert.getText();
		//System.out.println(text1);
		
		
		 /* Load this url(https://www.leafground.com/alert.xhtml)
		
			   
			    enter your name in the text box of the alert
			    accept the alert
			    get the text to Confirm     
	*/
	}

