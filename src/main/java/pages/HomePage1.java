package pages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage1 extends BaseClass {

	@Then("I verify the HomePage")
	public HomePage1 verifyLogin() {
		String welcomeText = getDriver().findElement(By.linkText("CRM/SFA")).getText();
		SoftAssert soa = new SoftAssert();
		soa.assertEquals(welcomeText, "CRM/SFA", "Login was Successfull");
		soa.assertAll();
		return this;
	}

	@Given("I click the CRMSFA Link")
	public MyHomePage2 clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage2();
	}

}
