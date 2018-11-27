package WebTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTotal {
    static int colrange=1000;
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        int count=0;
    try {
        FileInputStream file = new FileInputStream(new File("C:\\Users\\sp104\\Desktop\\browserstack_max\\browserstack_max\\src\\test\\resources\\MasterData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        while(rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while(cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch(cell.getCellType()) {
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println("");
        }

        for(Row r:sheet)
        {
            short minColIx=r.getFirstCellNum();
            short maxColIx=r.getLastCellNum();
            for(short colIx=minColIx;colIx<maxColIx;colIx++) {
                Cell c= r.getCell(colIx);
                if(c!=null) {
                    if(c.getCellType()== Cell.CELL_TYPE_STRING||c.getCellType() == Cell.CELL_TYPE_NUMERIC||c.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
                        count++; // can i use hashcode in here to get the key and value pair? key=column index value=total number of rows in that column
                            } 
                    }
                    else break;
                }
            }

        System.out.println("\nTotal Number of columns are:\t"+count);
        System.out.println(hm);
        file.close();    
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException ae) {
        ae.printStackTrace();
    }
}
}