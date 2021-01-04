package pageObjec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class homePageObject extends BasePage{

	
	public homePageObject(WebDriver driver) {
		super(driver);
		
	}
	
	   public void setup() {
			
		 
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}

	public  void login(String userName,String pass) {
		
		fillText(driver.findElement(By.cssSelector("input#username")), userName);
		fillText(driver.findElement(By.cssSelector("input#password")), pass);
		click(driver.findElement(By.cssSelector("div#login>form>input:nth-of-type(3)")));
	}
	

	public void addkredit  (String userName,String pass) {
		
		
	}
	
	

}
