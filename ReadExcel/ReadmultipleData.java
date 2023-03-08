package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadmultipleData {

	public static void main(String[] args) throws Exception {
         
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\newdataOfName.xlsx");
		 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int row = 0 ; row< 5; row++)
		{
			for(int col = 0 ; col < 5 ; col++)
			{
				String value = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(value+ "\t\t");
			}
			System.out.println("  ");
		}
	}

}
