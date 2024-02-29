package ApacheCommonsIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeToexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f= new File("C:\\New folder\\Excel1.xlsx");
		XSSFWorkbook excel= new XSSFWorkbook();
		XSSFSheet sheet=excel.createSheet("Sheet1");
		Row row;
		Cell cell;
		
		for(int i=0;i<=9;i++) {
		row=sheet.createRow(i);
		for(int j=0;j<=9;j++) {
			cell=row.createCell(j);
			cell.setCellValue((i+1)*(j+1));
		}
		}
		
		try {
			FileOutputStream file= new FileOutputStream(f);
			excel.write(file);
			file.close();
			excel.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
