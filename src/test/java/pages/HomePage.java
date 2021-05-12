package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
WebDriver driver;

@FindBy(id = "home")
private WebElement homeText;

public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}


public void assertHomeText() {
	Assert.assertEquals(homeText.getText(), "Home");
	
}
}
