package locators;

import org.openqa.selenium.By;

public enum ProductReviewsLocators implements Locator {
    PRODUCT_REVIEW_TAB_COUNTER(By.xpath("//*[@class = 'product-tabs__link-text']")),
    PRODUCT_REVIEW_HEADER(By.xpath("//*[@class = 'product-tabs__heading']")),
    PRODUCT_REVIEW_HEADER_COUNTER(By.xpath("//*[@class = 'product-tabs__heading_color_gray']")),
    PRODUCT_REVIEW_DROPDOWN_SORT(By.xpath("//*[@id = 'comments-sort-select']")),
    PRODUCT_REVIEW_MEDIA_HEADER(By.xpath("//*[@class = 'product-comments__photos-heading']")),
    PRODUCT_REVIEW_MEDIA_LIST(By.xpath("//*[@class = 'product-comments__photos-list']")),
    PRODUCT_REVIEW_NEW_COMMENT(By.xpath("//*[@class = 'button button_color_navy button_size_medium']")),
    PRODUCT_REVIEW_COMMENT_COMPONENT(By.xpath("//*[@class = 'product-comments__list-item'][5]")),
    PRODUCT_REVIEW_COMMENTS_LIST(By.xpath("//*[@class = 'product-comments__list-item']")),
    PRODUCT_REVIEW_LINK_TO_COMMENT(By.xpath("//*[@class = 'product-comments__list-item'][5]//*[@class = 'product-comment__actions']/li[1]")),
    PRODUCT_REVIEW_COMPLAIN_TO_COMMENT(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'product-comment__actions']/li[2]")),
    PRODUCT_REVIEW_LIKE_COMMENT(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']")),
    PRODUCT_REVIEW_DISLIKE_COMMENT(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']")),
    PRODUCT_REVIEW_REPLY_TO_COMMENT_BUTTON(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']")),
    PRODUCT_REVIEW_COMMENT_BODY(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'product-comment__body']")),
    PRODUCT_REVIEW_REPLY_COMMENT(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'product-comments__list'][1]")),
    PRODUCT_REVIEW_REPLY_COMMENTS_LIST(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'product-comments__list']")),
    PRODUCT_REVIEW_COMPLAIN_TO_REPLY_COMMENT(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'button button_type_link product-comment__report']")),

    PRODUCT_REVIEW_SHOW_MORE_REPLIES(By.xpath("//*[@class = 'product-comments__list-item']//*[@class = 'button button_size_medium product-comment__show-more']")),

    PRODUCT_REVIEW_SHOW_MORE_COMMENTS(By.xpath("//*[@class = 'button button_size_medium product-comments__show-more']"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private ProductReviewsLocators(By path) {
        this.path = path;
    }

}
