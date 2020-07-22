package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Constants;
import utils.DataFromXls;
import utils.driverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;


public class SelectServiceOptionAndCheckPrice extends driverManager {
    WebDriver driver;
    AllAboutProductTabPO allAboutProductTab;
    ActionsWithProductsBlockPO actionsWithProductsBlockPO;

    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(Constants.PRODUCT_MAIN_PAGE);
        allAboutProductTab = new AllAboutProductTabPO(driver);
        actionsWithProductsBlockPO = new ActionsWithProductsBlockPO(driver);
    }

    @Test(dataProvider = "xlsData")
    public void selectServiceOpt2(String servicePriceExpected, String prodPriceModalExpected, String totalPriceModalExpected) {

        String servicePrice = allAboutProductTab.getProductServicesBlock()
                .createListOfCervices()
                .get(0)
                .clickCheckbox()
                .getDropdown()
                .selectOptionByIndex(1)
                .getPriceString();
        Assert.assertEquals(servicePrice, servicePriceExpected);


        String prodPriceModal = actionsWithProductsBlockPO.addToCart()
                .isAddedToCart()
                .getCartModal()
                .getProductsInCartList()
                .get(0)
                .getProdPriceModalString();
        Assert.assertEquals(prodPriceModal, prodPriceModalExpected);

        String totalPriceModal = actionsWithProductsBlockPO.getCartModal()
                .getTotalModalString();
        Assert.assertEquals(totalPriceModal, totalPriceModalExpected);

    }

    @DataProvider
    public Object[] xlsData() throws IOException {
        DataFromXls xslObj = new DataFromXls();
        ArrayList<String> data = xslObj.getData("p197128590");
        Object[][] returnArray = new Object[1][3];
        returnArray[0][0] = data.get(0);// servicePriceExpected
        returnArray[0][1] = data.get(1);// prodPriceModalExpected
        returnArray[0][2] = data.get(2);// totalPriceModalExpected
        return returnArray;
    }

    @AfterMethod
    public void refresh() {
        driver.navigate().refresh();
    }

    @Test
    public void selectServiceOpt1() {

        int servicePrice = allAboutProductTab.getProductServicesBlock()
                .createListOfCervices()
                .get(0)
                .clickCheckbox()
                .getDropdown()
                .selectOptionByIndex(1)
                .getPriceInt();


        int prodPriceModal = actionsWithProductsBlockPO.addToCart()
                .isAddedToCart()
                .getCartModal()
                .getProductsInCartList()
                .get(0)
                .getProdPriceModalInt();

        int totalPriceModal = actionsWithProductsBlockPO.getCartModal()
                .getTotalModalInt();

        Assert.assertEquals(servicePrice + prodPriceModal, totalPriceModal);
    }


    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}

