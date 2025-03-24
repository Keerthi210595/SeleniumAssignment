package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeads clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
		return new MyLeads();
	}
	
	public MyAccountPage clickAccounts() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		return new MyAccountPage();
	}

}
