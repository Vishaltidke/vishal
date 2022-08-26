package sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twowindow {
	public static void main(String[]args)throws InterruptedException{
		
	  	System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver_win32\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
		
     	driver.get("https://groww.in/");
     	driver.manage().window().maximize();
     	
     	Set<String> winId1 = driver.getWindowHandles();
     	driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
     	Thread.sleep(500);
     	 Set<String> winIdALL=driver.getWindowHandles();
     	 int nowinIdpresent=winIdALL.size();
     	  if (nowinIdpresent>1) {
     		  for (String singlewinid:winIdALL) {
     			  if(!(singlewinid.equals(winId1))) {
     				  driver.switchTo().window(singlewinid);
     				  driver.findElement(By.id("login_email1")).sendKeys("vishal");
     				  driver.findElement(By.xpath("//*[text()='Continue']")).click();


     			  }
     		  }
     		  
     	  }
     	 
     	  else
				  driver.findElement(By.id("login_email1")).sendKeys("vishal");
			  driver.findElement(By.xpath("//*[text()='Continue']")).click();


		
	}

}
