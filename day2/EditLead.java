package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Padmavathy");
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    WebElement elementLeadid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
	    elementLeadid.click();
	    
	    //verify title of the page
	    System.out.println("The title is :" + driver.getTitle());
	    
	    WebElement elementedit = driver.findElement(By.xpath("//a[text()='Edit']"));
	    elementedit.click();
	    
	    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Amazon");
	    
	    WebElement elementUpdate = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
	    elementUpdate.click();
	    
	    //Confirm the changed name appears
	    if(driver.getTitle().contains("Amazon")) {
	    	System.out.println("I confirm the company name as Amazon");
	    }else
	    	System.out.println("The company name does not have as Amazon");
	    }

	    
	    

}
