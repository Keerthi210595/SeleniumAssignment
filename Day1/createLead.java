package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

	public static void main(String[] args) throws InterruptedException {
		
	 ChromeDriver driver =new ChromeDriver(); 
		
	  driver.manage().window().maximize(); // maximize window
		
		driver.get("http://leaftaps.com/opentaps/"); //get to open URL
		driver.findElement(By.id("username")).sendKeys("democsr"); //send keys for input
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Create lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnamoorthy");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		driver.findElement(By.className("smallSubmit")).click();
		
		String actualTitle = "View Lead | opentaps CRM";
        String title = driver.getTitle();
        System.out.println(title);
        
        if (title.equals(actualTitle))
        		System.out.println("Correct Title");
        else
        	System.out.println("Incorrect Title");
        
       Thread.sleep(1000);
       driver.close();
		
	}

}
