package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.*;

import java.util.ArrayList;
import java.util.List;

import static locators.ProductReviewsLocators.*;

public class ProductReviewPageObject extends BasePageObject {
    private Button addNewCommentBtn;
    private Button showMoreCommentsBtn;
    private Button goToCommentLBtn;

    private LinkedButton reviewTabBtn;

    private Label reviewTabCounterLbl;
    private Label reviewHeaderLbl;
    private Label reviewHeaderCounterLbl;
    private Label mediaHeaderLbl;

    private DropDown sortCommentsDD;

    private List<WebElement> reviewMediaList;
    private List<CommentPageObject> commentsList;

    public ProductReviewPageObject(WebDriver driver) {
        super(driver);
        this.addNewCommentBtn = new Button(driver, PRODUCT_REVIEW_NEW_COMMENT);
    }

    public ProductReviewPageObject addNewComment() {
        addNewCommentBtn.click();
        return new ProductReviewPageObject(driver);
    }

    public List<CommentPageObject> getComments() {
        commentsList = new ArrayList<CommentPageObject>();

        List<WebElement> comments = driver.findElements(By.xpath(COMMENTS_LIST));

        for (WebElement comment : comments) {
            commentsList.add(new CommentPageObject(driver, comment));
        }

        return commentsList;
    }
}
