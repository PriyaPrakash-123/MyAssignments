package week4.week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdraganddrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//div[@id ='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id ='droppable']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, destination).perform();	
	}
}
