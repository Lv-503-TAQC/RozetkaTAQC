package pageobjects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DataFromXls;
import utils.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class AddToBasketAndRemoveTest extends base {
    WebDriver driver;
    AllAboutProductTabPO allAboutProductTab;
    ActionsWithProductsBlockPO actionsWithProductsBlockPO;

    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get("https://rozetka.com.ua/apple_macbook_air_2020_256_space_gray/p197128590/");
        //initialize new object
        allAboutProductTab = new AllAboutProductTabPO(driver);
        actionsWithProductsBlockPO = new ActionsWithProductsBlockPO(driver);
        System.out.println("BeforeClass");
    }


    @BeforeMethod
    public void initializeXls() throws IOException {
        System.out.println("BeforeMethod");
        DataFromXls xslObj = new DataFromXls();
        ArrayList<String> data = xslObj.getData("selectServiceOpt2");
        String servicePriceExpected = data.get(0);
        String prodPriceModalExpected = data.get(1);
        String totalPriceModalExpected = data.get(2);
    }

    @Test
    public void selectServiceOpt2(String servicePriceExpected,String prodPriceModalExpected,String totalPriceModalExpected) {

        int servicePrice = allAboutProductTab.getProductServicesBlock()
                .createListOfCervices()
                .get(0)
                .clickCheckbox()
                .getDropdown()
                .selectOptionByIndex(1)
                .getPrice();
        Assert.assertEquals(servicePrice,servicePriceExpected);


        int prodPriceModal = actionsWithProductsBlockPO.addToCart()
                .isAddedToCart()
                .getCartModal()
                .getProductsInCartList()
                .get(0)
                .getProdPriceModal();
        Assert.assertEquals(prodPriceModal,prodPriceModalExpected);

        int totalPriceModal = actionsWithProductsBlockPO.getCartModal()
                .getTotalModal();
        Assert.assertEquals(totalPriceModal,totalPriceModalExpected);

        Assert.assertEquals(servicePrice+prodPriceModal, totalPriceModal);
    }

    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}


