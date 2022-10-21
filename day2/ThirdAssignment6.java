package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdAssignment6 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		//Maximize the window
		driver.manage().window().maximize();
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
		
		//Which is your favorite UI Automation tool?
		WebElement elementTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select Tool= new Select(elementTool);
		Tool.selectByVisibleText("Cypress");
		
		//Choose your preferred country.
		WebElement selectCountry = driver.findElement(By.xpath("//label[text()='Select Country']"));
		selectCountry.click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		
		
		//Choose the Course
		WebElement chooseCourse = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
		chooseCourse.sendKeys("Selenium Webdriver");
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		
		//Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[text()='Select Values']"));
		
		
		
		
	}


}
