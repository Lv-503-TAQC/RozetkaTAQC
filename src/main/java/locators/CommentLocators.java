package locators;

import org.openqa.selenium.By;

public enum CommentLocators implements Locator {
    GO_TO_COMMENT_BUTTON(By.xpath(".//*[@class = 'button button_type_link product-comment__link']")),
    COMPLAIN_TO_COMMENT(By.xpath(".//*[@class = 'button button_type_link product-comment__report']")),
    LIKE_COMMENT(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']")),
    DISLIKE_COMMENT(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']")),
    COMMENT_AUTHOR(By.xpath(".//*[@class = 'product-comment__author']")),
    COMMENT_DATE(By.xpath(".//*[@class = 'product-comment__date']")),
    REPLY_TO_COMMENT_BUTTON(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']")),
    COMMENT_BODY(By.xpath(".//*[@class = 'product-comment__body']")),
    ALREADY_BUY(By.xpath(".//*[@class = 'product-comment__label']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    CommentLocators(By path) {
        this.path = path;
    }
}
