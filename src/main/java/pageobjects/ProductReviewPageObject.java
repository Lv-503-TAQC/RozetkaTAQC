package pageobjects;

import locators.ProductReviewsLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.DropDown;
import pageelements.Label;
import pageelements.LinkedButton;

import java.util.ArrayList;
import java.util.List;


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
        this.addNewCommentBtn = new Button(driver, ProductReviewsLocators.NEW_COMMENT);
    }

    public ProductReviewPageObject addNewComment() {
        addNewCommentBtn.click();
        return new ProductReviewPageObject(driver);
    }

    public List<CommentPageObject> getComments() {
        commentsList = new ArrayList<CommentPageObject>();

        List<WebElement> comments = driver.findElements(ProductReviewsLocators.COMMENTS_LIST.getPath());
        for (WebElement comment : comments) {
            commentsList.add(new CommentPageObject(driver, comment));
        }

        return commentsList;
    }

    private List<WebElement> findReviewMediaList() {
        reviewMediaList = driver.findElements(ProductReviewsLocators.REVIEW_MEDIA_LIST.getPath());
        return reviewMediaList;
    }
}
