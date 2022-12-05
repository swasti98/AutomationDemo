package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Traget2 {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssenapati8\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://target2.dxc-assure-policy.com/Life/FirstServlet");
		driver.manage().window().maximize();
		//To take the screen shot of the page
		File src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ssenapati8\\Pictures\\screenshot.png"));
		//implicit wait used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("sranjan");
		driver.findElement(By.name("password")).sendKeys("underwr1");
		driver.findElement(By.className("loginBtn")).click();
		driver.switchTo().frame("topFrame");
		WebElement element = driver.findElement(By.id("openNav-btn"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.switchTo().defaultContent();
		//Client Creation
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.id("sidebar-pin")).click();
        driver.findElement(By.xpath("//img[@src='screenFiles/eng/menu/Clients.png']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Client Maintenance')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("A")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//input[@id='lsurname']")).sendKeys("Ranjan");
		driver.findElement(By.xpath("//input[@id='lgivname']")).sendKeys("Swasti");
		driver.findElement(By.id("cltdobxDisp")).sendKeys("21/08/1998");
		driver.findElement(By.xpath("//select[@id='cltsex']")).sendKeys("Male");
		driver.findElement(By.id("addrtype")).sendKeys("Business Address");
		driver.findElement(By.id("cltaddr01")).sendKeys("DXC Technology, Noida");
		driver.findElement(By.id("cltaddr02")).sendKeys("GautamBudhha Nagar, UP");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		String cn = getClientno(driver);
		System.out.println("clientnumber="+cn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Creation of Proposal for CahBackEndowment.
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//img[@src='screenFiles/eng/menu/ProposalsNewBusiness.png']")).click();
		driver.findElement(By.xpath("//a[text()='New Contract Proposal']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("chdrtype")).sendKeys("Cashback Endowment");
		driver.findElement(By.xpath("//input[@id='A']")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//input[@id='ownersel']")).sendKeys(cn);
		driver.findElement(By.id("hpropdteDisp")).sendKeys("01/01/2020");
		driver.findElement(By.id("billfreq")).sendKeys("Annual");
		driver.findElement(By.id("mop")).sendKeys("Direct Billing (Cash)");
		driver.findElement(By.id("huwdcdteDisp")).sendKeys("01/01/2020");
		driver.findElement(By.xpath("//select[@name=\"cntcurr\"]")).sendKeys("Singapore Dollar");
		driver.findElement(By.xpath("//select[@name=\"billcurr\"]")).sendKeys("Singapore Dollar");
		driver.findElement(By.cssSelector("#register")).sendKeys("Singapore");
		driver.findElement(By.cssSelector("#srcebus")).sendKeys("Agent");
		driver.findElement(By.id("ttmprcdteDisp")).sendKeys("01/01/2020");
		driver.findElement(By.id("agntsel")).sendKeys("60011174");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("selection")).sendKeys("No Further Requirements");
		driver.findElement(By.id("smoking")).sendKeys("Non-smoker");
		driver.findElement(By.name("height")).sendKeys("180");
		driver.findElement(By.name("weight")).sendKeys("65");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("s6765screensfl.answer_R1")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R9")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R14")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R19")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R23")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R27")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R30")).sendKeys("No");
		driver.findElement(By.id("s6765screensfl.answer_R33")).sendKeys("No");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//a[contains(text(),'Underwriting Confirmation')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("undwflag")).sendKeys("Yes");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.name("s5006screensfl.select_R2")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.name("sumin")).sendKeys("100000");
		driver.findElement(By.name("mortcls")).sendKeys("Non-smoker");
		driver.findElement(By.name("riskCessTerm")).sendKeys("10");
		driver.findElement(By.name("premCessTerm")).sendKeys("10");
		driver.findElement(By.name("paymth")).sendKeys("Computer Cheque");
		driver.findElement(By.xpath("//button[@id='refreshbutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//a[contains(text(),'Tax Detail')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click(); 
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm"); 
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm"); 
		driver.findElement(By.name("sumin")).sendKeys("70000");
		driver.findElement(By.name("mortcls")).sendKeys("Non-smoker"); 
		driver.findElement(By.name("riskCessTerm")).sendKeys("10");
		driver.findElement(By.name("premCessTerm")).sendKeys("10");
		driver.findElement(By.name("benCessTerm")).sendKeys("10"); 
		driver.findElement(By.xpath("//button[@id='refreshbutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//a[contains(text(),'Tax Detail')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'is created')]")).getText());
		//Policy Created we need PolicyNo For UW Approval
		String PolicyNo = getContractno(driver);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.name("chdrsel")).sendKeys(PolicyNo);
		System.out.println("line 171 = "+PolicyNo);
		driver.findElement(By.id("C")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		//Here we need to do the Receipting.
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//img[@src=\"screenFiles/eng/menu/Receivables and Payables.png\"]")).click();
		driver.findElement(By.xpath("//a[text()='Receipts']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.name("bankcode")).sendKeys("Singapore Dollar Bank Account");
		driver.findElement(By.id("F")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.name("zrnofrec01")).sendKeys("1");
		driver.findElement(By.name("totalamt01")).sendKeys("150000");
		System.out.println("line no 194 = " +PolicyNo);
		//driver.findElement(By.xpath("//input[@id=\"sr203screensfl.chdrnum_R1\"]")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=\"sr203screensfl.chdrnum_R1\"]")).sendKeys(PolicyNo);
		driver.findElement(By.name("sr203screensfl.tranamt_R1")).sendKeys("150000");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id=\"sr203screensfl.chdrnum_R1\"]")).sendKeys(Keys.CONTROL,Keys.BACK_SPACE);
		//driver.findElement(By.xpath("//input[@id=\"sr203screensfl.chdrnum_R1\"]")).sendKeys(PolicyNo);
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//img[@src='screenFiles/eng/menu/ProposalsNewBusiness.png']")).click();
		driver.findElement(By.xpath("//a[text()='Contract Issue']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//input[@id='chdrsel']")).sendKeys(PolicyNo);
		driver.findElement(By.xpath("//input[@id='A']")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='refreshbutton']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		//Policy Created we need PolicyNo For Issue Proposal
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//img[@src='screenFiles/eng/menu/ProposalsNewBusiness.png']")).click();
		driver.findElement(By.xpath("//a[text()='New Contract Proposal']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//input[@id='chdrsel']")).sendKeys(PolicyNo);
		driver.findElement(By.id("F")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		//Policy Created we need PolicyNo For Contract Enquiry
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.xpath("//a[contains(text(),'Transaction History')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'T642')]")).getText(), "T642");
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'T642')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'T6A0')]")).getText(), "T6A0");
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'T6A0')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'T600')]")).getText(), "T600");
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'T600')]")).getText());
		driver.findElement(By.id("s6233screensfl.select_R1")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Financial Details')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.close();
		
		}
	  public static String getContractno(WebDriver driver)
	{
		  String ContractNumber = driver.findElement(By.xpath("//div[contains(text(),'is created')]")).getText();
		  //Proposal 00123549 is created
		  //0th index = Proposal 00123549
		  //1st index =  is created
		  String Array1[] = ContractNumber.split("is"); 
	      System.out.println("Arrey[0] =" + Array1);
		  String X[]  = Array1[0].split("l ");   
		  System.out.println("x vakue is =" + X);
		  String pa = X[1];
		  System.out.println("pa =" +pa);	
		  pa.trim();
		  return pa;
	  }
	 public static String getClientno(WebDriver driver) 
		{
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  String ClientNumber = driver.findElement(By.xpath("//*[contains(text(),'created')]")).getText();
			   //Client 50261619 created
		      System.out.println("ClientNumber= " + ClientNumber);
			  String Y[] = ClientNumber.split(" ");
			  String clientId = Y[1];
			  System.out.println("Clno =" +clientId);	
			  clientId.trim();
			  return clientId;
		}
			  

}
