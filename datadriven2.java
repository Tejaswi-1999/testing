package com.deloitte.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven2 {

	public static void main(String[] args) throws IOException {
		
		try
		{
			FileInputStream fi = new FileInputStream("C:\\test\\test.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh = wb.getSheetAt(0);
			XSSFRow r = sh.getRow(0);
			XSSFCell c = r.getCell(0);
			System.out.println(c);
			int rowCount=0;
			Row newRow = sh.createRow(rowCount+1);
			 //Create a loop over the cell of a newly created row
			for(int j=0;j<r.getLastCellNum();j++)
			{
				//fill data in row
				Cell cell = newRow.createCell(j);
				cell.setCellValue("new data");
			}
			
			fi.close();
			FileOutputStream outputStream = new FileOutputStream("C:\\test\\test.xlsx");
			wb.write(outputStream);
			outputStream.close();
			
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
	
			   
			   
		   
		   
	 

		
		
		
		
		
		
		
		
		
		
	


