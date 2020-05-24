package pageobjects;

import locators.SingleCommentLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;

public class SingleCommentPageObject extends BasePageObject {
    private Button goToComments;

    private CommentPageObject commentPageObject;

    public SingleCommentPageObject(WebDriver driver) {
        super(driver);
    }

    public CommentPageObject getComment() {
        WebElement element = driver.findElement(SingleCommentLocators.COMMENT.getPath());

        return new CommentPageObject(driver, element);
    }


    public ProductCommentsPageObject goToComments() {
        goToComments = new Button(driver, SingleCommentLocators.GO_BACK);

        return new ProductCommentsPageObject(driver);
    }
}
