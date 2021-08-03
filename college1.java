package Excellsheet_data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class college1 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream I = new FileInputStream("C:\\Users\\dell\\Desktop\\Student\\sel_3.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(I);
	    XSSFSheet s = wb.getSheet("Sheet1"); 
	    Row header = s.createRow(0);
	    header.createCell(0).setCellValue("ID");
	    header.createCell(1).setCellValue("StudentName");
	    header.createCell(2).setCellValue("Year");
	    header.createCell(3).setCellValue("Fees");
	    header.createCell(4).setCellValue("Library Fees");
	    header.createCell(5).setCellValue("Subject you can Obt");
	    header.createCell(6).setCellValue("Tution Fees");
	    wb.write(new FileOutputStream ("C:\\Users\\dell\\Desktop\\Student\\sel_3.xlsx"));
	    
	    int i =1;
	    
	    while(i>0) {
	    	int rowCount = s.getFirstRowNum();
	    	
	    	System.out.println("Enter Roll No.");
			Scanner sc=new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("Student Name");
			Scanner sc1=new Scanner(System.in);
			String b = sc1.next();
			System.out.println("Year (FYBSc/SYBSc/TYBSc)");
			Scanner sc2=new Scanner(System.in);
			String c = sc2.next();		
			System.out.println("College fees for FYBSc student = 20000");
			System.out.println("College fees for SYBSc student = 30000");
			System.out.println("College fees for TYBSc student = 40000");
			System.out.println("Enter according to college rules");
			System.out.println("Enter fees pay");
			Scanner sc3=new Scanner(System.in);				
			int d = sc3.nextInt();
			if(d==20000) {
				int x = (d*5)/100;			
				XSSFSheet s1 = wb.getSheet("Sheet1");
				
			    Row Deta = s1.createRow(++ rowCount);			    
				Deta.createCell(0).setCellValue(a);	
				Deta.createCell(1).setCellValue(b);
				Deta.createCell(2).setCellValue(c);	
				Deta.createCell(3).setCellValue(d);	
				Deta.createCell(4).setCellValue(x);	
				Deta.createCell(5).setCellValue("MATHS,PHYS,CHEM,BIO");
				wb.write(new FileOutputStream ("C:\\Users\\dell\\Desktop\\Student\\sel_3.xlsx"));
				
			   int[] r = s1.getRowBreaks();
			         
			}
			else if(d==30000)
			{
				int x = (d*5)/100;			
				XSSFSheet s1 = wb.getSheet("Sheet1");
				Row Deta = s1.createRow(i);
				Deta.createCell(0).setCellValue(a);	
				Deta.createCell(1).setCellValue(b);
				Deta.createCell(2).setCellValue(c);	
				Deta.createCell(3).setCellValue(d);	
				Deta.createCell(4).setCellValue(x);	
				wb.write(new FileOutputStream ("C:\\Users\\dell\\Desktop\\Student\\sel_3.xlsx"));
			
			}
			else if (d==40000)
			{
				int x = (d*5)/100;			
				XSSFSheet s1 = wb.getSheet("Sheet1");
				Row Deta = s1.createRow(i);
				Deta.createCell(0).setCellValue(a);	
				Deta.createCell(1).setCellValue(b);
				Deta.createCell(2).setCellValue(c);	
				Deta.createCell(3).setCellValue(d);	
				Deta.createCell(4).setCellValue(x);
				
				wb.write(new FileOutputStream ("C:\\Users\\dell\\Desktop\\Student\\sel_3.xlsx"));
				
			}
			else {
				System.out.println("Enter year is not according to college managment");
			}
			   CellAddress cell = s.getActiveCell()  ;
			   int lastRow = s.getLastRowNum();
			   
			   System.out.println(lastRow);
			    	
			}
			
	 
	    
	    }
	    }

	


