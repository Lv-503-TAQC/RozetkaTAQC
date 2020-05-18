import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static locators.ProductReviewsLocators.PRODUCT_REVIEW_LINK_TO_COMMENT;
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

            driver.findElement(By.xpath(PRODUCT_REVIEW_TAB)).click();
            Thread.sleep(2000);

            boolean displayed = driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).isDisplayed();
            if (displayed) {
                driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).click();
            }

            driver.findElement(By.xpath(PRODUCT_REVIEW_LINK_TO_COMMENT)).click();
            Thread.sleep(2000);

        } finally {
            driver.quit();
        }
    }
}
