package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
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
		
		//Select Drop down value from Day-15th Aug 2021
		
		//Step 1:Locate the parent element-> Select tag
		WebElement elementDay = driver.findElement(By.id("day"));
		
		//Step 2:Create object for Select class and pass the parent element
		Select Day=new Select(elementDay);
		
		
		//Step 3:Select the Option using Visible text
		Day.selectByVisibleText("15");
		
		
		//Step 4:Locate the Parent element->Select tag 
		WebElement elementMonth = driver.findElement(By.id("month"));
		
		//Step 5:Create object for Select class and pass the parent element
		Select Month=new Select(elementMonth);
		
		//Step 6:Select the Option using Visible text or value.Here using Value
		Month.selectByValue("8");
		
		//Step 7:Locate the Parent element-Select tag
		WebElement elementYear = driver.findElement(By.id("year"));
		
		//Step 8:Create Object for Select class and pass the parent element
		Select Year=new Select(elementYear);
		
		//Step 9:Select the option from index
		Year.selectByIndex(1);
		
		
		
		
		
		
		
		
		
		
}

}
