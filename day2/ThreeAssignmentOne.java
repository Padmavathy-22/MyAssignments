package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreeAssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type your name
		WebElement typeYourName = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		typeYourName.sendKeys("Padmavathy");
		
		WebElement place = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']"));
		place.sendKeys("Bangalore");
		
		WebElement verifyisDisabled = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"));
		System.out.println("Text Box is Disabled"+ " " + verifyisDisabled.isDisplayed());
		
		WebElement clearText = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		clearText.clear();
		
		Thread.sleep(2000);
		String retriveText = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(retriveText);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		email.sendKeys("padma@gmail.com");
		email.sendKeys(Keys.TAB);
		
		WebElement hitEnter = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
		hitEnter.sendKeys(Keys.ENTER);	
		
		WebElement errorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		System.out.println(errorMessage.isDisplayed());
		System.out.println(errorMessage.getText());
		
		WebElement getPosition = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		getPosition.click();
		System.out.println(getPosition.getLocation());
		
		WebElement chooseName = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		chooseName.sendKeys("Padmaraja");
		WebElement selectName = driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]"));
		selectName.click();
		selectName.getAttribute("data-item-value");
		System.out.println(selectName);
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
		DOB.sendKeys("01/25/1987");
		DOB.click();
		WebElement dateincalander = driver.findElement(By.linkText("25"));
		System.out.println("Date selected is " + dateincalander.getText());
		
		WebElement spinNumbers = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		spinNumbers.sendKeys("3");
		
		WebElement spinBtn = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
		spinBtn.click();
		
		String updatedNumber = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("aria-valuenow");
		System.out.println(updatedNumber);
		spinBtn.click();
		
		String updatedNumber2 = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("aria-valuenow");
		System.out.println(updatedNumber2);
		
		WebElement enterRandomNumber = driver.findElement(By.xpath("//input[@id='j_idt106:slider']"));
		enterRandomNumber.sendKeys("20");
		
		WebElement sliderMovement = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println(sliderMovement.isDisplayed());
		
		WebElement virtualKey = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']"));
		virtualKey.click()	;
		
		WebElement keyboard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
		System.out.println("virtual keyboard is displayed "+ keyboard.isDisplayed());

		
		
		
}
}





