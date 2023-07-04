package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

	@Test
	public void verifyLoginCRMSFAPage() throws InterruptedException {
		
		//System.out.println(driver);
		
		new LoginPage().enterUserName("Democsr2").enterPassword("crmsfa").clickOnTheLoginBtn()
		.verifyLogin();
	}
}
