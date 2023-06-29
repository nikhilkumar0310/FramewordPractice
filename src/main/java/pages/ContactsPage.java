package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;
import io.cucumber.java.en.Given;

public class ContactsPage extends BaseClass{

	
	@Given("I click on the Contacts Tab")
	public CreateContactsPage clickCreateContacts() {
		driver.findElement(By.linkText("Create Contact")).click();
		return new CreateContactsPage();
	}
}
