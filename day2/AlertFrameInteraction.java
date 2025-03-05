package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrameInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//switch to Try button frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//Provide input in alert and click OK
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Keerthana");
		alert.accept();
		
		//Get the text after accepting the prompt
		String ClickAction = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(ClickAction);
	
		
		driver.close();
		}

}
