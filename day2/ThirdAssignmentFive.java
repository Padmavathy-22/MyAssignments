package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdAssignmentFive {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Notification
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(displayed);
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//Tri State Checkbox
		
				WebElement elementTristate = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]"));
				elementTristate.click();
		
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		
}}
