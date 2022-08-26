package check;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	   public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
		}	

}
