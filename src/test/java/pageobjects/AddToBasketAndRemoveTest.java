package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageelements.DropDown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.Constants.KEY_TO_WINDOWS_CHROME_DRIVER;
import static utils.Constants.PATH_TO_WINDOWS_CHROME_DRIVER;

public class AddToBasketAndRemoveTest {
    WebDriver driver;
    AllAboutProductTabPO allAboutProductTab;

    @BeforeClass
    public void setUp() {
        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/apple_macbook_air_2020_256_space_gray/p197128590/");

    }


    @Test
    public void selectServiceOpt() {
        //initialize new object
        allAboutProductTab = new AllAboutProductTabPO(driver);

        //creating list of cervices
        List<ProductOptionsPO> serviceslist = new ArrayList(allAboutProductTab.createListOfCervices());

        //looking for the desired service AND selecting it
        for ( ProductOptionsPO listItem : serviceslist){
            if (listItem.readCheckbox().equals("+1 или +2 года гарантии")){
                listItem.clickCheckbox();

                //looking for desired dropdown option AND selecting it
                Select dropdown = listItem.getDropdown();
                List<WebElement> optionList = new ArrayList(dropdown.getOptions());
                for ( WebElement optionListItem : optionList){
                    if (optionListItem.getText().contains("Продление гарантии на 2 года (25001-40000)")){;
                    optionListItem.click();
                    //checking the price of the optionlistItem
                    Assert.assertEquals(listItem.getPrice(),"3899 ₴");
                    }
                }
            }
        }
    }


    @Test
    public void addToCartAndCheckPrice() {
        //initialize new object????????
       // allAboutProductTab = new AllAboutProductTabPO(driver);

        //get price of the item
       String prodPriceStr = allAboutProductTab.getProdPrice();
       int prodPriceInt = Integer.parseInt(prodPriceStr);
        //click Add to Cart button
        ActionsWithProductsBlockPO actionsWithProductsBlockPO = new ActionsWithProductsBlockPO(driver);
        actionsWithProductsBlockPO.addToCart();
        //confirm the button element is replaced
        actionsWithProductsBlockPO.isAddedToCart();
        //find the total in cart
        //assert total equals product price+ service

    }
    // delete it without saving

    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}


