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
	public void runCreateContacts() {
		
		new LoginPage().enterUserName("Trial Username").enterPassword("Trail Password").clickOnTheLoginBtn()
		.verifyLogin().clickCRMSFA()
		.clickOnContactsTab()
		.clickCreateContacts()
		.enterFirstName("Dummy").enterLastName("Dummy").enterPINCode("Dummy").clickCreateContact()
		.verifyFirstName("Dummy");
	}
}
