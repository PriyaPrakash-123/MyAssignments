package week2.week2day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptionDropdown {

	public static void main(String[] args) {
		//To launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Load the Leaftaps Site Url 
		driver.get("https://www.leafground.com/select.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Dropdown =driver.findElement(By.className("ui-selectonemenu"));
		Select A1 = new Select(Dropdown);
		List<WebElement> Option = A1.getOptions();
		int Size = Option.size();
		System.out.println(Size);
		
		for(int i =1; i<=Size;i++)
		{
			if(i%2==0)
			{
			String text1 = Option.get(i).getText();
			System.out.println(text1);
			}
		}
	}
}