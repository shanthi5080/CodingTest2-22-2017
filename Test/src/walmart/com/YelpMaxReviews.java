package walmart.com;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
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

public class YelpMaxReviews {
	
	
	static void  yelpMaxReviews(){
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\SRISAIL\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.ebay.com/");
		
		driver.get("http://yelp.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='find_desc']")).sendKeys("restaurants");
		driver.findElement(By.xpath("//input[@id='find_desc']")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul[@class='suggested-filters_filter-list']/li[7]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement element =driver.findElement(By.xpath("//label[@class='main-search_pseudo-input main-search_pseudo-input--find pseudo-input']"));
		//WebElement element =driver.findElement(By.cssSelector("#global-search-input"));
		//element.sendKeys("restaurants ");
		driver.findElement(By.xpath("//div[@class='filter-set sort-filters']/ul//li[3]")).click();
		
		List <WebElement>  reviews =driver.findElements(By.xpath("//span[@class=review-count.rating-qualifier"));
		List<Integer> review =new ArrayList<Integer>();
		
		for (WebElement elements :reviews){
			
			String listReviews =elements.getText();
			System.out.println(listReviews);
			System.out.println(reviews.size());
			String listOfReviews =listReviews.replaceAll("[0-9]", " ");
			System.out.println(listOfReviews);
			int r= Integer.parseInt(listOfReviews);
			review.add(r);
		}
		
		System.out.println("  all reviews are "+review);
		
		System.out.println("  max reviews are "+Collections.max(review));
		driver.close();
		
		
		//System.out.println(reviews.size());
		// return reviews.size();
		
		//System.out.println(Collections.max(reviews));
		
		
		
		//element.click();
		
		
	}
	
	public static void main(String[] args) {
		
		YelpMaxReviews.yelpMaxReviews();
	}
	


}
