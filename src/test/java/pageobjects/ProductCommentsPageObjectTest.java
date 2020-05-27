package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static utils.Constants.*;

public class ProductCommentsPageObjectTest {
    WebDriver driver;
    ProductCommentsPageObject productCommentsPageObject;

    @BeforeClass
    public void setUp() {
        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeUp() {
        driver.quit();
    }

    @BeforeMethod
    public void getProductComments() {
        driver.get(PRODUCT_COMMENT_PAGE);
        productCommentsPageObject = new ProductCommentsPageObject(driver);
    }

    @Test
    public void commentBody() {
        String actual = productCommentsPageObject
                .getComments()
                .get(3)
                .getCommentBody()
                .getText();
        Assert.assertEquals(actual, "Подойдёт для 2D дизайна?");
    }
}
