
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.ActionsWithProductsBlockPO;
import pageobjects.CartModalWindowPO;
import pageobjects.ProductInCartPO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static utils.Constants.*;

public class Main {
    public static final String POPUP_BANNER_CLOSE_BUTTON = "//*[@class = 'exponea-close-cross']";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {
            driver.get("https://rozetka.com.ua/ua/apple_macbook_air_2020_256_space_gray/p197128590/");

            boolean displayed = driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).isDisplayed();
            if (displayed) {
                driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).click();
                Thread.sleep(2000);
            }
//            String testCaseName = "Input1";
//                //create an array in which we are going to put test data from xls
//                ArrayList<String> dataList =new ArrayList<String>();
//
//                //point out the location of the xls file and initialize it as a  XSSFWorkbook
//                FileInputStream fis = new FileInputStream("D:\\Data.xlsx");
//                XSSFWorkbook workbook=new XSSFWorkbook(fis);
//
//                //find the number of sheets and iterate through them to get the needed one
//                int sheets=workbook.getNumberOfSheets();
//                for(int i=0;i<sheets;i++)
//                {
//                    String name  = workbook.getSheetName(i);
//                    if(workbook.getSheetName(i).equalsIgnoreCase("AddProdToCart"))
//                    {
//                        XSSFSheet sheet=workbook.getSheetAt(i);
//
//                        //the needed sheet found, now we are creating iterator to move through rows
//                        Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
//                        Row firstrow = rows.next();
//
//                        while(rows.hasNext())
//                        {
//
//                            Row r=rows.next();
//
//                            if(r.getCell(0).getStringCellValue().equalsIgnoreCase(testCaseName))
//                            {
//////after you grab purchase testcase row = pull all the data of that row and feed into test
//                                Iterator<Cell>  cv = r.cellIterator();
//                                while(cv.hasNext())
//                                {
//                                    Cell c = cv.next();
//                                    if(c.getCellType()== CellType.STRING)
//                                    {
//
//                                        dataList.add(c.getStringCellValue());
//                                        System.out.println(c.getStringCellValue());
//                                    }
//                                    else{
//
//                                        dataList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
//                                        System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
//
//                                    }
//                                }
//                            }
//
//
//                        }
//
//                    }
//                }
//                System.out.println(dataList);

        } finally {
            driver.quit();
        }
    }
}