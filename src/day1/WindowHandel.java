package day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		//Iterator is a method
		Iterator<String> itr = windows.iterator(); 
		//ParentId & ChildId is used for both parent and child window. 
		//And itr will extract the value from set collection 
		String ParentId = itr.next();
		String ChildId = itr.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//li[text()=\" contact@rahulshettyacademy.com\"]")).getText());
		String emailId = driver.findElement(By.xpath("//li[text()=\" contact@rahulshettyacademy.com\"]")).getText();
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("username")).sendKeys("emailId");
		
		
		
		
		

	}

}
