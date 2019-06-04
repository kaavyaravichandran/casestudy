package Exceldemo;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelex {
  @Test
  public void f() throws IOException, InvalidFormatException {
	  File src = new File("C:\\Users\\kaavya.ravichandran\\Desktop\\read.xlsx");
	  FileInputStream file =new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(src);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	   int rowcount = sheet1.getLastRowNum();
	   System.out.println("Total no of rows is:" +rowcount);
	   
	   for(int i=1;i<=rowcount;i++)
	   {
		   String n = sheet1.getRow(i).getCell(0).getStringCellValue();
		   System.out.println("First name is:" +n);
		   
		   String p = sheet1.getRow(i).getCell(1).getStringCellValue();
		   System.out.println("password:" +p);
		   
		   String c= sheet1.getRow(i).getCell(2).getStringCellValue();
		   System.out.println("Confirm password:" +c);
  }
}
}
