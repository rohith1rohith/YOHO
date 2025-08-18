package Automation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.google.com");
	String text = driver.getTitle();
	System.out.println(text);
    driver.quit();
	}

}
