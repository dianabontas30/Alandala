package TestF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.PageBase;

public class TestBase extends PageBase {
	
	@BeforeClass
	public void initSetP() {
		
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
	}

	@AfterClass
	public void tearDown() {
		closeDriver();
	}
	
}
