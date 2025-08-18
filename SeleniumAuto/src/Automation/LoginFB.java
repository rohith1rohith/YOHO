package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rohith@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dear");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
