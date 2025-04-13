package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	public void verifyrightclick() {
		WebElement rightclick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
	}
		public void verifyMousehover() {
			WebElement mousehover = driver.findElement(By.xpath("//a[@id='progress-bars']"));
			Actions action = new Actions(driver);
			action.moveToElement(mousehover).build().perform();
		}

		public void draganddrop() {
			driver.navigate().to("https://demoqa.com/droppable");
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).build().perform();
		}
			public void keyboardaction() throws AWTException {
		    	Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_T);
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions=new HandlingActions();
		actions.verifyrightclick();
		actions.verifyMousehover();
		actions.closeAndQuit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private void verifymousehover() {
		// TODO Auto-generated method stub
		
	}

}
