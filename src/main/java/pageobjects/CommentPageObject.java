package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.Label;

import java.util.List;

import static locators.ProductReviewsLocators.*;

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
        commentAuthorLbl = new Label(element, COMMENT_AUTHOR);

        return commentAuthorLbl;
    }

    public Label getCommentDate() {
        commentDateLbl = new Label(element, COMMENT_DATE);

        return commentDateLbl;
    }

    public Label getCommentBody() {
        commentBodyLbl = new Label(element, COMMENT_BODY);

        return commentBodyLbl;
    }

    public ComplainPopupDialogPageObject complainToComment() {
        complainToCommentBtn = new Button(element, COMPLAIN_TO_COMMENT);
        complainToCommentBtn.click();

        return new ComplainPopupDialogPageObject(driver);
    }

    public ReplyPopupDialogPageObject replyToComment() {
        replyToCommentBtn = new Button(element, REPLY_TO_COMMENT_BUTTON);
        replyToCommentBtn.click();

        return new ReplyPopupDialogPageObject(driver);
    }

    public CommentPageObject likeToComment() {
        likeToCommentBtn = new Button(element, LIKE_COMMENT);
        likeToCommentBtn.click();

        return this;
    }

    public CommentPageObject dislikeToComment() {
        dislikeToCommentBtn = new Button(element, DISLIKE_COMMENT);
        dislikeToCommentBtn.click();

        return this;
    }

    public CommentPageObject goToComment() {
        goToCommentLBtn = new Button(element, GO_TO_COMMENT_BUTTON);
        goToCommentLBtn.click();

        return new CommentPageObject(driver, element);
    }
}
