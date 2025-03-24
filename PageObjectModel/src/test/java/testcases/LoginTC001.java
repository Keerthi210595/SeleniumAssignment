package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginTC001 extends ProjectSpecificMethods{
	
	@Test
	public void runLogin(){
		
//		LoginPage lp = new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRM()
		.clickAccounts()
		.createAccount()
		.accname().description().noOfEmp().officialSiteName().clicksave().viewAccDetails();
		
		
		
		
		
		
		
		

	}

}
