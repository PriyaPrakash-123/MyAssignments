package week3.week3day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicateAmazonList {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		
		List<WebElement> mobPrice = driver.findElements(By.xpath("//span[@class = 'a-price-whole']"));
		List <Integer> pricelist = new ArrayList<Integer>();
		Set<Integer> unique = new TreeSet<Integer>();
		int size = mobPrice.size();
		System.out.println("Size : " + size);
		
		for(WebElement each : mobPrice)
		{
			String text = each.getText();
			System.out.println(text);
		String replaceAll = text.replaceAll(",","");
		System.out.println(replaceAll);	
		if(!replaceAll.isEmpty()) /* Value in replaceAll is not Empty */
		{
			int Parseint = Integer.parseInt(replaceAll);
			pricelist.add(Parseint);
		}
		} 
		Collections.sort(pricelist);
		int size1 = pricelist.size();
		System.out.println("After Sorting Size of the List become : " +size1);
		System.out.println("Sorted List :" +pricelist);
		System.out.println("The Least Value is : " +pricelist.get(0));
		
		//To find Duplicate
		unique.addAll(pricelist);
		System.out.println(unique);
		int size2 = unique.size();
		System.out.println(size2);
		if(size1>size2)	
		{System.out.println("unique List");
		}
		else
		{System.out.println("Duplicates are not removed");
}
	}
}