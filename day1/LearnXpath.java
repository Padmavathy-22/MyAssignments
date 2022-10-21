package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		// X path for Attribute
		//WebElement elementUsername = driver.findElement(By.xpath("//input[@class='inputLogin']"));
		//elementUsername.sendKeys("Demosalesmanager");
		
		//x path for password
		//Syntax:(xpath)[index]
		
	    WebElement elementUsername = driver.findElement(By.xpath("(//input[@class='inputLogin']) [2]"));
		elementUsername.sendKeys("Demosalesmanager");
		

}
}