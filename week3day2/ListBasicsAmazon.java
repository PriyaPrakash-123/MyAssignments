package week3.week3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBasicsAmazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		
		List<WebElement> mobPrice = driver.findElements(By.xpath("//span[@class = 'a-price-whole']"));
		int size = mobPrice.size();
		System.out.println("Size : " + size);
		
		for(WebElement each : mobPrice)
		{
			String text = each.getText();
			System.out.println(text);
		}
	}

}
