package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()=\" Bengaluru (BLR)\"])[1]")).click();
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//a[text()=\" Hyderabad (HYD)\"])[2]")).click();
		    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
			}

		

	}


