package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class CreateContacts extends BaseClass {
	
	@BeforeTest
	public void fileNamePass() {
		excelFileName = "dataForContactsTab";
	}

	@Test//(dataProvider = "contacts_Data")
	public void runCreateContacts() throws InterruptedException {
		
		new LoginPage().enterUserName("Democsr").enterPassword("crmsfa").clickOnTheLoginBtn()
		.verifyLogin().clickCRMSFA()
		.clickOnContactsTab()
		.clickCreateContacts()
		.enterFirstName("Dummy").enterLastName("Dummy").enterPINCode("Dummy").clickCreateContact()
		.verifyFirstName("Dummy");
	}
}
