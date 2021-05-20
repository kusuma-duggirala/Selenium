package SeleniumWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableDemo 
{
	static WebDriver driver;
	static float max=0;
	static float number;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension",false);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php" );
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("No.of rows: "+rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("No.of Columns: "+columns.size());
		
		//Fetch 2nd row, 3rd col data
		WebElement ele=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[3]"));
		System.out.println(ele.getText());
		
		//Fetch maximum of all values in 4th colmn
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		List<WebElement> r=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows: "+r.size());
		for(int i=0;i<r.size();i++)
		{
			List<WebElement> c=r.get(i).findElements(By.tagName("td"));
			System.out.println("Number of Columns: "+c.size());
			WebElement we=c.get(3);
			
			System.out.println(we.getText());
			number=Float.parseFloat(we.getText());
			if(number>max)
			{
				max=number;
			}
		}
		System.out.println("Maximum Number: "+max);
		
	}
	
}
