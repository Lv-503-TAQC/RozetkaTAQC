package locators;

import org.openqa.selenium.By;

public enum Locator {
    ADD_TO_CART_BUTTON(By.xpath("//*[@class='product__buy']//button")),
    ADD_TO_COMPARE_LIST_BUTTON(By.xpath("//*[@class = 'product__compare']//button")),
    ADD_TO_WISH_LIST(By.xpath("//*[@class = 'product__favorites']//button")),
    CREDIT_INFO(By.xpath("//*[@class='product-credit__info']")),
    BUY_ON_CREDIT(By.xpath("//*[@class = 'product-credit']//button")),


    PRODUCT_OPTIONS(By.xpath("//*[@class = 'product-main__parameters']//li")),
    IN_STOCK_STRING(By.xpath("//*[contains (@class,'product__status')]")),
    NOTIF_WHEN_IN_STOCK_BTN(By.xpath("//*[@class = 'product-statuses']//button")),
    //Locator to find the list of all the additional cervices
    ADDITIONAL_SERVICES_LIST(By.xpath("//*[@class = 'additional-services']//li")),
    SELLER_NAME(By.xpath("//*[@class = 'product-seller__title']")),
    SELLER_FEEDBACK(By.xpath("//*[@class = 'product-seller__feedback']")),
    SELLER_LOGO(By.xpath("//*[@class = 'product-seller__logo']//img")),
    //Locator to find the list of all the pictograms
    BONUS_PICTOGRAMS_LIST(By.xpath("//*[@class = 'product-about__right']//li//img")),
    DELIVERY_CITY_MODAL(By.xpath("//*[@class = 'product-about__block-heading']//button")),
    //Locators for delivery city modal window should be added here
    PREMIUM_DELIVERY_LINK(By.xpath("//*[contains (@class, 'product-premium__button')]")),
    PRODUCT_PICTOGRAMS_LIST(By.xpath("//*[@class = 'product-about__sticky']//app-product-pictogram-list//li//img")),
    PRODUCT_INFO_BRIEF(By.xpath("//*[@class = 'product-about__brief']")),
    DETAILED_PRODUCT_INFO_LINK(By.xpath("//a[@class = 'product-about__description-anchor']")),


