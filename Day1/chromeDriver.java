package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
	
	private static String title;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		driver.wait(10000);
		
		driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("TestAcc");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        driver.findElement(By.id("numberEmployees")).sendKeys("2");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();
		
        String actualTitle = "Create Account | opentaps CRM";
        String title = driver.getTitle();
        System.out.println(title);
        
        if (title.equals(actualTitle))
        		System.out.println("Correct Title");
        else
        	System.out.println("Incorrect Title");
        
       Thread.sleep(1000);
//		driver.close();
		
		
		}


}
