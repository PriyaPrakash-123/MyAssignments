package week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact1 {
		public static void main(String[] args) {
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
			System.out.println("Once Login it redirect to" +Title1+ "Page");
			//Partial Link Text
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			//Click on Contact button
			driver.findElement(By.xpath("//a[text() ='Contacts']")).click();
			//To Verify the Title2
			String Title2 = driver.getTitle();
			System.out.println("After click Contacts it redirect to" +Title2+ "Page");
			//Click on Create Contact
			driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			//Enter FirstName
			driver.findElement(By.xpath("//input[@id = 'firstNameField']")).sendKeys("Joshvik");
			//Enter lastname
			driver.findElement(By.xpath("//input[@id = 'lastNameField']")).sendKeys("Kishan");
			//Enter FirstName Local
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Joshu");
			//Enter LastName Local
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bhubhu");
			//Enter Department
			driver.findElement(By.xpath("//input[@name ='departmentName']")).sendKeys("Police");
			//Enter Description
			driver.findElement(By.id("createContactForm_description")).sendKeys("the power of the police"
					+ " to investigate and all the necessary information regarding the same");
			//Enter Email
			driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("priyaprakash14@gmail.com");
			
			//Select State/Province
			WebElement Statedropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select S1  =new Select(Statedropdown);
			S1.selectByVisibleText("New York");
				
			//Click Create Contact
			driver.findElement(By.className("smallSubmit")).click();
			
			//To Verify the Title3
			String Title3 = driver.getTitle();
			System.out.println("After click Create Contacts it redirect to" +Title3+ "Page");
			
			//click Edit Button
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click(); /*or use by text base xpath//a[text()='Edit']*/
			
			//To Verify the Title4
			String Title4 = driver.getTitle();
			System.out.println("After click Edit Contacts it redirect to" +Title4+ "Page to edit contact details");
			
			//Clear Description Field
			 driver.findElement(By.id("updateContactForm_description")).clear();
			 
			 //Fill ImportantNote Field with Any text
			 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("bcdjbs@-12165%");
			 
			 //Click on update button using Xpath locator
			 driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
			 
			 //To Verify Title of Updated Resulting Page
			 String Title5 = driver.getTitle();
			 System.out.println("After click Update it redirect to" +Title5+ "Page to view contact details");
		}

	}

