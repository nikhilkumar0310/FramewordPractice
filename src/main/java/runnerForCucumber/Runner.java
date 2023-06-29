package runnerForCucumber;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "./src/main/java/features", glue = "pages", monochrome = true)
public class Runner extends BaseClass{

	
}
