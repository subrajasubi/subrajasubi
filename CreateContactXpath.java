package week2.day2.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactXpath{


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
		driver.findElement(By.xpath("//a[ text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[ text()='Create Contact']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Subraja");
		
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Sivathanu");

		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Subraja");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("subi");
		
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("This company is an it company");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("subrajasubi@gmail.com");
		
		WebElement StateDD = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		Select state = new Select(StateDD);
		
		state.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Fill the mandatotry fields");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
        String title = driver.getTitle();
		
		System.out.println(title);
		
		//driver.close();
		
		
		
		
		
		
		
		

















		
		
		
		
		
		
		
		
		
		
		
		

	}

}
