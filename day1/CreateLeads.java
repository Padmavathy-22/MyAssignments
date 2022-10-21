package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {
	public static void main(String[] args) {
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Legato");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Padmavathy");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Raja");
		
		//Select the drop down value from Source
		////Step 1:Locate the parent element-> Select tag
		WebElement elementSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step 2:Create object for Select class and pass the parent element
		Select SourceID = new Select(elementSourceId);
		
		//Step 3:Select the Option using Visible text
		SourceID.selectByVisibleText("Employee");
		
		//Select the drop down value from Industry
		WebElement elementIndustryId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select IndustryId=new Select(elementIndustryId);
		IndustryId.selectByValue("IND_FINANCE");
		
		//Select the drop down value from Ownership
		WebElement elementOwnershipId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipId=new Select(elementOwnershipId);
		OwnershipId.selectByIndex(5);
		
		
		
		
		
		
		
		
		
		
	}

}
