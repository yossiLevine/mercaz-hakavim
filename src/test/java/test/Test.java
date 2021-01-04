package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjec.homePageObject;

public class Test {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			homePageObject lc = new homePageObject (driver);
			driver.manage().window().maximize();
			driver.get("https://merkaz.clickcall.co.il/serverscall/admin/login.php");

			
			lc.login("74740449", "123456");
			
	}
	
	

}