    SCREEN_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][1]")),
    PROCESSOR_VALUE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][2]")),
    SCREEN_REFRESHING_RATE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][3]")),
    RAM_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][4]")),
    SHORT_CHARACTERISTICS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][5]")),
    OS_TYPE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][6]")),
    COLOR_LABEL(By.xpath("//dt[@class='product-characteristics__label'][7]")),
    PROCESSOR_GENERATION_LABEL(By.xpath("//dt[@class='product-characteristics__label'][8]")),
    KEYBOARD_LABEL(By.xpath("//dt[@class='product-characteristics__label'][9]")),
    HDD_SIZE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][10]")),
    CD_ROM_LABEL(By.xpath("//dt[@class='product-characteristics__label'][11]")),
    BATTERY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][12]")),
    EXTRA_RAM_SLOTS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][13]")),
    WEIGHT_LABEL(By.xpath("//dt[@class='product-characteristics__label'][14]")),
    RAM_TYPE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][15]")),
    ADDITIONAL_FEATURES_LABEL(By.xpath("//dt[@class='product-characteristics__label'][16]")),
    GRAPHIC_ADAPTER_LABEL(By.xpath("//dt[@class='product-characteristics__label'][17]")),
    NETWORK_ADAPTER_LABEL(By.xpath("//dt[@class='product-characteristics__label'][18]")),
    CONNECTORS_PORTS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][19]")),
    BATTERY_CHARACTERISTICS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][20]")),
    DIMENSIONS_LABEL(By.xpath("//dt[@class='product-characteristics__label'][21]")),
    PRODUCING_COUNTRY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][22]")),
    CONTENTS_OF_DELIVERY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][23]")),
    BRAND_COUNTRY_LABEL(By.xpath("//dt[@class='product-characteristics__label'][24]")),
    GUARANTEE_LABEL(By.xpath("//dt[@class='product-characteristics__label'][25]")),




    CHARACTERISTIC_LINK(By.xpath("//a[@class='product-tabs__link product-tabs__link_state_active']")),
    CHARACTERISTICS_BODY(By.xpath("//*[@class='product-tabs__body']")),
    CHARACTERISTICS_ELEMENTS_SECTION(By.xpath("//section[@class='product-characteristics__group']")),
    PRODUCT_CHARACTERISTICS_DATA_LIST(By.xpath("//dl[@class='product-characteristics__list']")),



    SCREEN_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][1]")),
    PROCESSOR_VALUE(By.xpath("//dd[@class='product-characteristics__value'][2]")),
    SCREEN_REFRESHING_RATE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][3]")),
    RAM_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][4]")),
    OS_TYPE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][6]")),
    COLOR_VALUE(By.xpath("//dd[@class='product-characteristics__value'][7]")),
    PROCESSOR_GENERATION_VALUE(By.xpath("//dd[@class='product-characteristics__value'][8]")),
    KEYBOARD_VALUE(By.xpath("//dd[@class='product-characteristics__value'][9]")),
    HDD_SIZE_VALUE(By.xpath("//dd[@class='product-characteristics__value'][10]")),
    CD_ROM_VALUE(By.xpath("//dd[@class='product-characteristics__value'][11]")),
    BATTERY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][12]")),
    EXTRA_RAM_SLOTS(By.xpath("//dd[@class='product-characteristics__value'][13]")),
    PRODUCING_COUNTRY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][22]")),
    BRAND_COUNTRY_VALUE(By.xpath("//dd[@class='product-characteristics__value'][24]")),
    GUARANTEE(By.xpath("//dd[@class='product-characteristics__value'][25]")),





    CLOSE_MODAL_BTN(By.xpath("//*[@class='modal__close']")),
    APPLY_BTN(By.xpath("//*[@class='header-location__footer']//button")),
    AUTOCOMPLETE_INPUT_FIELD(By.xpath("//modal//input")),
    LIST_OF_POPULAR_CITIES_BTNS(By.xpath("//*[@class='header-location__popular']//li")),
    GO_TO_MAIN_PAGE_LINK(By.xpath("//*[@class='header-location__footer']//a")),



    CLOSE_THE_MODAL(By.cssSelector(".modal__close")),
    STANDARD_CREDIT_SELECT(By.xpath("//*[contains (text(), 'Стандарт')]//following::div[1]//select")),
    STANDARD_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'Стандарт')]//following::div[2]//button")),
    ALPHA_CREDIT_SELECT(By.xpath("//*[contains (text(), 'Альфа')]//following::div[1]//select")),
    ALPHA_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'Альфа')]//following::div[2]//button")),
    MONO_CREDIT_SELECT(By.xpath("//*[contains (text(), 'monobank')]//following::div[1]//select")),
    MONO_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'monobank')]//following::div[2]//button")),
    THREE_MONTH_CONCES_SELECT(By.xpath("//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[1]//select")),
    THREE_MONTH_CONCES_BUTTON(By.xpath("//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[2]//button")),
    TEN_MONTH_CONCES_SELECT(By.xpath("//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[1]//select")),
    TEN_MONTH_CONCES_BUTTON(By.xpath("//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[2]//button")),
    PAY_IN_PARTS_SELECT(By.xpath("//*[contains (text(), 'Оплата')]//following::div[1]//select")),
    PAY_IN_PARTS_BUTTON(By.xpath("//*[contains (text(), 'Оплата')]//following::div[2]//button")),



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

    PRODUCT_REVIEW_SHOW_MORE_COMMENTS(By.xpath("//*[@class = 'button button_size_medium product-comments__show-more']")),



    //Locators to find the desirable element of the desirable additional service
    ADDITIONAL_SERVICE_CHECKBOX(By.xpath("//*[@class = 'additional-service__checkbox']")),
    ADDITIONAL_SERVICE_INFO(By.xpath("//button")),
    ADDITIONAL_SERVICE_DROPDOWN(By.xpath("//select")),
    ADDITIONAL_SERVICE_PRICE(By.xpath("//*[@class = 'additional-service__price']")),




    ALL_ABOUT_PRODUCT_TAB(By.xpath("//*[@class = 'product-tabs__list']/li[1]")),
    PRODUCT_REVIEW_TAB(By.xpath("//*[@class = 'product-tabs__list']/li[3]"));

    private By path;
    private Locator(By path) {
        this.path = path;
    }
    public By getBy() {
        return path;
    }
}
