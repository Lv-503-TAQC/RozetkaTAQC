import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static locators.AllAboutGoodsLocators.ADD_TO_CART_BUTTON;
import static locators.ProductReviewsLocators.PRODUCT_REVIEW_DROPDOWN_SORT;
import static locators.ProductReviewsLocators.PRODUCT_REVIEW_TAB;
import static utils.Constants.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {
            driver.get("https://rozetka.com.ua/ua/apple_macbook_air_2020_256_space_gray/p197128590/");

            driver.findElement(By.xpath(PRODUCT_REVIEW_TAB)).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath(ADD_TO_CART_BUTTON)).click();
            Thread.sleep(2000);

        } finally {
            driver.quit();
        }
    }
}
