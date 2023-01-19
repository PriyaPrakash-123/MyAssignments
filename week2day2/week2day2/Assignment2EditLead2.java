package week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2EditLead2 {
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

		
		//Enter First Name
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("Jk");
		
		Thread.sleep(3000);
		
		//Click Find leads Button
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		
		Thread.sleep(5000);
	
		//Show 1st Lead Id from the Lead List
		String LeadId = driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"))).getText();
		System.out.println("LeadId:" +LeadId);
		
		Thread.sleep(9000);
		//Click on First Resulting Lead
		driver.findElement(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).click();
		
		Thread.sleep(8000);
		
		//To Verify the Title5
		String Title5 = driver.getTitle();
		System.out.println("It redirect to"+"---"+Title5+"---"+"Page, while clicking on first resulting Leads");
		
		Thread.sleep(8000);
		//Click on Edit
		driver.findElement(By.xpath("(//a[@class ='subMenuButton'])[3]")).click();
		
		Thread.sleep(3000);
		
		//Clear Company Name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		//Change Company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Milton: JK Company");
		
		Thread.sleep(2000);
		
		// Click Update
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//Confirm the changed name appears
		String Value1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Updated Company Name : " +Value1);
		
		//Close the browser (Do not log out)
		driver.close();
	}
}

