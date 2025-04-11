package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	public void verifywebelementscommands()
	{
		driver.navigate().to("https://selenium.qabible.in");
		WebElement messagebox=driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("WELCOME");
		WebElement showmessagebutton=driver.findElement(By.id("button one"));
		showmessagebutton.click();
		WebElement yourmessage=driver.findElement(By.id("message one"));
    	System.out.println(yourmessage.getText());
    	messagebox.clear();
    	String boardercolourofshowmessagebutton=showmessagebutton.getCssValue("boarder-color");
    	System.out.println(boardercolourofshowmessagebutton);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelement=new WebElementCommands();
		webelement.initializeBrowser();
		webelement.verifywebelementscommands();
	//	webelement.closeAndQuit();
	}
	

}
