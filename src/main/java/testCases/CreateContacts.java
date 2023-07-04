package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.HomePage1;

public class CreateContacts extends BaseClass {
	
	@BeforeTest
	public void fileNamePass() {
		excelFileName = "dataForContactsTab";
	}

	@Test(dataProvider = "contacts_Data")
	public void runCreateContacts(String fName, String lName, String pCode) throws InterruptedException {
		
		//new LoginPage().enterUserName("Democsr").enterPassword("crmsfa").clickOnTheLoginBtn()
		new HomePage1().verifyLogin().clickCRMSFA()
		.clickOnContactsTab()
		.clickCreateContacts()
		.enterFirstName(fName).enterLastName(lName).enterPINCode(pCode).clickCreateContact()
		.verifyFirstName(fName);
	}
}
