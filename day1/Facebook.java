package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		
		//Setup driver before starting the driver
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
		
		
		WebElement elementUsername = driver.findElement(By.linkText("Create New Account"));
		elementUsername.click();
		
		WebElement elementFirstname = driver.findElement(By.name("firstname"));
		elementFirstname.sendKeys("Padmavathy");

		WebElement elementLastname = driver.findElement(By.name("lastname"));
		elementLastname.sendKeys("Raja");
		
		

		
	}
	

}
