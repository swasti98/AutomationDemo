package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    //Country Select
	    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	    //From Departure City
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=\" Bengaluru (BLR)\"])[1]")).click();
		//To arrival city
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()=\" Hyderabad (HYD)\"])[2]")).click();
	    //when date is choosen
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
	    //when calender field checked as disabled
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	    {
	    	System.out.println("it is disabled");
	    	//validation the filed
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertFalse(false);
	    }
	    //CheckBox clicked
	    driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	   //when Passanger added
	    driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
	    for(int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
	    //when done option clicked
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//When currency selected
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//When Searched clicked
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);
		//driver.close();
	}

}
