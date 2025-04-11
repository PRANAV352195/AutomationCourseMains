package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("//input[id='single-input-field'"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	      
		
	
	
	
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.verifyLocators();
		locators.closeAndQuit();
		   
	}

}
