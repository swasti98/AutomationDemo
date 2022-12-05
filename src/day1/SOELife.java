package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SOELife {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qat-soe.dxc-assure-policy.com/SalesIntermediary/home");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("soeadmin");
		driver.findElement(By.id("password")).sendKeys("stage");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		WebDriverWait web = new WebDriverWait(driver,Duration.ofSeconds(5));
		web.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'converted to quote')]")));
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'converted to quote')]")).getText());
		driver.findElement(By.xpath("//p[contains(text(),'Application Process')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='New']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[contains(text(),'Mortgage Safe')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Get Business Case')]")).click();
		web.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id']")));
		//driver.findElement(By.xpath("//*[@id='contact_search_contact']//input	")).sendKeys("Joshua Fitzgerald");
		WebElement Search = driver.findElement(By.xpath("//input[@id='id']"));
		Search.sendKeys("Joshua Fitzgerald");
		//KeyPress
		Search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div//tr [2]/td [1]/span [2]")).click();
		web.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Salutation')]/following-sibling::div")));
		
		
		//driver.close();
		

	}

}
