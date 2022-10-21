package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {
	public static void main(String[] args) {
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		//find an element thru xpath-Attribute Syntax://tagName[@attribute='attribute_value']
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		
		// find an element thru xpath-class-two matches;syntax:(xpath)[index]
		WebElement elementPassword = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		elementPassword.sendKeys("crmsfa");
		
		//xpath-attribute
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();
		
		//Partial text xpath:syntax://tagName[contains(text(),'partialtext')]
		WebElement elementLink = driver.findElement(By.xpath(" //a[contains(text(),'CRM/SFA') ]  "));
		elementLink .click();
		
}
}