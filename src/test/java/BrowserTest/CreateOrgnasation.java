package BrowserTest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Genric_Utility.Java_Utility;

public class CreateOrgnasation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	 driver.findElement(By.xpath("//a[.='Organizations']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	
	Random r=new Random();
	int no = r.nextInt();
	
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("sameer"+no);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
   
  
	Java_Utility ju=new Java_Utility();
System.out.println(ju.getSysdate());
		
	}

}
