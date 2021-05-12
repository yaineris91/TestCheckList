package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.core.api.Scenario;


public class ScreenShots {
	public static void takeScreenShots(Scenario scenario,WebDriver driver) throws IOException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
		Log.info("Scenario failed:" + screenshotName);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("images/" + screenshotName + ".png");
		FileUtils.copyFile(srcFile, targetFile);
		
		}else {
			Log.info("Scenario passed:" + screenshotName);
		}
		
	}
	
	public static void takeScreenShotsCucumberReport(Scenario scenario, WebDriver driver ) throws IOException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			   // embed it in the report.
			      scenario.embed(screenshot, "image/png"); 
		
		}else {
			Log.info("Scenario passed:" + screenshotName);
		}
		
	}
}
