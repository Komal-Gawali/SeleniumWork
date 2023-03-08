package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Data.txt.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		

		for(int row=0; row<= excel.getLastRowNum(); row++) {
			for(int col= 0; col<excel.getRow(row).getLastCellNum(); col++) 
			{
				
				String value = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(value + "\t\t");
				
			}
			System.out.println();
			
		}

	}

}
