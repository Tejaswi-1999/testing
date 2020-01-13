package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://accounts.snapchat.com/accounts/signup?continue=https%3A%2F%2Faccounts.snapchat.com%2Faccounts%2Fwelcome");
		   Select drpmonth = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/div[1]/div/div/div[4]/div/form/div[5]/div/div/div/div[1]/div/div/select")));
	       drpmonth.selectByVisibleText("May");
	 
	 
	       }
	}


