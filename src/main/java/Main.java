import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AllAboutProductTabPO;
import pageobjects.ProductOptionsPO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static locators.ProductReviewsLocators.*;
import static locators.ProductTabsList.PRODUCT_REVIEW_TAB;

import static utils.Constants.KEY_TO_WINDOWS_CHROME_DRIVER;
import static utils.Constants.PATH_TO_WINDOWS_CHROME_DRIVER;

public class Main {
    public static final String POPUP_BANNER_CLOSE_BUTTON = "//*[@class = 'exponea-close-cross']";

    public static void main(String[] args) throws InterruptedException {
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

            Thread.sleep(2000);
            AllAboutProductTabPO object1 = new AllAboutProductTabPO(driver);
            ArrayList<WebElement> list =  new ArrayList(object1.createListOfCervices());

            ProductOptionsPO object2 = new ProductOptionsPO(driver);
            WebElement zero = list.get(0);
            object2.clickCheckbox(zero);

            Thread.sleep(2000);
            WebElement one = list.get(1);

            object2.clickCheckbox(one);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
