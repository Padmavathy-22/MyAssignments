package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdAssignmentThree {
	public static void main(String[] args) {
		
		//Setup driver before starting the driver
	    WebDriverManager.chromedriver().setup();
	    
	    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		//Take me to Dash board
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//Find my destination
		
		String Desitination = driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).getAttribute("href");
		System.out.println(Desitination);
		
		//Am I broken link?
		driver.findElement(By.linkText("Broken?")).click();
		WebElement errorPage = driver.findElement(By.xpath("//td[text()='404']"));
		System.out.println(errorPage.isDisplayed());
		
		if (errorPage.isDisplayed()) {
			System.out.println("Link is broken");
			
		}
		else {
			System.out.println("Link is not broken");
			
		}
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		
		//Duplicate Link
		driver.findElement(By.linkText("Go to Dashboard")).click();
	}

}
