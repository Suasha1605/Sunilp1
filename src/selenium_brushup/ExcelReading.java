package selenium_brushup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
        driver.close();
//      Excel sheet data reading code
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Testdata.xlsx"); 
		 
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		     XSSFSheet sheet =workbook.getSheet("sheet1");
		     
		    int rowNo = sheet.getLastRowNum();
		    
		    int columnNo = sheet.getRow(1).getLastCellNum();
		    
		    System.out.println("Rows= "+rowNo);
		    System.out.println("Columns= "+columnNo);
		    
		    for (int r=0; r<=rowNo; r++)
		    {
		    	for(int c=0; c<columnNo; c++) {
		    		
		    		String value= sheet.getRow(r).getCell(c).toString();
		    		System.out.print(value);
		    	}
		    	System.out.println();
		    }
		    
		    workbook.close();
		    file.close();
	}

}
