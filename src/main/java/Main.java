import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CommentPageObject;
import pageobjects.ProductReviewPageObject;

import java.util.concurrent.TimeUnit;

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

            driver.findElement(PRODUCT_REVIEW_TAB.getPath()).click();
            Thread.sleep(2000);

            boolean displayed = driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).isDisplayed();
            if (displayed) {
                driver.findElement(By.xpath(POPUP_BANNER_CLOSE_BUTTON)).click();
                Thread.sleep(2000);
            }

            ProductReviewPageObject productReviewPageObject = new ProductReviewPageObject(driver);
            CommentPageObject commentPageObject = productReviewPageObject.getComments().get(1);
            String commentAuthor = commentPageObject.getCommentAuthor().getText();
            String commentBody = commentPageObject.getCommentBody().getText();

            System.out.println(commentAuthor);
            System.out.println(commentBody);


        } finally {
            driver.quit();
        }
    }
}