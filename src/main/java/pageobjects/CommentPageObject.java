package pageobjects;

import locators.CommentLocators;
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

    private List<ReplyToCommentPageObject> repliesToCommentList;

    public CommentPageObject(WebDriver driver) {
        super(driver);
    }

    public CommentPageObject(WebDriver driver, WebElement element) {
        super(driver);
        this.element = element;
    }

    public boolean isAlreadyBuy() {
        WebElement alreadyBuyIcon = element.findElement(CommentLocators.ALREADY_BUY.getPath());

        return alreadyBuyIcon.isDisplayed();
    }

    public SingleCommentPageObject goToCommentPage() {
        goToCommentLBtn = new Button(driver, CommentLocators.GO_TO_COMMENT_BUTTON);
        goToCommentLBtn.click();

        return new SingleCommentPageObject(driver);
    }

    public Label getCommentAuthor() {
        commentAuthorLbl = new Label(element, CommentLocators.COMMENT_AUTHOR);

        return commentAuthorLbl;
    }

    public Label getCommentDate() {
        commentDateLbl = new Label(element, CommentLocators.COMMENT_DATE);

        return commentDateLbl;
    }

    public Label getCommentBody() {
        commentBodyLbl = new Label(element, CommentLocators.COMMENT_BODY);

        return commentBodyLbl;
    }

    public ComplainPopupDialogPageObject complainToComment() {
        complainToCommentBtn = new Button(element, CommentLocators.COMPLAIN_TO_COMMENT);
        complainToCommentBtn.click();

        return new ComplainPopupDialogPageObject(driver);
    }

    public ReplyPopupDialogPageObject replyToComment() {
        replyToCommentBtn = new Button(element, CommentLocators.REPLY_TO_COMMENT_BUTTON);
        replyToCommentBtn.click();

        return new ReplyPopupDialogPageObject(driver);
    }

    public CommentPageObject likeToComment() {
        likeToCommentBtn = new Button(element, CommentLocators.LIKE_COMMENT);
        likeToCommentBtn.click();

        return this;
    }

    public CommentPageObject dislikeToComment() {
        dislikeToCommentBtn = new Button(element, CommentLocators.DISLIKE_COMMENT);
        dislikeToCommentBtn.click();

        return this;
    }

    public SingleCommentPageObject goToSingleCommentPage() {
        goToCommentLBtn = new Button(element, CommentLocators.GO_TO_COMMENT_BUTTON);
        goToCommentLBtn.click();

        return new SingleCommentPageObject(driver);
    }
}
