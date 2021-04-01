package com.BlueBird.PageObjects.OrganizationGroups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.Util.Variables;

public class OrganizationalGroups extends BasePage {
	private WaitHelper waithelper;
	
	
	public OrganizationalGroups(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);
	}
	
	/** click on Organizational groups option */
	@FindBy(xpath = "//h3[contains(text(),'Organizational Groups')]")
	private WebElement ogroups;
	public void clickonogroups() throws InterruptedException {	
			webElementHelper.click(ogroups);		
	}
	
	/** click on New button */
	@FindBy(xpath = "//button[contains(text(),'+ New')]")
	private WebElement New;
	public void clickonNew() throws InterruptedException {	
			webElementHelper.click(New);		
	}
	
	/** click on New Group button */
	@FindBy(xpath = "//a[(text()='Group')]")
	private WebElement NewGroup;
	public void clickonNewGroup() throws InterruptedException {	
			webElementHelper.click(NewGroup);		
	}
	
	/** click on Group Name textbox & Enter Group Name*/
	@FindBy(xpath = "//input[@id='newGroupName']")
	private WebElement GroupaName;
	public void enterGroupName() throws InterruptedException {
		webElementHelper.click(GroupaName);	
		Variables.groupName =generateData.generateRandomString(6);
		webElementHelper.TypeInto(GroupaName,Variables.groupName);
				
	}
	
	/** click on Save button */
	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	private WebElement SaveChange;
	public void clickonSaveChanges() throws InterruptedException {	
			webElementHelper.click(SaveChange);		
	}
	
	@FindBy(xpath = "//p[text()='Organizational Group Saved']")
	private WebElement GroupSavedPopup;
	public void VerifyGroupSavedPopup() {
		waithelper.WaitForElementVisible(GroupSavedPopup);
		driver.navigate().refresh(); 
		driver.switchTo().alert().accept();
	}
	
	@FindBy(xpath = "//p[text()='Region saved']")
	private WebElement RegionSavedPopup;
	public void VerifyRegionSavedPopup() {
		waithelper.WaitForElementVisible(RegionSavedPopup);
		driver.navigate().refresh(); 
		driver.switchTo().alert().accept();
	}
	
	@FindBy(xpath = "//p[text()='Branch saved']")
	private WebElement BranchSavedPopup;
	public void VerifyBrnchSavedPopup() {
		waithelper.WaitForElementVisible(BranchSavedPopup);
		driver.navigate().refresh(); 
		driver.switchTo().alert().accept();
	}
	
	/** click on New Region button */
	@FindBy(xpath = "//a[normalize-space()='Region']")
	private WebElement NewRegion;
	public void clickonNewRegion() throws InterruptedException {	
			webElementHelper.click(NewRegion);		
	}
	
	/** click on Region Name textbox & Enter Group Name*/
	@FindBy(xpath = "//input[@id='newBranchRegionName']")
	private WebElement RegionName;
	public void enterRegionName() throws InterruptedException {
		webElementHelper.click(RegionName);	
		webElementHelper.TypeInto(RegionName, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region address line1*/
	@FindBy(xpath = "//input[@id='addressLine1']")
	private WebElement RegionAddress1;
	public void enterRegionAddress1() throws InterruptedException {
		webElementHelper.click(RegionAddress1);	
		webElementHelper.TypeInto(RegionAddress1, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region address line2*/
	@FindBy(xpath = "//input[@id='addressLine2']")
	private WebElement RegionAddress2;
	public void enterRegionAddress2() throws InterruptedException {
		webElementHelper.click(RegionAddress2);	
		webElementHelper.TypeInto(RegionAddress2, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region City Name*/
	@FindBy(xpath = "//input[@id='addressCity']")
	private WebElement RegionCity;
	public void enterRegionCity() throws InterruptedException {
		webElementHelper.click(RegionCity);	
		webElementHelper.TypeInto(RegionCity, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region State*/
	@FindBy(xpath = "//input[@id='addressStateProvince']")
	private WebElement RegionState;
	public void enterRegionState() throws InterruptedException {
		webElementHelper.click(RegionState);	
		webElementHelper.TypeInto(RegionState, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region Postal code*/
	@FindBy(xpath = "//input[@id='addressPostalCode']")
	private WebElement Regionpcode;
	public void enterRegionpcode() throws InterruptedException {
		webElementHelper.click(Regionpcode);	
		webElementHelper.TypeInto(Regionpcode, generateData.generateRandomString(6));
				
	}
	
	/** Enter Region Country*/
	@FindBy(xpath = "//input[@id='addressCountry']")
	private WebElement Regioncountry;
	public void enterRegioncountry() throws InterruptedException {
		webElementHelper.click(Regioncountry);	
		webElementHelper.TypeInto(Regioncountry, generateData.generateRandomString(6));
				
	}
	
	/** click on New Branch button */
	@FindBy(xpath = "//a[normalize-space()='Branch']")
	private WebElement NewBranch;
	public void clickonNewBranch() throws InterruptedException {	
			webElementHelper.click(NewBranch);		
	}
	
	/** click on Branch Name textbox & Enter Group Name*/
	@FindBy(xpath = "//input[@id='newBranchRegionName']")
	private WebElement BranchName;
	public void enterBranchName() throws InterruptedException {
		webElementHelper.click(BranchName);	
		webElementHelper.TypeInto(BranchName, generateData.generateRandomString(6));
				
	}
	public void SelectStoredGroupName() throws InterruptedException {
		String xpath=String.format("//a[text()='%s']", Variables.groupName);
		webElementHelper.scrollToElement(webElementHelper.getElement(By.xpath(xpath)));
		webElementHelper.click(webElementHelper.getElement(By.xpath(xpath)));
		Thread.sleep(2000);
		
	}
	
	/** click on Edit button */
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	private WebElement Edit;
	public void clickonEdit() throws InterruptedException {
		waithelper.WaitForElementVisible(Edit);
			webElementHelper.click(Edit);		
	}
	
	/** click on Attribute dropdown */
	@FindBy(xpath = "//select[@id='attribute-value']")
	private WebElement GroupAttribute;
	public void clickonGroupAttribute() throws InterruptedException {
			waithelper.WaitForElementVisible(GroupAttribute);
			webElementHelper.click(GroupAttribute);	
			//webElementHelper.selectFromText(null, "Regional");
			webElementHelper.selectFromDropDown("Regional");
			webElementHelper.click(SaveChange);
	}
	public void VerifyUpdatePopup() {
		waithelper.WaitForElementVisible(GroupSavedPopup);
		
	}

}
