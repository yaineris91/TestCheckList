package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.Common;

public class ProjectPage {
	WebDriver driver;
	@FindBy(id = "newproject")
	private WebElement newButton;

	@FindBy(id = "confirmDelete")
	private WebElement removeTableButton;
	
	@FindBy(id = "name")
	private WebElement nameTextField;
	
	@FindBy(id = "save")
	private WebElement saveOption;
	
	@FindBy(id = "cancel")
	private WebElement cancelOption;
	
	@FindBy(id = "titleTable")
	private WebElement nameTable;
	
	@FindBy(id = "toast")
	private WebElement messageTest;
	
	@FindBy(id = "yes1")
	private WebElement yesOption;
	
	public ProjectPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void assertTheProjectPageIsOpen() {
		Assert.assertEquals(nameTable.getText(), "Listado de Proyectos");
		
	}
	
	public void assertTheApplicationShowAMessage(String message) {
		String text=messageTest.getText();
		Assert.assertEquals( text.contains(message), true);
		
	}
	
	
	public void clickNewProjectButton() {
		newButton.click();
		
	}
	
	public void enterProject(String name) {
		nameTextField.sendKeys(name);
		
	}
	
	public void clickSaveButton() {
		saveOption.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
	public void clickYesOption() {
		yesOption.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
	
	
	public void selectProjectAndClickEditButton(String projectName) {
		Common.searchElementOnTheTableAndClickOnTheButton(projectName, "editButton","//*[@id=\"projecttable\"]/div[2]/table/tbody", driver);
		 
	}
	
	public void selectProjectAndClickDeleteButton(String projectName) {
		Common.searchElementOnTheTableAndClickOnTheButton(projectName, "deleteButton","//*[@id=\"projecttable\"]/div[2]/table/tbody",  driver);
		   
	}
	
	public void editProjectName(String newProjectName) {
		nameTextField.clear();
		nameTextField.sendKeys(newProjectName);
	}
	
	public void assertTheProjectIsOnTheTable(String projectName) {
		Assert.assertEquals(Common.elementIsPresentOnTheTable( projectName,"//*[@id=\"projecttable\"]/div[2]/table/tbody",  driver), true);
		
	}
	
	public void assertTheProjectIsRemovedCorrectly(String projectName) {
		Assert.assertEquals(Common.elementIsPresentOnTheTable( projectName,"//*[@id=\"projecttable\"]/div[2]/table/tbody",  driver), false);
		
	}
	
	
}
