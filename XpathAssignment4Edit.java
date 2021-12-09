package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignment4Edit {

	public static void main(String[] args) {
		
             WebDriverManager.chromedriver().setup();
		
		     ChromeDriver driver = new ChromeDriver();
		     
		     driver.get("http://leafground.com/pages/Edit.html");
		     
		     driver.manage().window().maximize();
		     
		     driver.findElement(By.id("email")).sendKeys("subrajasubi@gmail.com");
		     
		     driver.findElement(By.xpath("//input[@value='Append ']")).clear();
		     
		     driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("subi");
		     
		     driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
             
		   System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		     
		     driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		     
	 WebElement disable = driver.findElement(By.xpath("//input[@disabled='true']"));
     boolean enabled = disable.isEnabled();
     System.out.println(enabled);
		     
		      
		      
		     
		     
		
	}

}
