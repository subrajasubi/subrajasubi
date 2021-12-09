package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Button {
 
	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		 
	    String title = driver.getTitle();
			
		System.out.println("The title of the page is :" +title);
		 
	  // driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
			
		System.out.println("The position is : " +driver.findElement(By.id("position")).getLocation());
		
//			WebElement Position = driver.findElement(By.xpath("//button[@id='position']"));
//			 Point xypoint= Position.getLocation();
//			 int xvalue = xypoint.getX();
//			 int yvalue = xypoint.getY();
//			 System.out.println("The position of xand y:"+"x value"+xvalue + "  " +"y  value" +yvalue);
//
//	}
       System.out.println("The color value is:" + driver.findElement(By.id("color")).getCssValue("color"));    
       
       
       System.out.println("The size is :" +driver.findElement(By.id("size")).getSize());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}

