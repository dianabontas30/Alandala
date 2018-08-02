package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestF.Constante;

public class PageBase {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void closeDriver() {
		driver.close();
		if (!driver.equals(null))
			driver.quit();
		} 
	
	public void precond() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
	}
	public static WebElement findObject(String type_by_element, String value_element, Boolean mandatory_element) {
		By locator = null;
		WebElement elem = null;
		if (type_by_element.equals(Constante.ID)) {
			locator = By.id(value_element);
		} else if (type_by_element.equals(Constante.CLASSNAME)) {
			locator = By.className(value_element);
		} else if (type_by_element.equals(Constante.CSSSELECTOR)) {
			locator = By.cssSelector(value_element);
		} else if (type_by_element.equals(Constante.XPATH)) {
			locator = By.xpath(value_element);
		}
		try {
			elem = driver.findElement(locator);
		} 
		catch (Exception e) {
			System.out.println("Element is not found");
			System.exit(1);
		}
		if (mandatory_element == true && elem == null) {
			System.out.println("There is a problem");
		}
		return elem;
	}
	public static void clickElement(String type_by_element, String value_element, boolean mandatory_element) {
		findObject(type_by_element,value_element, mandatory_element).click();

	}

	public static String extractTextFromWebElement(String type_by_element, String value_element, boolean mandatory_element) {

		return getWebElementBy(type_by_element,value_element, mandatory_element).getText();

	}
	

	private static WebElement getWebElementBy(String type_by_element, String value_element, boolean mandatory_element) {
		
		return null;
	}

	public static void sendTextToForm(String selectorType, String selectorInfo, String keysSent, boolean selectorMandatory) {
		getWebElementBy(selectorType, selectorInfo, selectorMandatory).sendKeys(keysSent);
	}

}
