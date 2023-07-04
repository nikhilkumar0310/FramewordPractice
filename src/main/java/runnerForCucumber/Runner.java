package runnerForCucumber;

import org.testng.annotations.DataProvider;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "./src/main/java/features/CreateContacts.feature", glue = "pages", monochrome = true)
public class Runner extends BaseClass{

	@DataProvider(parallel = false)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
