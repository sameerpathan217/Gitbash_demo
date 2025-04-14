package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {
	
	
	public OrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(xpath="//a[.='Organizations']")
	public WebElement org;
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	public WebElement crtOrg;
	
	@FindBy(xpath="//input[@name='accountname']")
	public WebElement accdata;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	public WebElement saveBtn;

	public WebElement getOrg() {
		return org;
	}

	public WebElement getCrtOrg() {
		return crtOrg;
	}

	public WebElement getAccdata() {
		return accdata;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void Organizations() {
		 org.click();
	}
	
	
}

