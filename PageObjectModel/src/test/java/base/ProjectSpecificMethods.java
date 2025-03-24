package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	// before declaring the variable without static keyword it will --> default value variale driver ?
	// Null
	
	
	@BeforeMethod
	public void preConditon() {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();

	}

}
