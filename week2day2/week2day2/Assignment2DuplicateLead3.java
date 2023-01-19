package week2.week2day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DuplicateLead3 {
	public static void main(String[] args) throws InterruptedException {
		
	        //To launch chrome driver
			ChromeDriver driver = new ChromeDriver();
			//Load the Leaftaps Site Url 
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the window
			driver.manage().window().maximize();
			//Add Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//To Enter the UserName
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//To Enter the Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//To Click Login Button
			driver.findElement(By.className("decorativeSubmit")).click();
			//To Verify the Title1
			String Title1 = driver.getTitle();
			System.out.println("Once Login it redirect to "+"---" +Title1+"----"+ "Page");
			//Partial Link Text
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			//Click on Leads link
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			
			//To Verify the Title2
			String Title2 = driver.getTitle();
			System.out.println("After click on Leads, it redirect to"+"---"+Title2+"---"+"Page");

			//Click Find leads
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			//To Verify the Title3
			String Title3 = driver.getTitle();
			System.out.println("After click on Find Leads it move to "+"---"+Title3+"---"+"Page");

			//Click Email
			driver.findElement(By.xpath("//span[text()='Email']")).click();
			
			Thread.sleep(3000);
			//Enter Email
			driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("Test@testleaf.com");
			
			Thread.sleep(5000);
			//Click Find leads Button
			driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
			
			//Capture name of First Resulting lead

			String LeadId1 = driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).getText();
			System.out.println("LeadId:" +LeadId1);
			
			Thread.sleep(5000);
			//Click on First Resulting Lead
			driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).click();
			
			//Click Duplicate Lead
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			
			//To Verify the Title4
			String Title4 = driver.getTitle();
			System.out.println("Click Duplicate redirect to : "+"==="+Title4+"==="+"Page");
			
			//Click Create Lead
			driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
			
			Thread.sleep(6000);
			//Confirm Duplicate lead is created & appears 
			String Value1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			System.out.println("Duplicate Lead : " +Value1);
			
			Thread.sleep(5000);
			if(LeadId1.equals(Value1))
			{System.out.println("Lead is successfully Duplicated");
			}
			else
			{System.out.println("Duplicate not done ");
			}
			driver.close();
}
}