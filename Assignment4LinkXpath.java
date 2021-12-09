package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4LinkXpath {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
	     ChromeDriver driver = new ChromeDriver();
	     
	     driver.get("http://leafground.com/pages/Link.html");
	     
	     driver.manage().window().maximize();
			
			String title = driver.getTitle();
			
			
			System.out.println("Title of the page is:" +title);
			
			driver.findElement(By.linkText("Go to Home Page")).click();
			
			System.out.println("The link is :" +driver.getCurrentUrl());
			
			 System.out.println("Verification:" + driver.findElement(By.linkText("Verify am I broken?")).isEnabled());
			 
			 
			
			
			
	 		
	}

}
