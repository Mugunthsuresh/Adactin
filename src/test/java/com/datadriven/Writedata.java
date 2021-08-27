package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\vaish\\eclipse-workspace\\AutomationPractice\\Edit.xlsx");
	
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	
	
	Sheet createSheet = wb.createSheet("NewSheets");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	
	
	createCell.setCellValue("username");
	
	wb.getSheet("NewSheets").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("NewSheets").createRow(1).createCell(0).setCellValue("abi");
	wb.getSheet("NewSheets").getRow(1).createCell(1).setCellValue("123hd");
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("data created successfully in the NewSheet");
	
	
}
	
	
	
}
