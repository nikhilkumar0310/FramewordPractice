package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;
import io.cucumber.java.en.Given;

public class LoginPage extends BaseClass{

	
	@Given("I enter username as {string}")
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	@Given("I enter password as {string}")
	public LoginPage enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
	}
	
	@Given("I click on the login button")
	public HomePage1 clickOnTheLoginBtn() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new HomePage1();
		
	}
}
