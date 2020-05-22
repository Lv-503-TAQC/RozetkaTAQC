package locators;

import org.openqa.selenium.By;

public enum ProductReviewsLocators implements Locator {
    /*CommentPageObjectLocators*/
    GO_TO_COMMENT_BUTTON(By.xpath(".//*[@class = 'button button_type_link product-comment__link']")),
    COMPLAIN_TO_COMMENT(By.xpath(".//*[@class = 'button button_type_link product-comment__report']")),
    LIKE_COMMENT(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']")),
    DISLIKE_COMMENT(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']")),
    COMMENT_AUTHOR(By.xpath(".//*[@class = 'product-comment__author']")),
    COMMENT_DATE(By.xpath(".//*[@class = 'product-comment__date']")),
    REPLY_TO_COMMENT_BUTTON(By.xpath(".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']")),
    COMMENT_BODY(By.xpath(".//*[@class = 'product-comment__body']")),

    /*ProductReviewPageObject*/
    COMMENTS_LIST(By.xpath("//*[@class = 'product-comments__list-item']")),
    REVIEW_MEDIA_LIST(By.xpath("//*[@class = 'product-comments__photos-list']")),
    NEW_COMMENT(By.xpath("//*[@class = 'button button_color_navy button_size_medium']"));

    private By path;

    @Override
    public By getPath() {
        return path;
    }

    private ProductReviewsLocators(By path) {
        this.path = path;
    }
}
