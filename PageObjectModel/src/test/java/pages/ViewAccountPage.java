package pages;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods {
	
	public ViewAccountPage viewAccDetails() {
		System.out.println(driver.getTitle());
		return this;
	}

}
