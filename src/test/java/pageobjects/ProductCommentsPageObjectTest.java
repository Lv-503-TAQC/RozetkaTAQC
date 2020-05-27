package pageobjects;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;

import java.io.IOException;

import static utils.Constants.PRODUCT_COMMENT_PAGE;

public class ProductCommentsPageObjectTest extends Base {
    ProductCommentsPageObject productCommentsPageObject;

    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
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

    @Test
    public void commentsSorting() {
        boolean alreadyBuy = productCommentsPageObject
                .sortByAlreadyBuy()
                .getComments()
                .get(0)
                .isAlreadyBuy();
        Assert.assertEquals(alreadyBuy, true);
    }
}