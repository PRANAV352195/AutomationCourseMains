package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;

public  class FileUpload extends Base
{
	public void verifyfileuploadusingsendkeys(){
	 driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement choosefile=driver.findElement(By.id("uploadfile 0"));
		choosefile.sendKeys("C:\\Users\\Pranav\\git\\AutomationCourseMains\\AutomationCourseMain\\src\\test\\resources\\selenium notespdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		
		
		checkbox.click();
		WebElement submitfile=driver.findElement(By.id("Submitbutton"));
		submitfile.click();
	}
	public void verifyfileuploadusingrobotclass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf ");
		WebElement selectPdfFile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdfFile.click();
		StringSelection s=new StringSelection("C:\\Users\\Pranav\\git\\AutomationCourseMains\\AutomationCourseMain\\src\\test\\resources\\selenium notespdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload file=new FileUpload();
		file.initializeBrowser();
	//	file.verifyfileuploadusingsendkeys();
		try {
			file.verifyfileuploadusingrobotclass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	file.closeAndQuit();
		

	}

}
