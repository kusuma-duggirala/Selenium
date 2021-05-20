package SeleniumWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Windows 
{
	static WebDriver driver;
	static WebElement ele;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension",false);
		driver=new ChromeDriver(options);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		System.out.println("Done");
		DesiredCapabilities dc= DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		Actions act =new Actions(driver);
		act.moveToElement(ele).sendKeys(Keys.SHIFT,"hello").build().perform();
		//act.moveToElement(ele).keyDown(Keys.SHIFT).se
		//act.keyDown(ele, Keys.SHIFT)

	}

}
