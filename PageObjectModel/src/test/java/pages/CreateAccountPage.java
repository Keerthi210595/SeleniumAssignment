package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods {
	
	public CreateAccountPage accname() {
		driver.findElement(By.id("accountName")).sendKeys("Keerthana");
		return this;		
	}
	
	public CreateAccountPage description() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}
	
	public CreateAccountPage noOfEmp() {
	    driver.findElement(By.id("numberEmployees")).sendKeys("7");
	    return this;
	}
	
	public CreateAccountPage officialSiteName() {
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		return this;
	}
	
	public ViewAccountPage clicksave() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}
