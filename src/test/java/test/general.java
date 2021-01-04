package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjec.homePageObject;

public class general {
	@Test
	public  void logingeneral (){
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			homePageObject lc = new homePageObject (driver);
			driver.manage().window().maximize();
			driver.get("https://merkaz.clickcall.co.il/serverscall/admin/login.php");

			
			lc.login("799167888", "0527120150");
			 
	}
}
