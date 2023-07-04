package runnerForCucumber;

import org.testng.annotations.DataProvider;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "./src/main/java/features", glue = "pages", monochrome = true)
public class Runner extends BaseClass{

	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
