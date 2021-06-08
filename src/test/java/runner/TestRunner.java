package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import utils.TestBase;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//features", glue = { "stepsDefinitions", "utils" }, plugin = {
		"html:target/site/cucumber-pretty","json:target/cucumber.json"}, monochrome = true, strict = true, dryRun = false, tags = {
				"@TC_quiz_03" })

public class TestRunner extends TestBase {
	private TestNGCucumberRunner testNGCucumberRunner; 
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

	@Test(dataProvider = "feature")
	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());

	}
	
	@DataProvider
	public Object[][] feature() {

		return testNGCucumberRunner.provideScenarios();

	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();

	}

}
