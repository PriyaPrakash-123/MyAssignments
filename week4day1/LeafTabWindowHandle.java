package week4.week4day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTabWindowHandle {
	public static void main(String[] args) throws InterruptedException {
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
				driver.findElement(By.xpath("//a[text() = 'Merge Leads']")).click();
				driver.findElement(By.xpath("(//span[text() ='From Lead']/following::a)[1]")).click();
				String parentwindow = driver.getWindowHandle();
				System.out.println(parentwindow);
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println("Window Handle : " +windowHandles.size());
				List<String> list = new ArrayList<String>(windowHandles);
				driver.switchTo().window(list.get(1));
				String secondwindowHandle = driver.getWindowHandle();
				System.out.println("secondwindowHandle" +secondwindowHandle);
				driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Subraja");
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("((//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'][1])/a)[1]")).click();
				driver.switchTo().window(list.get(0));
				System.out.println(parentwindow);
				
	}				
}
