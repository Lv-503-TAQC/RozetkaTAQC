package locators;

public class AllAboutProductLocators {

    public static final String PRODUCT_OPTIONS = "//*[@class = 'product-main__parameters']//li";
    //public static final String PRODUCT_AVAILABILITY = ".product__status";
    //Locator to find the list of all the additional cervices
    public static final String ADDITIONAL_SERVICES_LIST = "//*[@class = 'additional-services']//li";
    //Locators to find the desirable element of the desirable additional service
    public static final String ADDITIONAL_CERVICE_CHECKBOX = "//*[@class = 'additional-service__checkbox']";
    public static final String ADDITIONAL_CERVICE_INFO = "//*[@class = 'additional-service__checkbox']//button";
    public static final String ADDITIONAL_CERVICE_DROPDOWN = "//*[@class = 'additional-service']//select";
    public static final String ADDITIONAL_CERVICE_PRICE = "//*[@class = 'additional-service__price']";
    public static final String SELLER_INFO = ".product-seller__title";
    public static final String SELLER_FEEDBACK = ".product-seller__feedback";
    public static final String SELLER_LOGO = "//*[@class = 'product-seller__logo']//img";
    //Locator to find the list of all the pictograms
    public static final String BONUS_PICTOGRAMS_LIST = "//*[@class = 'product-about__right']//li//img";
    public static final String DELIVERY_CITY_MODAL = "//*[@class = 'product-about__block-heading']//button";
    //Locators for delivery city modal window should be added here
    public static final String PREMIUM_DELIVERY_LINK = "//*[contains (@class, 'product-premium__button')]";
    public static final String PRODUCT_PICTOGRAMS_LIST = "//*[@class = 'product-about__sticky']//app-product-pictogram-list//li//img";
    public static final String PRODUCT_INFO_BRIEF = ".product-about__brief";
}
