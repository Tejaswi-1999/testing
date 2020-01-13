package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class selwebdriver {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   
		   
		   driver.get("https://www.wattpad.com/stories/India?utm_expid=.OunQAtEoR3K3TJW2yzcg6w.1&utm_referrer=https%3A%2F%2Fwww.google.com%2F");
    	
	       driver.findElement(By.id("search-query")).sendKeys("mythology");
	
	}

}
