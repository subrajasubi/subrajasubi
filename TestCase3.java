package week2.day1.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;






public class TestCase3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();

	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Tech");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivathanu");
		
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(sourceDropdown);
		
		select.selectByVisibleText("Partner");
		
		WebElement MarketCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select sel = new Select(MarketCampaignDropDown);
		
		sel.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subraja");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Subi");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/27/92");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tester");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Team");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		
	   WebElement PreferedCurrencyDropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    
		Select s1 = new Select(PreferedCurrencyDropdown);
	
		s1.selectByVisibleText("INR - Indian Rupee");
		
		WebElement IndustryDropdown  = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select s2 = new Select(IndustryDropdown);
	
		s2.selectByVisibleText("Computer Software");
	
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		
		WebElement OwnershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select s3 = new Select(OwnershipDropdown);
		
		s3.selectByVisibleText("Partnership");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9176027896");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subrajasubi@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Subraja");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Joel Nakshatra");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("sri sathya sai nagar street");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement StateProvinceDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select s4 = new Select( StateProvinceDropdown);
		
		s4.selectByVisibleText("Indiana");
		
		
		WebElement CountryDropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		Select s5  = new Select(CountryDropdown);
		
		s5.selectByVisibleText("India");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600076");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
    	//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
