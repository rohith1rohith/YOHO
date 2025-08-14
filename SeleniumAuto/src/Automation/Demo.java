package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("https://in.search.yahoo.com/yhs/search?hspart=sz&hsimp=yhs-002&p=google&type=type80160-1652202328&param1=1610635853");
    driver.getTitle();
    driver.quit();
	}

}
