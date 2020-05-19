package locators;

public class AllAboutProductLocators {

    public static final String PRODUCT_OPTIONS = "//*[@class = 'product-main__parameters']//li";
    public static final String IN_STOCK_STRING = "//*[contains (@class,'product__status')]";
    public static final String NOTIF_WHEN_IN_STOCK_BTN = "//*[@class = 'product-statuses']//button";
    //Locator to find the list of all the additional cervices
    public static final String ADDITIONAL_SERVICES_LIST = "//*[@class = 'additional-services']//li";
    public static final String SELLER_NAME = "//*[@class = 'product-seller__title']";
    public static final String SELLER_FEEDBACK = "//*[@class = 'product-seller__feedback']";
    public static final String SELLER_LOGO = "//*[@class = 'product-seller__logo']//img";
    //Locator to find the list of all the pictograms
    public static final String BONUS_PICTOGRAMS_LIST = "//*[@class = 'product-about__right']//li//img";
    public static final String DELIVERY_CITY_MODAL = "//*[@class = 'product-about__block-heading']//button";
    //Locators for delivery city modal window should be added here
    public static final String PREMIUM_DELIVERY_LINK = "//*[contains (@class, 'product-premium__button')]";
    public static final String PRODUCT_PICTOGRAMS_LIST = "//*[@class = 'product-about__sticky']//app-product-pictogram-list//li//img";
    public static final String PRODUCT_INFO_BRIEF = "//*[@class = 'product-about__brief']";
    public static final String DETAILED_PRODUCT_INFO_LINK = "//a[@class = 'product-about__description-anchor']";
}
