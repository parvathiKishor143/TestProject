package ApacheCommonsIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.apache.poi.hssf.usermodel.HSSFCell;


public class Comparesheets {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\New folder\\Excel2.xlsx");
		XSSFWorkbook excel;
		XSSFSheet sheet1;
		XSSFSheet sheet2;
		
		FileInputStream file = new FileInputStream(f);
		excel= new XSSFWorkbook(file);
		sheet1= excel.getSheet("Sheet1");
		sheet2= excel.getSheet("Sheet2");
		
		 if(compareSheets(sheet1, sheet2)) {
             System.out.println("\n\nThe two excel sheets are Equal");
         } else {
             System.out.println("\n\nThe two excel sheets are Not Equal");
         }
		
		
		
}
	
	public static boolean compareSheets(XSSFSheet sheet1,XSSFSheet sheet2) {
		int firstRow=sheet1.getFirstRowNum();
		int lastRow=sheet1.getLastRowNum();
		boolean equalSheet= true;
		for(int i=firstRow;i<=lastRow; i++) {
			System.out.println("compare row: "+ i);
			
			XSSFRow r1= sheet1.getRow(i);
			XSSFRow r2= sheet2.getRow(i);
			
			if(!compareTwoRows(r1,r2)) {
				equalSheet= false;
				System.out.println("compare sheet: "+i+ "not equal");
				break;
			}else {
				System.out.println("compare sheet: "+i+ " equal");
			}
			
			
			
		}
		
		
		return equalSheet;
		
	}

	private static boolean compareTwoRows(XSSFRow r1, XSSFRow r2) {
	
		int startcell=r1.getFirstCellNum();
		int lastcell=r1.getLastCellNum();
		boolean equalrow= true;
		
		for(int i=startcell; i<=lastcell ;i++) {
			System.out.println("compare cells: "+ i);
			
			XSSFCell c1= r1.getCell(i);
			XSSFCell c2= r2.getCell(i);
			boolean equalrow1=true;
			if(!copmarecell(c1,c2)) {
				equalrow1= false;
				System.out.println("compare row: "+i+ "not equal");
				break;
			}else {
				System.out.println("compare row: "+i+ " equal");
			}
		}
		
		return equalrow;
		
		
		
	}

	private static boolean copmarecell(XSSFCell c1, XSSFCell c2) {
		
		boolean equalcell=true;
		CellType type1=c1.getCellType();
		CellType type2=c2.getCellType();
		
		
		if(type1==type2) {
			if (c1.getCellStyle().equals(c2.getCellStyle())) {
				 switch (c1.getCellType()) {
				 
				 case HSSFCell.
	                    if (c1.getNumericCellValue() == c2
                        .getNumericCellValue()) {
                    equalcell = true;
                }
                break;
            case HSSFCell.CELL_TYPE_STRING:
                if (c1.getStringCellValue().equals(c2
                        .getStringCellValue())) {
                    equalcell = true;
                }
                break;
				 }
			}
		}
		
		
		
		
		
		
		
		
		
		return equalcell;
		// TODO Auto-generated method stub
		
	}
}