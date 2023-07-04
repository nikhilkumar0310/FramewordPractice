package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;
import io.cucumber.java.en.Given;


public class MyHomePage2 extends BaseClass{

	@Given("I click on the Contacts Tab in MyHomePage")
	public ContactsPage clickOnContactsTab() {
		getDriver().findElement(By.linkText("Contacts")).click();
		return new ContactsPage();
	}

}
