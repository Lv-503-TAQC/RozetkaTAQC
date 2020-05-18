package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.DropDown;
import pageelements.Label;

import java.util.List;

import static locators.ProductReviewsLocators.*;
import static locators.ProductTabsList.PRODUCT_REVIEW_TAB;

public class ProductReviewPageObject extends BasePageObject {
    private Button addNewCommentBtn;
    private Button goToCommentBtn;
    private Button likeCommentBtn;
    private Button dislikeCommentBtn;
    private Button complainToCommentBtn;
    private Button replyToCommentBtn;
    private Button complainToReplyBtn;
    private Button showMoreRepliesBtn;
    private Button showMoreCommentsBtn;
    private Button reviewTabBtn;

    private Label reviewTabCounterLbl;
    private Label reviewHeaderLbl;
    private Label reviewHeaderCounterLbl;
    private Label mediaHeaderLbl;

    private WebElement commentComponentElement;
    private WebElement replyComponentElement;

    private DropDown sortCommentsDD;

    private List<WebElement> reviewMediaList;
    private List<WebElement> commentComponentList;
    private List<WebElement> replyComponentList;

    public ProductReviewPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductReviewPageObject addNewComment() {
        addNewCommentBtn = new Button(driver, PRODUCT_REVIEW_NEW_COMMENT);
        return this;
    }

    public ProductReviewPageObject goToComment() {
        goToCommentBtn = new Button(driver, PRODUCT_REVIEW_LINK_TO_COMMENT);
        return this;
    }

    public ProductReviewPageObject likeComment() {
        likeCommentBtn = new Button(driver, PRODUCT_REVIEW_LIKE_COMMENT);
        return this;
    }

    public ProductReviewPageObject dislikeComment() {
        dislikeCommentBtn = new Button(driver, PRODUCT_REVIEW_DISLIKE_COMMENT);
        return this;
    }

    public ProductReviewPageObject complainToComment() {
        complainToCommentBtn = new Button(driver, PRODUCT_REVIEW_COMPLAIN_TO_COMMENT);
        return this;
    }

    public ProductReviewPageObject replyToComment() {
        replyToCommentBtn = new Button(driver, PRODUCT_REVIEW_REPLY_TO_COMMENT_BUTTON);
        return this;
    }

    public ProductReviewPageObject complainToReply() {
        complainToReplyBtn = new Button(driver, PRODUCT_REVIEW_COMPLAIN_TO_REPLY_COMMENT);
        return this;
    }

    public ProductReviewPageObject showMoreReplies() {
        showMoreRepliesBtn = new Button(driver, PRODUCT_REVIEW_SHOW_MORE_REPLIES);
        return this;
    }

    public ProductReviewPageObject showMoreComments() {
        showMoreCommentsBtn = new Button(driver, PRODUCT_REVIEW_SHOW_MORE_COMMENTS);
        return this;
    }

    public ProductReviewPageObject reviewTab() {
        reviewTabBtn = new Button(driver, PRODUCT_REVIEW_TAB);
        return this;
    }

    public ProductReviewPageObject reviewTabCounter() {
        reviewTabCounterLbl = new Label(driver, PRODUCT_REVIEW_TAB_COUNTER);
        return this;
    }

    public ProductReviewPageObject reviewHeader() {
        reviewHeaderLbl = new Label(driver, PRODUCT_REVIEW_HEADER);
        return this;
    }

    public ProductReviewPageObject reviewHeaderCounter() {
        reviewHeaderCounterLbl = new Label(driver, PRODUCT_REVIEW_HEADER_COUNTER);
        return this;
    }

    public ProductReviewPageObject mediaHeader() {
        mediaHeaderLbl = new Label(driver, PRODUCT_REVIEW_MEDIA_HEADER);
        return this;
    }

    public ProductReviewPageObject commentComponent() {
        commentComponentElement = driver.findElement(By.xpath(PRODUCT_REVIEW_COMMENT_COMPONENT));
        return this;
    }

    public ProductReviewPageObject replyComponentElement() {
        replyComponentElement = driver.findElement(By.xpath(PRODUCT_REVIEW_REPLY_COMMENT));
        return this;
    }

    public ProductReviewPageObject sortCommentsDD() {
        sortCommentsDD = new DropDown(driver, PRODUCT_REVIEW_DROPDOWN_SORT);
        return this;
    }

    private List<WebElement> findReviewMediaList() {
        reviewMediaList = driver.findElements(By.xpath(PRODUCT_REVIEW_MEDIA_LIST));
        return reviewMediaList;
    }

    private List<WebElement> commentComponentList() {
        commentComponentList = driver.findElements(By.xpath(PRODUCT_REVIEW_COMMENTS_LIST));
        return commentComponentList;
    }

    private List<WebElement> replyComponentList() {
        replyComponentList = driver.findElements(By.xpath(PRODUCT_REVIEW_REPLY_COMMENTS_LIST));
        return replyComponentList;
    }

}
