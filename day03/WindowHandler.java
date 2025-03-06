package week3.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandler {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println("Parent Window Title: "+driver.getTitle());
		
		
		//click on Flights
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> windowopened = driver.getWindowHandles();
		List<String> OpenWindows = new ArrayList<String>(windowopened);
		
		driver.switchTo().window(OpenWindows.get(1)); //switches to flight window
		System.out.println("Child window Title:"+driver.getTitle());
		
		driver.quit();  //closes entire chrome browser
		
	}

}
