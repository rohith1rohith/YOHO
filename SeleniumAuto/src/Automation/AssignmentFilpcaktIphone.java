package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFilpcaktIphone {

	public static void main(String[] args) {
    WebDriver d=new ChromeDriver();
    d.get("https://www.flipkart.com");
    d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 16 pro max" + Keys.ENTER);
     List<WebElement> AllProductName = d.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max ')]"));
     List<WebElement> AllProductPrice = d.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max')]/../../div[2]/div/div[1]/div[1]"));
     for(int i=0;i<AllProductName.size();i++) 
     {
    	 String productname = AllProductName.get(i).getText();
    	 
    	 String productprice = AllProductPrice.get(i).getText();
    	 System.out.println(productname +"----->"+ productprice);
     }
     d.quit();
	}

}
