package pageobjects;

import locators.ProductReviewsLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.Label;

import java.util.List;

public class CommentPageObject extends BasePageObject {
    private WebElement element;

    private Label commentAuthorLbl;
    private Label commentDateLbl;
    private Label commentBodyLbl;

    private Button complainToCommentBtn;
    private Button likeToCommentBtn;
    private Button dislikeToCommentBtn;
    private Button replyToCommentBtn;
    private Button goToCommentLBtn;

    private List<RepliesToCommentPageObject> repliesCommentList;

    public CommentPageObject(WebDriver driver) {
        super(driver);
    }

    public CommentPageObject(WebDriver driver, WebElement element) {
        super(driver);
        this.element = element;
    }

    public Label getCommentAuthor() {
        commentAuthorLbl = new Label(element, ProductReviewsLocators.COMMENT_AUTHOR);

        return commentAuthorLbl;
    }

    public Label getCommentDate() {
        commentDateLbl = new Label(element, ProductReviewsLocators.COMMENT_DATE);

        return commentDateLbl;
    }

    public Label getCommentBody() {
        commentBodyLbl = new Label(element, ProductReviewsLocators.COMMENT_BODY);

        return commentBodyLbl;
    }

    public ComplainPopupDialogPageObject complainToComment() {
        complainToCommentBtn = new Button(element, ProductReviewsLocators.COMPLAIN_TO_COMMENT);
        complainToCommentBtn.click();

        return new ComplainPopupDialogPageObject(driver);
    }

    public ReplyPopupDialogPageObject replyToComment() {
        replyToCommentBtn = new Button(element, ProductReviewsLocators.REPLY_TO_COMMENT_BUTTON);
        replyToCommentBtn.click();

        return new ReplyPopupDialogPageObject(driver);
    }

    public CommentPageObject likeToComment() {
        likeToCommentBtn = new Button(element, ProductReviewsLocators.LIKE_COMMENT);
        likeToCommentBtn.click();

        return this;
    }

    public CommentPageObject dislikeToComment() {
        dislikeToCommentBtn = new Button(element, ProductReviewsLocators.DISLIKE_COMMENT);
        dislikeToCommentBtn.click();

        return this;
    }

    public CommentPageObject goToComment() {
        goToCommentLBtn = new Button(element, ProductReviewsLocators.GO_TO_COMMENT_BUTTON);
        goToCommentLBtn.click();

        return new CommentPageObject(driver, element);
    }
}
