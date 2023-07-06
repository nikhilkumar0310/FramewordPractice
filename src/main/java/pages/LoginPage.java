package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username") WebElement userName;
	public LoginPage enterUserName() {
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		userName.sendKeys("Demosalesmanager");
		return this;
	}
	
	
	@FindBy(id = "password") WebElement passWord;
	public LoginPage enterPassword() {
        //driver.findElement(By.id("password")) .sendKeys("crmsfa");
        passWord.sendKeys("crmsfa");
        return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@class='decorativeSubmit']") WebElement loginBtn;
	public HomePage1 clickOnTheLoginBtn() {
		//driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		loginBtn.click();
		return new HomePage1(driver);
		
	}
}
