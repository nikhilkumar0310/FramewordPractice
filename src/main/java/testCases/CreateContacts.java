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

	@Test(dataProvider = "contacts_Data")
	public void runCreateContacts(String fName, String lName, String pCode) {
		
		new LoginPage(driver).enterUserName().enterPassword().clickOnTheLoginBtn()
		.verifyLogin().clickCRMSFA()
		.clickOnContactsTab()
		.clickCreateContacts()
		.enterFirstName(fName).enterLastName(lName).enterPINCode(pCode).clickCreateContact()
		.verifyFirstName(fName);
	}
}
