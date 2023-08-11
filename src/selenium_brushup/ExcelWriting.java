package selenium_brushup;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\sheetInput.xlsx");
   
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		int rowNo = 4;
	    
	    int columnNo = 3;
		
		for (int r=0; r<=rowNo; r++)
	    {
			XSSFRow currentrow= sheet.createRow(r);
	    	for(int c=0; c<columnNo; c++) {
	    		
	    		currentrow.createCell(c).setCellValue("Welcome");
	    	}
	    	
	    }
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    
	    System.out.println("Data in written in excel sheet");
	}

}
