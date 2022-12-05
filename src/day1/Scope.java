package day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/practice.php/");
		//Find the no of Link present on the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Find the no of Link present on the Footer of the web-page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Find the no of Link present on the partcular column/location on the web-page
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//click on each link on the one particular olumn and check if it is opening or not.
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickLinkinNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkinNewTab);
			Thread.sleep(5000L);
		}
			//Go to each tab and grab/get the title of each new tab.
			Set<String> tab = driver.getWindowHandles();
			Iterator<String> itr = tab.iterator();
			while(itr.hasNext())
			{
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
				
			}
			
			
		}
	}


