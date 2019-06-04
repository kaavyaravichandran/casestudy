package basicsdemo;

import java.io.FileInputStream;

import org.testng.annotations.Test;

public class createworkbook {
  @Test
  public void readexcel() throws IOExpection
  {
	  File src = new File("C:\Users\kaavya.ravichandran\\Desktop\read.xlsx");
	  FileInputStream file =new FileInputStream(src);
	  XFSSWorkbook vb = new  XFSSWorkbook(file);
	  XFSSSheet sheet1 = vb.getSheetAt(0);
	   int rowcount = sheet1.getlastRowNum();
	   System.out.println("Total no of rows is:" +rowcount);
	   
	   foe(int i=1;i<=rowcount;i++)
	   {
		   String firsname = sheet1.getRow().getcell(0).getStringCellValue();
		   System.out.println("First name is:" +n);
		   
		   String password = sheet1.getRow().getcell(0).getStringCellValue();
		   System.out.println("password:" +p);
		   
		   String confirm password = sheet1.getRow().getcell(0).getStringCellValue();
		   System.out.println("Confirm password:" +c);
		   
		  
	  
  }
}
