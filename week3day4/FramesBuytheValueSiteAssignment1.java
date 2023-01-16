package week3.week3day4;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FramesBuytheValueSiteAssignment1 {
public static void main(String[] args) throws InterruptedException {
		//disable browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT')]")).click();
		//driver.findElement(By.xpath("(//input[@class = 'input-group-field input__field-2'])[1]")).sendKeys("Hamdard Hing");
		//driver.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
		//driver.findElement(By.xpath("(//div[@class = 'product-content'])[2]")).click();
		//Handle Frame
		Thread.sleep(2000);
		//WebElement eleiframe = driver.findElement(By.xpath("//div[@id='hubspot-messages-iframe-container']//iframe"));
		driver.switchTo().frame(1); 
		driver.findElement(By.xpath("//div[@class='VizExIcon__IconWrapper-g7wiag-0 gCKEVu']")).click();
		//driver.findElement(By.xpath("//div[@class = 'initial-message-bubble']/button")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'wk_zipcode']")).sendKeys("600041");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Cart']/parent::button)[1]")).click();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='View Cart']"));
		driver.executeScript("arguments[0].click();",findElement);
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		//Handle alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}
}
