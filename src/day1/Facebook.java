package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException
    {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com");
         driver.findElement(By.id("email")).sendKeys("");
         driver.findElement(By.id("pass")).sendKeys("");
         Thread.sleep(5000);
         driver.findElement(By.name("login")).click(); 
         Thread.sleep(7000);
        
    }
}
