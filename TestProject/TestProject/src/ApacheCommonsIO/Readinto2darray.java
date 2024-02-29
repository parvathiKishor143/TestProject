package ApacheCommonsIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readinto2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object[][] obj1= Array();
System.out.println(obj1[0][1]);

}
	
public static Object[][] Array(){
	
	File file= new File("C:\\New folder\\excel.xlsx");
	XSSFWorkbook wkbook;
	XSSFSheet sheet;
	Object[][] obj= new Object[0][0];
	
	try {
		FileInputStream excel = new FileInputStream(file);
		wkbook = new XSSFWorkbook(excel);
		sheet = wkbook.getSheet("Sheet1");
		int start = sheet.getFirstRowNum();
		int end = sheet.getLastRowNum();
		obj= new Object[start-end+1][4];
		for(int i = start; i <= end; i++) {
		
			obj[i][0]=sheet.getRow(i).getCell(0).getStringCellValue() ;
			obj[i][1]=sheet.getRow(i).getCell(1).getNumericCellValue() ;
			obj[i][2]=sheet.getRow(i).getCell(2).getBooleanCellValue() ;
			obj[i][3]=sheet.getRow(i).getCell(3).getStringCellValue() ;
			
		}
		
	} catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
	return obj;
	
}
}
