package locators;

import org.openqa.selenium.By;

public enum ProductReviewsLocators implements Locator {
    COMMENTS_LIST(By.xpath("//*[@class = 'product-comments__list-item']")),
    REVIEW_MEDIA_LIST(By.xpath("//*[@class = 'product-comments__photos-item']")),
    NEW_COMMENT(By.xpath("//*[@class = 'button button_color_navy button_size_medium']")),
    SHOW_MORE_COMMENTS(By.xpath("//*[@class = 'button button_size_medium product-comments__show-more']")),
    REVIEW_TAB(By.xpath("//*[@class = 'product-tabs__list']//li[3]")),
    TAB_COUNTER(By.xpath("//*[@class = 'product-tabs__link-text']")),
    HEADER(By.xpath("//*[@class = 'product-tabs__heading']")),
    HEADER_COUNTER(By.xpath("//*[@class = 'product-tabs__heading_color_gray']")),
    SORTING(By.xpath("//*[@id = 'comments-sort-select']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    ProductReviewsLocators(By path) {
        this.path = path;
    }
}
