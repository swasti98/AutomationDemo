package day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Swasti";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		// TestNG Dependency
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'logged in.')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'logged in.')]")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Hello')]")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
		driver.close();
	}
   public static String getpassword(WebDriver driver) throws InterruptedException
   {
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	   //Please use temporary password 'rahulshettyacademy' to Login.
       String[] passwordArray = passwordText.split("'");
       // String[] passwordArray2 = passwordArray[1].split("'");
       // passwordArray2[0]
       String password = passwordArray[1].split("'")[0];
       return password;
       //0th index - Please use temporary password
       //1st index - rahulshettyacademy' to Login.
   }
}
