package new1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new  ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
			driver.findElement(By.cssSelector("#btnLogin")).click();
			
			driver.findElement(By.id("#menu_leave_viewLeaveModule")).click();
			Thread.sleep(1000);	
			
		
		
		
		
		
	}

}
