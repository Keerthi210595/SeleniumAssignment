package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
/*
 * 
	
	driver.findElement(By.className("decorativeSubmit")).click();
 */

public class LoginPage extends ProjectSpecificMethods {
	
	
	public LoginPage enterUserName() {	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();

	}


	
	
	
	
	
	

}
