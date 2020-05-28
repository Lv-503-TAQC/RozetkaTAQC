package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataFromXls {

    public ArrayList<String> getData(String testCaseName) throws IOException {
        //create an array in which we are going to put test data from xls
        ArrayList<String> dataList = new ArrayList<String>();

        //point out the location of the xls file and initialize it as a  XSSFWorkbook
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Data.xlsx");//ToDo to constants
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        //find the number of sheets and iterate through them to get the needed one
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            String name = workbook.getSheetName(i);
            if (workbook.getSheetName(i).equalsIgnoreCase("AddProdToCart")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                //the needed sheet found, now we are creating iterator to move through rows
                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows

                Row firstrow = rows.next();
                int column = 0;

                if (firstrow.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

                    while (rows.hasNext()) {
                        Cell c = rows.next().getCell(column);

                        if (c.getCellType() == CellType.STRING) {

                            dataList.add(c.getStringCellValue());
                        } else {

                            dataList.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                        }
                    }
                    column++;
                }
            }
        }
        return dataList;
    }

}

