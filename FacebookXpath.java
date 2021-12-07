package week2.day2.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookXpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("subraja");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("subi");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("subrajasubi@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Iniyan@123");
		
		WebElement DateDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select date = new Select(DateDropdown);
		
		date.selectByValue("27");
		
		
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month =  new Select(MonthDropdown);
		
		month.selectByValue("11");
		
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select year = new Select(YearDropdown);
		
		year.selectByValue("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
