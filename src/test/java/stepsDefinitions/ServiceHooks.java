package stepsDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestBase;
import utils.ScreenShots;

public class ServiceHooks {
protected WebDriver driver;

	
	@Before
	public void setUpTest() {
		this.driver = TestBase.getDriver();
	}
	
	
	@After
	public void endTest(Scenario scenario) throws IOException {
		   ScreenShots.takeScreenShots(scenario, driver);
		   ScreenShots.takeScreenShotsCucumberReport(scenario, driver);
	
	}
}
