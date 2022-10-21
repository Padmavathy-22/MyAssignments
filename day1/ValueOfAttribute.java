package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValueOfAttribute {
	public static void main(String[] args) {
	
	//Setup driver before starting the driver
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//Maximize the window
			driver.manage().window().maximize();
			
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
			
			//Find an Element
			WebElement elementUsername = driver.findElement(By.id("username"));
			//Actions on the element found
			elementUsername.sendKeys("Demosalesmanager");
			
			//To get the value of Attribute
			String attribute = elementUsername.getAttribute("name");
			System.out.println(attribute);

	}
}
