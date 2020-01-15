package com.deloitte.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		try
		{
			FileInputStream fi = new FileInputStream("C:\\test\\test1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh = wb.getSheetAt(0);
			XSSFRow r = sh.getRow(0);
			XSSFCell c = r.getCell(0);
			System.out.println(c);
			
			
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//	   capabilities.setCapability("marionette",true);
			   WebDriver driver = new ChromeDriver();
			  
			   
			   
			   
			   
		   
		   
	 
	}
}
		
		
		
		
		
		
		
		
		
		
	


