package week4.day0401;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 200).perform();
		action.moveToElement(driver.findElement(By.xpath("//button[@aria-label='More']"))).perform();
		action.click(driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']"))).perform();
		System.out.println(driver.getTitle());
		action.scrollByAmount(0, 400).perform();
		
		List<WebElement> bitCoinsCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']/tbody/tr"));
		System.out.println("Bit Coin Count: "+bitCoinsCount.size());
		System.out.println("BitCoin Name: ");
		
		for(int i=1; i<= bitCoinsCount.size(); i++) {
			String name = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
		}
		driver.close();
		
	}

}
