package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
WebDriver driver;

@FindBy(id = "home1")
private WebElement homeText;

@FindBy(id="Home")
private WebElement homeOption;

@FindBy(id ="menuButton")
private WebElement menuButton;

@FindBy(id ="Proyectos")
private WebElement proyjectOption;


public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}


public void assertHomeText() {
	Assert.assertEquals(homeText.getText(), "Home");
	
}

public void clickProjectOption() {
	proyjectOption.click();
	
}
}
