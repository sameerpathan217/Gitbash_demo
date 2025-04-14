package Genric_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This claas used for reusable method
 * @author SAMEER PATHAN
 *
 */

public class WebDriver_Utility {

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void impWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	}
	public void expWit(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void handledropdown(WebElement element, String text) {
		Select sat=new Select(element);
		sat.selectByVisibleText(text);
	}
	
	public void MouseAction(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void MouseDragDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	
	public void MouseDoubleclk(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void ScrollAction(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0.500);","");
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void dismisstAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method used to return text of alert
	 * @param driver
	 * @return
	 */
	public String gettAlertText(WebDriver driver) {
	String alertText = driver.switchTo().alert().getText();
	return alertText;
	}
	/**
	 * This method is used to handle frame using differnt types
	 * @param driver
	 * @param index
	 */
	public void handlrFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void handlrFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void handlrFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public String captureScreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File  src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+screenshotname+".png");
		Files.copy(src, dest);
		
		return dest.getAbsolutePath();//extent report
		
	}
	
}
