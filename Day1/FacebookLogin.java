package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		 ChromeDriver driver =new ChromeDriver(); 
			
		  driver.manage().window().maximize(); // maximize window
			
			driver.get("https://www.facebook.com/"); 
			driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Tuna@321");
			driver.findElement(By.name("login")).click();
			driver.findElement(By.linkText("Find your account and log in.")).click();
//			driver.findElement(By.id("identify_email")).sendKeys("testleaf.2023@gmail.com");
//			driver.findElement(By.id("did_submit")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
	}

}
