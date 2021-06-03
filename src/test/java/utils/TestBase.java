package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	private static ChromeOptions chromeOptions;
	Properties p = PropertyHelper.loadData();
	private String BROWSER = p.getProperty("browser");
	private String URL = p.getProperty("url");

	@BeforeMethod
	public void createAndStartService() throws IOException {

		if (BROWSER.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().version("91.0").setup();
			ArrayList<String> optionsList = new ArrayList<String>();
			chromeOptions = new ChromeOptions();
			optionsList.add("--start-maximized");
			optionsList.add("--incognito");
			optionsList.add("disable-notifications");
			chromeOptions.addArguments(optionsList);
			chromeOptions.addArguments(optionsList);
			chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			driver = (WebDriver) new ChromeDriver(chromeOptions);

		} else if (BROWSER.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (BROWSER.equalsIgnoreCase("Safari")) {
			SafariOptions options = new SafariOptions();
			options.setUseTechnologyPreview(true);
			driver = new SafariDriver(options);

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.navigate().to(URL);

	}

	@AfterMethod
	public static void quitDriver() {

		driver.quit();

	}
	
	public static WebDriver getDriver() {

		return driver;

	}

}
