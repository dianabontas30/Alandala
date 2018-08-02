package TestF;

import org.testng.annotations.Test;
import pages.HomePage;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;

public class TestHomePage extends TestBase {
public HomePage h;
	
	@BeforeClass
	public void precondTest() {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver.navigate().to("http://demoqa.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void testHomePage() {
			h= new HomePage();
		
			TestBase gasireelem = new TestBase();
		   clickElement("//*[@id='menu-item-66']/a", "xpath", true); //*[@id="menu-item-66"]/a
		
		   clickElement("//*[@id='menu-item-153']/a", "xpath", true);
			

		   clickElement("//*[@id='ui-id-3']", "xpath", true);
		   clickElement("//*[@id='tabs-3']/p[1]", "xpath", true);
			//assertEquals( "Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.");
		}
	}

	

