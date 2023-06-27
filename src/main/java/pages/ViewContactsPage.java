package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;

public class ViewContactsPage extends BaseClass{
	
	public ViewContactsPage verifyFirstName() {
		boolean firstNamePresent = driver.findElement(By.id("viewContact_firstName_sp")).isDisplayed();
		Assert.assertEquals(true, firstNamePresent);
		return this;
	}

}
