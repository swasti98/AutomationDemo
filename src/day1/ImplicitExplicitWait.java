package day1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ImplicitExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit Wait:
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit Wait can be of 2 types:  1.WebDriver Wait, 2.Fluent Wait: 
		//after selenium 4.0 used both the wait got depricated so you have to use the below syntax.
		WebDriverWait web = new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		web.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// Explicit Wait:
		web.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Select drpCountry = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")));
		drpCountry.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@class=\"chkAgree\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
	}
	public static  void addItems(WebDriver driver,String[] itemsNeeded)
		{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
		//Brocolli - 1 Kg
		//Brocolli,    1 kg
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		//format it to get actual vegetable name
		//convert array into array list for easy search
		//  check whether name you extracted is present in arrayList or not-
		List itemsNeededList = Arrays.asList(itemsNeeded);
		if(itemsNeededList.contains(formattedName))
		{
		j++;
		//click on Add to cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		{

		break;

		}

		}

		}
}

}
