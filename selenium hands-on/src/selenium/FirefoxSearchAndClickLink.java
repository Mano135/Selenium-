package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

public class FirefoxSearchAndClickLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Link Text
		//2.Partial link text
		
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.partialLinkText("Home Page")).click();

	}

}
