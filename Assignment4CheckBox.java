package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CheckBox {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			String title = driver.getTitle();
			

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			
			System.out.println("Title of the page is:" +title);
			
			driver.findElement(By.xpath("//div[@class='example']//input[1]")).click();
			
			WebElement selected = driver.findElement(By.xpath("//div[text()='Selenium']"));
			
			 boolean enabled = selected.isEnabled();
	           
	           System.out.println(enabled);
	           
	           
	        
	          
	          WebElement deselect = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input"));
	          
	          if(deselect.isSelected()) {
	        	  
	        	  deselect.click();
	        	  
	          }
	          
	          WebElement de = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]"));
	          
	          if(de.isSelected()) {
	        	  
	        	  de.click();
	          }
	          
	          Thread.sleep(2000);	 
	          
	          driver.findElement(By.xpath("//div[text()='Option 1']")).click();
	          
	          driver.findElement(By.xpath("//div[text()='Option 2']")).click();
	          
	          driver.findElement(By.xpath("//div[text()='Option 3']")).click();
	          
	          driver.findElement(By.xpath("//div[text()='Option 4']")).click();
	          
		
		
	}

}
