package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

	@Test
	public void verifyLoginCRMSFAPage() {
		
		//System.out.println(driver);
		
		new LoginPage().enterUserName("D Data, Actual Data picked from Examples").enterPassword("D Data, Actual Data picked from Examples").clickOnTheLoginBtn()
		.verifyLogin();
	}
}
