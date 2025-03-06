package week3.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);

		// click on contacts
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// To choose From Contact
		driver.findElement(By.xpath("(//img[@src=\"/images/fieldlookup.gif\"])[1]")).click();
		Set<String> ContactWindow = driver.getWindowHandles();
		List<String> cw = new ArrayList<String>(ContactWindow);
		driver.switchTo().window(cw.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement fromCon = driver.findElement(By.xpath("//a[text()='DemoCustomer']"));
//        WebDriverWait waits = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));  //since element is not available immediately
//        waits.until(ExpectedConditions.elementToBeClickable(fromCon)); //explicit wait with condition
		fromCon.click();

		driver.switchTo().window(cw.get(0));

		// to choose To contact
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//img[@src=\"/images/fieldlookup.gif\"])[2]")).click();
		Set<String> ToContactWindow = driver.getWindowHandles();
		List<String> tcw = new ArrayList<String>(ToContactWindow);
		driver.switchTo().window(tcw.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement ToCon = driver.findElement(By.xpath("//a[text()='DemoLBCust']"));
		ToCon.click();
		driver.switchTo().window(tcw.get(0));
		System.out.println(driver.getTitle());

		// click on Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

		driver.quit();

	}

}
