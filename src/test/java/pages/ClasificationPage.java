package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.Common;

public class ClasificationPage {
	WebDriver driver;
	@FindBy(id = "new")
	private WebElement newButton;
	
	@FindBy(id = "name")
	private WebElement nameTextField;
	
	@FindBy(id ="titleTable")
	private WebElement nameTable;
	
	public ClasificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void assertTheClasificationPageIsOpen() {
		Assert.assertEquals(nameTable.getText(), "Listado de Clasificaciones");
		
	}
	
	public void assertTheClasificationIsOnTheTable(String clasificationName) {
		Assert.assertEquals(Common.elementIsPresentOnTheTable( clasificationName,"//*[@id=\"clasificationtable\"]/div[2]/table/tbody",  driver), true);
		
	}
	
	public void assertTheClasificationIsRemovedCorrectly(String clasificationName) {
		Assert.assertEquals(Common.elementIsPresentOnTheTable( clasificationName,"//*[@id=\"clasificationtable\"]/div[2]/table/tbody",  driver), false);
		
	}
	
	public void clickNewClasificationButton() {
		newButton.click();
		
	}
	
	public void enterClasificationName(String name) {
		nameTextField.sendKeys(name);
		
	}
	
	public void selectClasificationAndClickEditButton(String clasificationName) {
		Common.searchElementOnTheTableAndClickOnTheButton(clasificationName, "editTable","//*[@id=\"clasificationtable\"]/div[2]/table/tbody", driver);
		 
	}
	
	public void selectProjectAndClickDeleteButton(String clasificationName) {
		Common.searchElementOnTheTableAndClickOnTheButton(clasificationName, "deleteTable","//*[@id=\"clasificationtable\"]/div[2]/table/tbody",  driver);
		   
	}
	
	public void editClasificationName(String newClasificationName) {
		nameTextField.clear();
		nameTextField.sendKeys(newClasificationName);
	}
	
	
	
	
	
	
}
