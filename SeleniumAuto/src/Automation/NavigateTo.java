package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d=new ChromeDriver();
    d.get("https://www.google.com");
    d.navigate().to("https://www.google.com");
    Thread.sleep(2000);
    
    d.navigate().back();
    Thread.sleep(2000);
    
    d.navigate().forward();
    Thread.sleep(2000);
    
    d.navigate().refresh();
    Thread.sleep(2000);
    
    d.quit();
	}

}
