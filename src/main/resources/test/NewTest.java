package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjec.homePageObject;

public class NewTest {
	@test
	public  void logvhinuch (){
		//System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://merkaz.clickcall.co.il/serverscall/admin/login.php");

		
		homePageObject lc = new homePageObject (driver);
		lc.login(799245831,0527170100);

	}
}
