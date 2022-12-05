package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe" );
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.findElement(By.name("name")).sendKeys("Swasti Ranjan Senapati");
    driver.findElement(By.name("email")).sendKeys("swasti.senapati@gmail.com");
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Swasti@98");
    driver.findElement(By.id("exampleCheck1")).click();
    //driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("Male");
    WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
    Select Option = new Select(dropdown);
    Option.selectByVisibleText("Male");
    driver.findElement(By.id("inlineRadio1")).click();
    driver.findElement(By.name("bday")).sendKeys("21/08/1998");
    driver.findElement(By.xpath("//input[@class=\"btn btn-success\"]")).click();
    // System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
    System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
    
	}

}
