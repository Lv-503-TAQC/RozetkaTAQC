package locators;

public class ProductReviewsLocators {
    /*CommentPageObjectLocators*/
    public static final String GO_TO_COMMENT_BUTTON = ".//*[@class = 'button button_type_link product-comment__link']";
    public static final String COMPLAIN_TO_COMMENT = ".//*[@class = 'button button_type_link product-comment__report']";
    public static final String LIKE_COMMENT = ".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']";
    public static final String DISLIKE_COMMENT = ".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']";
    public static final String COMMENT_AUTHOR = ".//*[@class = 'product-comment__author']";
    public static final String COMMENT_DATE = ".//*[@class = 'product-comment__date']";
    public static final String REPLY_TO_COMMENT_BUTTON = ".//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']";
    public static final String COMMENT_BODY = ".//*[@class = 'product-comment__body']";

    /*ProductReviewPageObject*/
    public static final String COMMENTS_LIST = "//*[@class = 'product-comments__list-item']";



    public static final String PRODUCT_REVIEW_TAB_COUNTER = "//*[@class = 'product-tabs__link-text']";
    public static final String PRODUCT_REVIEW_HEADER = "//*[@class = 'product-tabs__heading']";
    public static final String PRODUCT_REVIEW_HEADER_COUNTER = "//*[@class = 'product-tabs__heading_color_gray']";
    public static final String PRODUCT_REVIEW_DROPDOWN_SORT = "//*[@id = 'comments-sort-select']";
    public static final String PRODUCT_REVIEW_MEDIA_HEADER = "//*[@class = 'product-comments__photos-heading']";
    public static final String PRODUCT_REVIEW_MEDIA_LIST = "//*[@class = 'product-comments__photos-list']";
    public static final String PRODUCT_REVIEW_NEW_COMMENT = "//*[@class = 'button button_color_navy button_size_medium']";
    public static final String PRODUCT_REVIEW_COMMENT_COMPONENT = "//*[@class = 'product-comments__list-item'][1]";

    public static final String PRODUCT_REVIEW_SHOW_MORE_COMMENTS = "//*[@class = 'button button_size_medium product-comments__show-more']";
}
