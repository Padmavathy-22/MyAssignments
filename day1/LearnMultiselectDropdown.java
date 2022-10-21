package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMultiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		WebElement multiSelect = driver.findElement(By.xpath("(//select)[6]"));
		
		//create object for select class
		Select comboBox=new Select(multiSelect);
		
		//Select by visible text
		comboBox.selectByVisibleText("Selenium");
		
		comboBox.selectByVisibleText("Appium");
		
		comboBox.selectByVisibleText("UFT/QTP");
		
		comboBox.selectByVisibleText("Loadrunner");
		
		//Deselect value
		Thread.sleep(2000);//longmillisec
		comboBox.deselectByVisibleText("Appium");
		
		
		

}
}