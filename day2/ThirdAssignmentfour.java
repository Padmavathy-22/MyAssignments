package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdAssignmentfour {
	public static void main(String[] args) {
		
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		//Your most favorite browser
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		
		//UnSelectable
		WebElement selectPlace = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		selectPlace.click();
		
		//Find the default select radio button
		boolean browser = driver.findElement(By.xpath("//label[text()='Edge']")).isEnabled();
		System.out.println(browser);
		
		//Select the age group (only if not selected)
		WebElement ageGroup = driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		ageGroup.click();
		}
	}


