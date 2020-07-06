package pageobjects;

import locators.HeaderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.DriverManager;

public class ComparisonPO_test extends DriverManager {
    @BeforeClass
    public void setup() {
        driver = initializeDriver();
        driver.get("https://rozetka.com.ua/");
    }

    //просто різні сторінки rozetka
    @DataProvider(name = "urls")
    public Object[][] urls() {
        return new Object[][]{
                {"https://rozetka.com.ua/"},
                {"https://rozetka.com.ua/apple_mxk32_a/p210683131/"}
        };
    }

    //якщо є елементи в comparing list -- видалити їх
    @Test
    public void dryComparisonList() {
        if(driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath()).size() > 0) {
            for(WebElement delButton : driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath())) {
                delButton.click();
            }
        }
    }

    //перевірка реакції конструктора на пустий comparing list
    @Test(dataProvider = "urls", dependsOnMethods = "dryComparisonList")
    public void constructorWithNoElements(String url) {
        Assert.assertTrue(new ComparisonPO(driver, url).isComparisonEmpty());
    }

    //додати до comparing list елементи
    @Test
    public void fillComparisonList() {
        driver.navigate().to("https://rozetka.com.ua/notebooks/c80004/producer=apple;series=28417/");
        for(WebElement button : driver.findElements(By.cssSelector(".compare-button"))) {
            button.click();
        }
        driver.navigate().to("https://bt.rozetka.com.ua/dishwashers/c80123/producer=samsung/");
        for(WebElement button : driver.findElements(By.cssSelector(".compare-button"))) {
            button.click();
        }
        driver.navigate().to("https://rozetka.com.ua/electroguitars/c267838/producer=gibson;price=122715-202500/");
        for(WebElement button : driver.findElements(By.cssSelector(".compare-button"))) {
            button.click();
        }
    }

    //перевірка конструктора
    @Test(dataProvider = "urls", dependsOnMethods = "fillComparisonList")
    public void constructor(String url) {
        new ComparisonPO(driver, url).getComparisonPO();
        Assert.assertTrue(driver.getCurrentUrl().indexOf("comparison") != -1);
    }


    @Test(dependsOnMethods = "fillComparisonList")
    public void printDiff() {
        System.out.println(new ComparisonPO(driver, "https://rozetka.com.ua/").getComparisonPO(2).diffToString());
    }




    @AfterClass
    public void quit() {
        driver.quit();
    }
}
