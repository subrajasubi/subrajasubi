package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
        driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).clear();
		
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).sendKeys("91");
		
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9176027896");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);	
		
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		System.out.println(name);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(name);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String msg= driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			
		if(msg.contains("No records to display"))	
		{
			System.out.println("successfully deleted");
		}
		
		else
		{
			System.out.println("not6 successfully deleted");
		}
		
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
