package BrowserTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Genric_Utility.Excel_Utility;
import Genric_Utility.PropertyFile;
import Genric_Utility.WebDriver_Utility;
import POM.Productcall;
import POM.VhomePage;

public class CreateProduct {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		PropertyFile pf=new PropertyFile();
		String URL = pf.getPropertyData("url");
		String USER = pf.getPropertyData("user");
		String PASS = pf.getPropertyData("pass");
		
		driver.get(URL);
		
	//	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		VhomePage vp=new VhomePage(driver);
		vp.Credential(USER, PASS);
		vp.SubmitBtn();
		
	//	driver.findElement(By.name("user_name")).sendKeys(USER);
		//driver.findElement(By.name("user_password")).sendKeys(PASS);
		
		WebDriver_Utility wu=new WebDriver_Utility();
		
		wu.maximize(driver);
		Thread.sleep(3000);
		wu.minimize(driver);
	//	driver.findElement(By.id("submitButton")).click();
		wu.impWait(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	//	driver.findElement(By.xpath("//a[text()='Products']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		//driver.findElement(By.name("productname")).sendKeys("myproduct");
		//driver.findElement(By.name("button")).click();
		
		Excel_Utility eu=new Excel_Utility();
		String data = eu.ExcelData("Sheet1", 0, 0);
		Productcall p=new Productcall(driver);
		p.Crtproduct();
		p.pdtNmae(data);
		
		
		vp.getLogoutImg();
		vp.LogoutBtn();
		
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		

	}

}
