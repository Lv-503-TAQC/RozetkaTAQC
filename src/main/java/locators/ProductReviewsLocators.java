package locators;

public class ProductReviewsLocators {
    public static final String PRODUCT_REVIEW_COUNTER = "//*[@class = 'product-tabs__link-text']";
    public static final String PRODUCT_REVIEW_TAB_HEADER = "//*[@class = 'product-tabs__heading']";
    public static final String PRODUCT_REVIEW_TAB_HEADER_COUNTER = "//*[@class = 'product-tabs__heading_color_gray']";
    public static final String PRODUCT_REVIEW_DROPDOWN_SORT = "//*[@id = 'comments-sort-select']";
    public static final String PRODUCT_REVIEW_MEDIA_HEADER = "//*[@class = 'product-comments__photos-heading']";
    public static final String PRODUCT_REVIEW_MEDIA_LIST = "//*[@class = 'product-comments__photos-list']";
    public static final String PRODUCT_REVIEW_NEW_COMMENT = "//*[@class = 'button button_color_navy button_size_medium']";
    public static final String PRODUCT_REVIEW_COMMENT_COMPONENT = "//*[@class = 'product-comments__list-item'][1]";
    public static final String PRODUCT_REVIEW_LINK_TO_COMMENT = PRODUCT_REVIEW_COMMENT_COMPONENT + "//*[@class = 'product-comment__actions']/li[1]";
    public static final String PRODUCT_REVIEW_COMPLAIN_TO_COMMENT = PRODUCT_REVIEW_COMMENT_COMPONENT + "//*[@class = 'product-comment__actions']/li[2]";

    public static final String PRODUCT_REVIEW_LIKE_TO_COMMENT = PRODUCT_REVIEW_COMMENT_COMPONENT
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']";

    public static final String PRODUCT_REVIEW_DISLIKE_TO_COMMENT = PRODUCT_REVIEW_COMMENT_COMPONENT
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']";

    public static final String PRODUCT_REVIEW_REPLY_TO_COMMENT_BUTTON = PRODUCT_REVIEW_COMMENT_COMPONENT
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']";

    public static final String PRODUCT_REVIEW_COMMENT_BODY = PRODUCT_REVIEW_COMMENT_COMPONENT + "//*[@class = 'product-comment__body']";
    public static final String PRODUCT_REVIEW_COMMENT_REPLY = PRODUCT_REVIEW_COMMENT_COMPONENT + "//*[@class = 'product-comments__list'][1]";
    public static final String PRODUCT_REVIEW_COMPLAIN_TO_REPLY = PRODUCT_REVIEW_COMMENT_REPLY + "//*[@class = 'button button_type_link product-comment__report']";

    public static final String PRODUCT_REVIEW_SHOW_MORE = "//*[@class = 'button button_size_medium product-comments__show-more']";
}
