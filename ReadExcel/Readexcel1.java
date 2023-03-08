package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel1 {

	

	public	static	void	main(String[]args)	throws	Exception		{	
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\newdataOfName.xlsx");
	
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
	}
}
