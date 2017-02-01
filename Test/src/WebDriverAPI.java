import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.util.*;


public class WebDriverAPI {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SRISAIL\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		
		WebElement element =driver.findElement(By.id("gh-ac"));
		element.sendKeys("hand bags");
		//WebDriver driver =new FirefoxDriver();
		
		WebElement searchBtn =driver.findElement(By.id("gh-btn"));
		searchBtn.click();
		
		//List<WebElement> searchBags =driver.findElements(By.cssSelector(input#gh-ac[value= 'hand bags']));
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SRISAIL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver.quit();
		
		//Using navigate
		//Using Action 
		//Using WindowHandles
		//Using Screenshot
		//Using Iframe
		
	}
	

}
