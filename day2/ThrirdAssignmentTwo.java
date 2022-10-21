package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThrirdAssignmentTwo {
	public static void main(String[] args) {
		//Setup driver before starting the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		//Click and Confirm title.
			String Title1 = driver.getTitle();
			System.out.println(Title1);
			
		//	
			driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
			String Title2 = driver.getTitle();
			System.out.println(Title2);
			if(Title1.equals(Title2)) {
				System.out.println("Title1 is not clicked");
			}
			else {
				System.out.println("Title1 is clicked successfully");
			}
		
			//Confirm the button is disabled.
			driver.navigate().to("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
			boolean enableButton = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		    System.out.println(enableButton);
		    
		    //Find the position of the Submit button
		    Point getPosition = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
		    System.out.println(getPosition);
		   
		    //Find the height and width of this button
		    Dimension getHeight = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize();
		    System.out.println(getHeight);
		    
		    //Mouse over and confirm the color changed
		    String getColour = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).getCssValue("background-colour");
		    System.out.println(getColour);
		
		
		
		
		
		
		
		
		
		}
}