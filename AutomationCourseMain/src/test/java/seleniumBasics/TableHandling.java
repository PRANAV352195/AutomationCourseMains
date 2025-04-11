package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void verifyTableHandlig() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement showmore=driver.findElement(By.id("showMoreLess"));
	showmore.click();
		WebElement datatable=driver.findElement(By.id("datatable"));
		System.out.println(datatable.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		 System.out.println(tablerow.getText());
		 
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.initializeBrowser();
		table.verifyTableHandlig();
		table.closeAndQuit();
	}

}
