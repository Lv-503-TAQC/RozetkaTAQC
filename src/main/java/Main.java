
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.AllAboutProductTabPO;
import pageobjects.ProductOptionsPO;

import java.util.List;
import java.util.concurrent.TimeUnit;


import static locators.ProductTabsList.PRODUCT_REVIEW_TAB;
import static utils.Constants.*;

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
            AllAboutProductTabPO object1 = new AllAboutProductTabPO(driver);
            List<ProductOptionsPO> list = object1.createListOfCervices();

            ProductOptionsPO object2 = list.get(1);

            System.out.println("Checkbox found:"+object2.readCheckbox());

        } finally {
            driver.quit();
        }
    }
}