package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllOptions {
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
		
		//Select the drop down value from Ownership
		WebElement elementOwnershipId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipId=new Select(elementOwnershipId);
				
		//To get all the options in WebElements under the select tag
			 List<WebElement> options = OwnershipId.getOptions();	

		//To find the number of items there we use size method-options,size()+Ctrl 2
			int size = options.size();
			System.out.println(size);
			
		//To get single item from the List-get method for index
			//options.get(5);
			
		//To select the last item index=size-1
			WebElement elementLast = options.get(size-1);
			elementLast .click();
			
			
}
}