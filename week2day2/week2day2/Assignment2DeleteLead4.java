package week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DeleteLead4 {
	public static void main(String[] args) throws InterruptedException{
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
		//To Verify the Title2
			String Title2 = driver.getTitle();
			System.out.println("It redirect to"+"---"+Title2+"---"+"Page, after click on first resulting Leads");

		//Click on Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//To Verify the Title3
			String Title3 = driver.getTitle();
			System.out.println("After click on Leads, it redirect to"+"---"+Title3+"---"+"Page");

		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//To Verify the Title4
			String Title4 = driver.getTitle();
			System.out.println("Once we click on find leads, it redirect to"+"---"+Title4+"---"+"Page");

			//Click Phone
			driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
			
			Thread.sleep(3000);
			//Enter PhoneNumber
			driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys("04");
			driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("222");
			
			Thread.sleep(5000);
			//Click Find leads Button
			driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
			
			Thread.sleep(5000);
			
			//Capture name of First Resulting lead
			String LeadId1 = driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).getText();
			System.out.println("LeadId:" +LeadId1);
			
			Thread.sleep(5000);
			//Click on First Resulting Lead
			driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).click();
			
			//To Verify the Title5
			String Title5 = driver.getTitle();
			System.out.println("It redirect to"+"---"+Title5+"---"+"Page, while clicking on first resulting Leads");
			
			Thread.sleep(8000);
			//Click on Delete
			driver.findElement(By.xpath("//a[@class ='subMenuButtonDangerous']")).click();
			
			Thread.sleep(2000);
			//Click Find Leads
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			//Enter captured lead ID
			driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(LeadId1);	
			
			Thread.sleep(5000);
			//Click Find leads Button
			driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
			
			//Verify message "No records to display" in the Lead List
			String text1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			System.out.println(text1+"It must show the message after Deletion of the Particular");
			
			Thread.sleep(5000);
			//Close the browser (Do not log out)
			driver.close();

	}

}
