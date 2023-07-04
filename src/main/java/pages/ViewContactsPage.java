package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;

public class ViewContactsPage extends BaseClass{

	@Then("I verfy the first name of the Contact Created as {string}")
	public ViewContactsPage verifyFirstName(String fNamePage) {
		String firstNamePresent = getDriver().findElement(By.id("viewContact_firstName_sp")).getText();
		Assert.assertEquals(firstNamePresent, fNamePage);
		return this;
	}

}
