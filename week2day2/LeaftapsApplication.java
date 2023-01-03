package week2.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsApplication {
public static void main(String[] args) {
	//To launch chrome Browser
			ChromeDriver driver = new ChromeDriver();
			//Load the Leaftaps Site Url
			driver.get("http://leaftaps.com/opentaps");
			//maximize the window
			driver.manage().window().maximize();
			//To Enter the UserName
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//To Enter the Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//To Click Login Button
			driver.findElement(By.className("decorativeSubmit")).click();
			//To Verify the Title1
			String Title1 = driver.getTitle();
			System.out.println(Title1);
			//Partial Link Text
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			//To Verify the Title2
			String Title2 = driver.getTitle();
			System.out.println(Title2);
			driver.findElement(By.linkText("Create Lead")).click();
			////To Verify the Title3
			String Title3 = driver.getTitle();
			System.out.println(Title3);
			//To Enter the Company Name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			//To Enter the First Name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshvik");
			//To Enter the Last Name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kishan");
			//Select from Dropdown
			WebElement dropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select s1  =new Select(dropdown);
			s1.selectByIndex(3);
			
			WebElement dropdown1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select s2  =new Select(dropdown1);
			s2.selectByValue("IND_INSURANCE");
			
			WebElement dropdown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select s3  =new Select(dropdown2);
			s3.selectByVisibleText("USD - American Dollar");
			
			//To click Create Lead Button
			driver.findElement(By.className("smallSubmit")).click();			
		}
}
