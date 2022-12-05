package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("subhadeepsenapati03@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Hilinkedin1998");
		driver.findElement(By.className("btn__primary--large")).click();
		System.out.println(driver.findElement(By.id("error-for-password")).getText());
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subhadeepsenapati03@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.cssSelector("a[aria-label='Back']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("swasti.senapati@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Hilinkedin21");
		driver.findElement(By.className("btn__primary--large")).click();
		driver.findElement(By.xpath("(//span[@class=\"global-nav__primary-link-text\"])[6]")).click();
		driver.close();
		
		
	}

}
