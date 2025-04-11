package seleniumBasics;

public class BrowserCommands extends Base 
{
	public void verifyBrowserCommand() {
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		}
	public void verifyNavigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.navigate().refresh();
	}
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 BrowserCommands browser=new BrowserCommands();
		browser.initializeBrowser();
		browser.verifyBrowserCommand();
		browser.verifyNavigateCommands();
	//	browser.closeAndQuit();
	} 

} 
 