package locators;

public class ProductReviewsLocators {
    public static final String PRODUCT_REVIEW_TAB_COUNTER = "//*[@class = 'product-tabs__link-text']";
    public static final String PRODUCT_REVIEW_HEADER = "//*[@class = 'product-tabs__heading']";
    public static final String PRODUCT_REVIEW_HEADER_COUNTER = "//*[@class = 'product-tabs__heading_color_gray']";
    public static final String PRODUCT_REVIEW_DROPDOWN_SORT = "//*[@id = 'comments-sort-select']";
    public static final String PRODUCT_REVIEW_MEDIA_HEADER = "//*[@class = 'product-comments__photos-heading']";
    public static final String PRODUCT_REVIEW_MEDIA_LIST = "//*[@class = 'product-comments__photos-list']";
    public static final String PRODUCT_REVIEW_NEW_COMMENT = "//*[@class = 'button button_color_navy button_size_medium']";
    public static final String PRODUCT_REVIEW_COMMENT_COMPONENT = "//*[@class = 'product-comments__list-item'][5]";
    public static final String PRODUCT_REVIEW_COMMENTS_LIST = "//*[@class = 'product-comments__list-item']";
    public static final String PRODUCT_REVIEW_LINK_TO_COMMENT = PRODUCT_REVIEW_COMMENTS_LIST + "//*[@class = 'product-comment__actions']/li[1]";
    public static final String PRODUCT_REVIEW_COMPLAIN_TO_COMMENT = PRODUCT_REVIEW_COMMENTS_LIST + "//*[@class = 'product-comment__actions']/li[2]";
    public static final String PRODUCT_REVIEW_LIKE_COMMENT = PRODUCT_REVIEW_COMMENTS_LIST
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote']";
    public static final String PRODUCT_REVIEW_DISLIKE_COMMENT = PRODUCT_REVIEW_COMMENTS_LIST
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__vote product-comment__vote_type_dislike']";
    public static final String PRODUCT_REVIEW_REPLY_TO_COMMENT_BUTTON = PRODUCT_REVIEW_COMMENTS_LIST
            + "//*[@class = 'button button_size_medium button_type_link button_with_icon product-comment__reply']";
    public static final String PRODUCT_REVIEW_COMMENT_BODY = PRODUCT_REVIEW_COMMENTS_LIST + "//*[@class = 'product-comment__body']";
    public static final String PRODUCT_REVIEW_REPLY_COMMENT = PRODUCT_REVIEW_COMMENTS_LIST + "//*[@class = 'product-comments__list'][1]";
    public static final String PRODUCT_REVIEW_REPLY_COMMENTS_LIST = PRODUCT_REVIEW_COMMENTS_LIST + "//*[@class = 'product-comments__list']";
    public static final String PRODUCT_REVIEW_COMPLAIN_TO_REPLY_COMMENT = PRODUCT_REVIEW_REPLY_COMMENTS_LIST
            + "//*[@class = 'button button_type_link product-comment__report']";

    public static final String PRODUCT_REVIEW_SHOW_MORE_REPLIES = PRODUCT_REVIEW_COMMENTS_LIST
            + "//*[@class = 'button button_size_medium product-comment__show-more']";

    public static final String PRODUCT_REVIEW_SHOW_MORE_COMMENTS = "//*[@class = 'button button_size_medium product-comments__show-more']";
}
