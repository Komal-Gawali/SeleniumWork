package ReadExcel;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet1 {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\newdataOfName.xlsx");
		 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		 String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		 String value2 = excel.getRow(1).getCell(0).getStringCellValue();
		 System.out.println(value1);
		 System.out.println(value2);
	}

}
