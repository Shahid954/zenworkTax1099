package com.zenwork.pageObject;

import org.openqa.selenium.WebDriver;

import com.zenwork.library.AppLibrary;

public class People {
	private AppLibrary appLibrary;
	private WebDriver driver;
	public String managePayer = "xpath:-://a[text()='Manage Payer']";
	public String manageRecipient = "xpath:-://a[text()='Manage Recipient']";
	public String copyRecipient = "xpath:-://a[text()='Copy Recipient']";
	

	public People(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyPeopleOptionsUi() throws Exception {
		AppLibrary.verifyElement(driver, managePayer, true);
		AppLibrary.verifyElement(driver, manageRecipient, true);
		AppLibrary.verifyElement(driver, copyRecipient, true);
	}

	
	public ManageRecipient selectManageRecipient() throws Exception {
		AppLibrary.waitTillElementLoaded(driver, manageRecipient);
		AppLibrary.clickElement(driver, manageRecipient);
		return new ManageRecipient(appLibrary);
	}
	
	public ManagePayerPage selectManagePayer() throws Exception {
		AppLibrary.waitTillElementLoaded(driver, managePayer);
		AppLibrary.clickElement(driver, managePayer);
		return new ManagePayerPage(appLibrary);
	}
	
	public void selectCopyRecipient() throws Exception {
		AppLibrary.clickElement(driver, copyRecipient);	
	}
}
