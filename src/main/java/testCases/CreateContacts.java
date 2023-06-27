package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class CreateContacts extends BaseClass {

	@Test
	public void runCreateContacts() {
		
		new LoginPage().enterUserName().enterPassword().clickOnTheLoginBtn()
		.verifyLogin().clickCRMSFA()
		.clickOnContactsTab()
		.clickCreateContacts()
		.enterFirstName().enterLastName().enterPINCode().clickCreateContact()
		.verifyFirstName();
	}
}
