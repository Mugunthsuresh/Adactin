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

public class Writeinputdata {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\vaish\\eclipse-workspace\\AutomationPractice\\ProductuserData.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	
	Sheet createSheet = wb.createSheet("logo details");
	
	Row createRow = createSheet.createRow(0);
	
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue("username");
	
	wb.getSheet("logo details").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("logo details").createRow(1).createCell(0).setCellValue("mugunth");
	wb.getSheet("logo details").getRow(1).createCell(1).setCellValue("ravi123");
	wb.getSheet("logo details").createRow(2).createCell(0).setCellValue("guna");
	wb.getSheet("logo details").getRow(2).createCell(1).setCellValue("dinesh");
	wb.getSheet("logo details").createRow(3).createCell(0).setCellValue("surya");
	wb.getSheet("logo details").getRow(3).createCell(1).setCellValue("lkg12");
	wb.getSheet("logo details").createRow(4).createCell(0).setCellValue("sam");
	
	FileOutputStream fos=new FileOutputStream(f);
	
	wb.write(fos);
	
	wb.close();
	
	System.out.println("created sucessfully");
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
