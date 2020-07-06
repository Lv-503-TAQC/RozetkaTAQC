package pageobjects;

import locators.ProductCommentsLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.DropDown;
import pageelements.Label;
import pageelements.LinkedButton;
import pageobjects.helpers.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCommentsPageObject extends BasePageObject implements Product {
    private LinkedButton reviewTabBtn;

    private Button addNewCommentBtn;
    private Button showMoreCommentsBtn;

    private Label tabCounterLbl;
    private Label headerLbl;
    private Label headerCounterLbl;
    private Label mediaHeaderLbl;

    private DropDown sortCommentsDd;

    private List<WebElement> reviewMediaList;

    public ProductCommentsPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductCommentsPageObject sortByAlreadyBuy() {
        sortCommentsDd = new DropDown(driver, ProductCommentsLocators.SORTING);
        sortCommentsDd.getSelect().getOptions().get(2).click();

        return this;
    }

    public ProductCommentsPageObject reviewTab() {
        reviewTabBtn = new LinkedButton(driver, ProductCommentsLocators.REVIEW_TAB);
        reviewTabBtn.click();

        return this;
    }

    public ProductCommentsPageObject getReviewTabCounter() {
        tabCounterLbl = new Label(driver, ProductCommentsLocators.TAB_COUNTER);

        return this;
    }

    public ProductCommentsPageObject getHeader() {
        headerLbl = new Label(driver, ProductCommentsLocators.HEADER);

        return this;
    }

    public ProductCommentsPageObject getHeaderCounter() {
        headerCounterLbl = new Label(driver, ProductCommentsLocators.HEADER);

        return this;
    }

    public NewCommentPopupDialogPageObject addNewComment() {
        addNewCommentBtn = new Button(driver, ProductCommentsLocators.NEW_COMMENT);
        addNewCommentBtn.click();

        return new NewCommentPopupDialogPageObject(driver);
    }

    public ProductCommentsPageObject showMoreComments() {
        showMoreCommentsBtn = new Button(driver, ProductCommentsLocators.SHOW_MORE_COMMENTS);
        showMoreCommentsBtn.click();

        return this;
    }

    private List<WebElement> getMediaList() {
        reviewMediaList = driver.findElements(ProductCommentsLocators.REVIEW_MEDIA_LIST.getPath());

        return reviewMediaList;
    }

    public List<CommentPageObject> getComments() {
        List<CommentPageObject> commentsList = new ArrayList<CommentPageObject>();

        List<WebElement> comments = driver.findElements(ProductCommentsLocators.COMMENTS_LIST.getPath());
        for (WebElement comment : comments) {
            commentsList.add(new CommentPageObject(driver, comment));
        }

        return commentsList;
    }
}
