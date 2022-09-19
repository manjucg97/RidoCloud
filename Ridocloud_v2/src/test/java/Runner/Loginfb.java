package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Manjunatha C G\\eclipse-workspace\\Ridocloud_v2\\src\\test\\java\\Feature\\Login.feature"},
		glue={"Stepdefination"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:reports\\login.html"}
			)

public class Loginfb extends AbstractTestNGCucumberTests
{

}
