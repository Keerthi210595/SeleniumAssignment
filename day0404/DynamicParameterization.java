package week4.day0404;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DynamicParameterization {

	WebDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeTest
	public void SalesforceLogin(String url,String uname, String pswd) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}
	
	@DataProvider(name= "inputData")
	public String[][] sendData() {
		String[][] data = new String[2][1];
		data[0][0] = "Salesforce Automation by Keerthana";
		data[1][0] = "test";
		return data;
	}
	
	
	@Test(dataProvider = "inputData")
	public void legalEntity(String name) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement LE = driver.findElement(By.xpath("(//div[@class='slds-accordion__content'])[2]//ul//li//p[text()='Legal Entities']"));
		action.scrollToElement(LE).perform();
		action.moveToElement(LE).click().perform();
//		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='New']")).click();  //New legal entity
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, name, "Title is not matching");
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void driverClose() {
		driver.close();
	}

}
