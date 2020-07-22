package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.Constants;
import utils.DataFromXls;
import utils.driverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


public class DataProviderParamTest extends driverManager {
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

    @DataProvider
    public Object[] xlsData(ITestContext context) throws IOException {
        String prodId = context.getCurrentXmlTest().getLocalParameters()
                .get("prodId");
        DataFromXls xslObj = new DataFromXls();
        ArrayList<String> data = xslObj.getData(prodId);
        Object[][] returnArray = new Object[1][3];
        returnArray[0][0] = data.get(0);// servicePriceExpected
        returnArray[0][1] = data.get(1);// prodPriceModalExpected
        returnArray[0][2] = data.get(2);// totalPriceModalExpected
        return returnArray;
    }

    @Test(dataProvider = "xlsData")
    public void dataProviderParam(String servicePriceExpected, String prodPriceModalExpected, String totalPriceModalExpected) {

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

    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}


