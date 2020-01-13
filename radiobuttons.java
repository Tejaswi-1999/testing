package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class radiobuttons {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/dp/B07DJD1RTM?pf_rd_p=fa25496c-7d42-4f20-a958-cce32020b23e&pf_rd_r=Q9XE0ER4NJFHCY4DXA4T");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement Chkbox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[1]/div[3]/div/div/div[1]/div/div/div[1]/div/div[1]/a/i"));
	       Chkbox.click();
	      
	       }
	}


