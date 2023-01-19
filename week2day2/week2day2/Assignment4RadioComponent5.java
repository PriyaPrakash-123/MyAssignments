package week2.week2day2;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4RadioComponent5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Your most favorite browser
		driver.findElement(By.xpath("(//label[contains(text(),'Firefox')]/preceding-sibling::div)[1]")).click();
		
		//Find the default select radio button
		boolean defaultRadioButton = driver.findElement(By.xpath("(//input[@checked ='checked'])[4]")).isSelected();
		
		 System.out.println("Default Radio Button is :"  +defaultRadioButton);
		 
	}}