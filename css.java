package com.deloitte.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.*;

public class css {

	
	public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
	//    System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
	   WebDriver driver = new ChromeDriver();
		
		//   driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  // driver.manage().window().maximize();
		 //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //  WebElement Email = driver.findElement(By.cssSelector("#identifierId"));
	     //  Email.sendKeys("samplemail@gmail.com");
	      // Email.click();
		
	}
	private TakesScreenshot webdriver;
	File Src=((TakeScreenshot)driver).getScreenshotAs(OutputType.File);
	FileUtils.CopyFile(Src,newFile("C:/Selenium/Error.png"));