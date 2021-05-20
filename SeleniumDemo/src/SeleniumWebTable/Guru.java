package SeleniumWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru 
{

	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension",false);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		/*List<WebElement> rows=driver.findElements(By.xpath("//div[@id='includedContent']//following::table/tbody/tr"));
		System.out.println("No.of Rows: "+rows.size());
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//div[@id='includedContent']//following::table/tbody/tr["+i+"]/td"));
			System.out.println("No.of Columns in Row: "+i+" is: "+cols.size());
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cellData=driver.findElement(By.xpath("//div[@id='includedContent']//following::table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(cellData.getText());
			}
		}*/
		WebElement table=driver.findElement(By.xpath("//div[@id='includedContent']//following::table/tbody"));
		//Used with tagname
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No.of Rows: "+rows.size());
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("No.of Columns in Row: "+i+" is: "+cols.size());
			for(int j=0;j<cols.size();j++)
			{
				System.out.println(cols.get(j).getText());
			}
		}
		

	}

}
