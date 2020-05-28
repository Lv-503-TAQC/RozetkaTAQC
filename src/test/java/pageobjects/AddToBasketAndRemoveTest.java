package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DriverManager;

import java.io.IOException;


public class AddToBasketAndRemoveTest extends DriverManager {
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
    }


    @Test
    public void selectServiceOpt() {

        int price1 = allAboutProductTab.getProductServicesBlock()
                .createListOfCervices()
                .get(0)
                .clickCheckbox()
                .getDropdown()
                .selectOptionByIndex(1)
                .getPrice();
        System.out.println(price1);


        int price2 = actionsWithProductsBlockPO.addToCart()
        .isAddedToCart()
        .getCartModal()
        .getProductsInCartList()
        .get(0)
        .getProdPriceModal();
        System.out.println(price2);

        int price3 = actionsWithProductsBlockPO.getCartModal()
                .getTotalModal();
        System.out.println(price3);

        Assert.assertEquals(price1+price2, price3);
    }


    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}


