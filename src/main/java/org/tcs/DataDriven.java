package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File("E:\\Sri\\MavenDataDriven\\excel\\Data.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("Details");
		//Row row = sheet.getRow(1);
		//Cell cell = row.getCell(1);
		//System.out.println(cell);
		
		//int numberOfCells = row.getPhysicalNumberOfCells();
		//System.out.println(numberOfCells);
		for(int i = 0;i<sheet.getPhysicalNumberOfRows();i++) {
				Row r = sheet.getRow(i);
			for(int j =0; j<r.getPhysicalNumberOfCells();j++) {
				System.out.println(r.getCell(j));
			}
		}
	}

}
