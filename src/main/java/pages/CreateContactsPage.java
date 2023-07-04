package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;
import io.cucumber.java.en.Given;

public class CreateContactsPage extends BaseClass{
	

	@Given("I enter first name of new Contact as {string}")
	public CreateContactsPage enterFirstName(String fpgName) {
		getDriver().findElement(By.id("firstNameField")).sendKeys(fpgName);
		return this;
	}
	
	
	@Given("I enter last name of new Contact as {string}")
	public CreateContactsPage enterLastName(String lpgName) {
		getDriver().findElement(By.id("lastNameField")).sendKeys(lpgName);
		return this;
		
	}
	
	@Given("I enter Area Pin Code of new Contact as {string}")
	public CreateContactsPage enterPINCode(String pPgCode) {
		getDriver().findElement(By.id("createContactForm_generalPostalCode")).sendKeys(pPgCode);
		return this;
	}
	
	
	@Given("I click on the Create Contacts Submit Button")
	public ViewContactsPage clickCreateContact() {
		getDriver().findElement(By.xpath("//input[@value='Create Contact']")).click();
		return new ViewContactsPage();
	}

}
