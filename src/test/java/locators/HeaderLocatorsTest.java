package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.ComparisonPO;
import pageobjects.ProductCommentsPageObject;
import pageobjects.helpers.Hacks;
import utils.DriverManager;

import java.io.IOException;

public class HeaderLocatorsTest extends DriverManager {
    WebDriver driver;
    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get("https://rozetka.com.ua");
    }



    //перевірка локатора елемента comparing list
    @Test
    public void checkHEADER_COMPARISON_LI() {
        driver.get("https://rozetka.com.ua/grafic-tablets/c83199/");
        driver.findElement(By.cssSelector(".compare-button")).click();
        Assert.assertTrue(driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath()).size() == 1);
    }
    @Test(dependsOnMethods = "checkHEADER_COMPARISON_LI")
    public void deleteLi() {
        new ComparisonPO(driver, driver.getCurrentUrl()).comparisonButtonHover();
        WebElement li = driver.findElement(HeaderLocators.HEADER_COMPARISON_LI.getPath());
        li.findElement(HeaderLocators._HEADER_COMPARISON_LI_DELETE.getPath()).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.numberOfElementsToBe(HeaderLocators.HEADER_COMPARISON_LI.getPath(), 0));
        Assert.assertTrue(driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath()).size() == 0);
    }

    @Test
    public void checkHEADER_COMPARISON_DUMMY() {
        new ComparisonPO(driver, driver.getCurrentUrl()).comparisonButtonHover();
        Assert.assertTrue(driver.findElements(HeaderLocators.HEADER_COMPARISON_DUMMY.getPath()).size() == 1);
    }

    //основні локатори HeaderLocators
    @DataProvider(name = "headerLocators")
    public Object[][] getHeaderLocators() {
        return new Object[][]{{HeaderLocators.HOME_PAGE.getPath(), Hacks.sms("HOME_PAGE")},
                {HeaderLocators.KATALOG.getPath(), Hacks.sms("KATALOG")},
                {HeaderLocators.SEARCH.getPath(), Hacks.sms("SEARCH")},
                {HeaderLocators.COMPARISON.getPath(), Hacks.sms("COMPARISON")},
                {HeaderLocators.WISH.getPath(), Hacks.sms("WISH")},
                {HeaderLocators.CART.getPath(), Hacks.sms("CART")},
        };
    }

    /**
     * Object[]
     * Object[][]
     *
     *
     *
     * @param path
     * @param locator
     */

    //перевірка, що вебелемент знайдено і на сторінці він один
    @Test(dataProvider = "headerLocators")
    public void isLocatorCorrect(By path, String locator) {
        System.out.println(locator);
        Assert.assertTrue(driver.findElements(path).size() == 1);
    }



    @Test
    public void test() {
        Assert.assertTrue(new ProductCommentsPageObject(driver).isComparisonEmpty());
    }








    @AfterClass
    public void closeUp() {
        driver.quit();
    }
}
