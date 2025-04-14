package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcall {
	
	//constructor call
	public Productcall(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product;
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement Cproduct;
	
	@FindBy(name="productname")
	private WebElement pname;
	
	@FindBy(name="button")
	private WebElement save;
	
// getters method
	public WebElement getProduct() {
		return product;
	}

	public WebElement getCproduct() {
		return Cproduct;
	}

	public WebElement getPname() {
		return pname;
	}

	public WebElement getSave() {
		return save;
	}
	
	public void Crtproduct() {
		product.click();
		Cproduct.click();
	}
	
	public void pdtNmae(String name) {
		pname.sendKeys(name);
		save.click();
	}
	

}
