package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class editboxtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
	    driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("test@gamil.com");
		
	    WebElement ADDTEXT=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		ADDTEXT.sendKeys("Gokul");
		
		WebElement getatribute=driver.findElement(By.name("username"));
		String value=getatribute.getAttribute("value");
		
		
		System.out.println("value");
		
		WebElement clear=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clear.clear();
		
		
		
		WebElement disabledbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean box= disabledbox.isEnabled();
		
		System.out.println(box);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
