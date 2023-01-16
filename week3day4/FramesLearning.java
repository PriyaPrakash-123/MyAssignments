package week3.week3day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesLearning {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id = 'iframeResult']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text =alert.getText();
		System.out.println(text);
		Thread.sleep(1000);
		alert.accept();
		String text1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text1.contains("You pressed"))
				{
				System.out.println("Alert Accepted");
				}
		else
		{
			System.out.println("Alert Cancelled");
		}
		}
		
	}

