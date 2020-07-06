package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.helpers.Hacks;
import utils.DriverManager;

public class ProductLocatorsTest extends DriverManager {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = initializeDriver();
        driver.get("https://rozetka.com.ua/lenovo_81mx002rra/p172194373/");
    }

    @DataProvider(name = "productLocators")
    public Object[][] locators() {
        return new Object[][]{{ProductLocators.BUTTON_COMPARE.getPath(), Hacks.sms("BUTTON_COMPARE")}
        };
    }

    @Test(dataProvider = "productLocators")
    public void compareButtonTest(By path, String info) {
        System.out.println(info);
        Assert.assertTrue(driver.findElements(path).size() == 1);
    }

    //перевірка, що після додання продукту до порівнянь, кнопка поміняє свій функціонал
    @Test
    public void isActiveCompareButton() {
        driver.findElement(ProductLocators.BUTTON_COMPARE.getPath()).click();
        Assert.assertTrue(driver.findElements(ProductLocators.BUTTON_COMPARE_ACTIVE.getPath()).size() == 1);
    }



    @AfterClass
    public void quit() {
        driver.quit();
    }
}
