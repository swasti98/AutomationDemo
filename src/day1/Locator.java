package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("swasti.senapati@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Hilinkedin21");
		driver.findElement(By.className("btn__primary--large")).click();
		driver.close();

	}

}
