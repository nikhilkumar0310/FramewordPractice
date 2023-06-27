package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;

public class ViewContactsPage extends BaseClass{
	
	public ViewContactsPage verifyFirstName(String fNamePage) {
		String firstNamePresent = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		Assert.assertEquals(firstNamePresent, fNamePage);
		return this;
	}

}
