package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    //previously it was not enabled but it will show true but in browser you can see it is still disable error.(pls watchtutorial Section7.61)
   // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
   // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
    {
    	System.out.println("it is enabled");
    	//validation the filed
    	Assert.assertTrue(true);
    }
    else
    {
    	Assert.assertFalse(false);
    }
   
   }
    }


