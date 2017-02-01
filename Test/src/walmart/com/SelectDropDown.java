package walmart.com;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SelectDropDown {
	
	//WebDriver driver  =new ChromeDriver();
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SRISAIL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SRISAIL\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");

	//WebDriver driver  =new FirefoxDriver();
	
	static void dropdownEements(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SRISAIL\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.ebay.com/");
		
		driver.get("http://walmart.com");
		
		
		
		//Select sel1 =new Select(driver.findElement(By.id("gh-cat")));
		//Select sel1 =new Select(driver.findElement(By.cssSelector("header-SearchDropdown-toggle ")));
		//button[@datat-tl-id=' header-SearchDropdown-toggle']
		//Select sel1 =new Select(driver.findElement(By.xpath("//button[@data-tl-id='header-SearchDropdown-toggle']")));
		//Select sel1 =new  Select (driver.findElement(By.xpath("//button[text()='All']")));
			WebElement element1 =driver.findElement(By.xpath("//button[text()='All']"));
		WebElement element =driver.findElement(By.xpath("//button[@data-tl-id='header-SearchDropdown-toggle']"));
		System.out.println( "Text  is "+element.getText());
		element.click();
		System.out.println( "Text  is "+element1.getText());
		
		
				/*List<WebElement> dropdownElements =sel1.getOptions();		//int size =dropdownElements.size();
		 for (int i=0;i<size;i++);
				 {
					 
					String value= dropdown"Elements.get(i).getText();
					 System.out.println(value);
				 }
				 */
	/*Iterator<WebElement> it =dropdownElements.iterator();
		 
		while (it.hasNext()){
			
			System.out.println(" Ebay  All Categories Dron  down Elements are "+it.next().getText());
		}*/
			
		}

	public static void main(String[] args) {
		
		
		SelectDropDown.dropdownEements();
	}
}

