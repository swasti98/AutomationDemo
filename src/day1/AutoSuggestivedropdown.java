package day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		//option is nothing but List of WebElement
	    List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    //Enhanced forLoop
	    for (WebElement Option:options )
	    {
	    	if(Option.getText().equalsIgnoreCase("India"))
	    	{
	    		Option.click();
	    		break;
	    	}
	    	
	    }
	    Thread.sleep(3000);
	    driver.close();
	}

}
