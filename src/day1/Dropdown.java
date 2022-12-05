package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		Thread.sleep(2000);
		//ParentChild Relationship Xpath
        // you can use these xpath also //div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[text()=" Bengaluru (BLR)"]
	    driver.findElement(By.xpath("(//a[text()=\" Bengaluru (BLR)\"])[1]")).click();
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[text()=\" Bengaluru (BLR)\"]")).click();
	    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	    Thread.sleep(2000);
	    //you can use these xpath also//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=" Hyderabad (HYD)"]
	    driver.findElement(By.xpath("(//a[text()=\" Hyderabad (HYD)\"])[2]")).click();
	    //driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=\" Hyderabad (HYD)\"]")).click();
		
	}
	
}
