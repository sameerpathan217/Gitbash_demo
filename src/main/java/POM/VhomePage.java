package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VhomePage {
	
	public VhomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	  @FindBy(name="user_name")
	  private WebElement uName;
	  
	  @FindBy(name="user_password")
	  private WebElement uPass;
	  
	  @FindBy(id="submitButton")
	  private WebElement Submit;
	  
	  
	  @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	  private WebElement logoutImg;
	  

	  @FindBy(xpath="//a[text()='Sign Out']")
	  private WebElement logout;


	public WebElement getuName() {
		return uName;
	}


	public WebElement getuPass() {
		return uPass;
	}


	public WebElement getSubmit() {
		return Submit;
	}


	public WebElement getLogoutImg() {
		return logoutImg;
	}


	public WebElement getLogout() {
		return logout;
	}
	  
	  public void Credential(String a, String b) {
		  uName.sendKeys(a);
		  uPass.sendKeys(b);
	  }
	  
	  public void SubmitBtn() {
		  Submit.click();
	  }
	  
	  public void LogoutBtn() {
		  logoutImg.click();
		  logout.click();
	  }
}
