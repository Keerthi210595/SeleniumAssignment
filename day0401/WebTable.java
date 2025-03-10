package week4.day0401;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications "); //this will disable notification
		
		ChromeDriver driver=new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		
		List<WebElement> Traincount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tbody/tr/td[2]"));
		System.out.println("Train count: "+Traincount.size());
		
		//to remove duplicate train name
		Set<String> TrainName = new HashSet<String>();
		
		for(int i=2;i<=Traincount.size(); i++) {
			String name = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			TrainName.add(name);
		}
		
		System.out.println("After removing duplicate"+ TrainName.size());
		
		driver.close();
	
	}

}
