package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.HomePage1;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

	@Test
	public void verifyLoginCRMSFAPage() throws InterruptedException {
		
		//System.out.println(driver);
		
//		new LoginPage().enterUserName("Democsr2").enterPassword("crmsfa").clickOnTheLoginBtn() // This is the common part for which the calls
//		have been shifted to BaseClass and the arguments(common fields like URL, Username, Password and Language) are being called with help of properties class object
		new HomePage1().verifyLogin();
	}
}
