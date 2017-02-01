package walmart.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Autoselection {
public static void main(String[] args) {
    // TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SRISAIL\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");

    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.google.com");

    driver.findElement(By.name("q")).sendKeys("mahatama gandhi");
    List<WebElement> autoSuggest = driver.findElements(By
            .xpath("//div[@class='sbqs_c']"));
    // verify the size of the list
    System.out
            .println("Size of the AutoSuggets is = " + autoSuggest.size());
    // print the auto suggest
    for (WebElement a : autoSuggest)
        System.out.println("Values are = " + a.getText());
    // suppose now you want to click on 3rd auto suggest then simply do like
    // this
    autoSuggest.get(2).click();
}
}