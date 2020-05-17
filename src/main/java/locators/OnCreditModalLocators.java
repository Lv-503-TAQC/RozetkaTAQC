package locators;

public class OnCreditModalLocators {

    public static final String CLOSE_THE_MODAL = ".modal__close";
    public static final String STANDARD_CREDIT_SELECT = "//*[contains (text(), 'Стандарт')]//following::div[1]//select";
    public static final String STANDARD_CREDIT_BUTTON = "//*[contains (text(), 'Стандарт')]//following::div[2]//button";
    public static final String ALPHA_CREDIT_SELECT = "//*[contains (text(), 'Альфа')]//following::div[1]//select";
    public static final String ALPHA_CREDIT_BUTTON = "//*[contains (text(), 'Альфа')]//following::div[2]//button";
    public static final String MONO_CREDIT_SELECT = "//*[contains (text(), 'monobank')]//following::div[1]//select";
    public static final String MONO_CREDIT_BUTTON = "//*[contains (text(), 'monobank')]//following::div[2]//button";
    public static final String THREE_MONTH_CONCES_SELECT = "//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[1]//select";
    public static final String THREE_MONTH_CONCES_BUTTON = "//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[2]//button";
    public static final String TEN_MONTH_CONCES_SELECT = "//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[1]//select";
    public static final String TEN_MONTH_CONCES_BUTTON = "//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[2]//button";
    public static final String PAY_IN_PARTS_SELECT = "//*[contains (text(), 'Оплата')]//following::div[1]//select";
    public static final String PAY_IN_PARTS_BUTTON = "//*[contains (text(), 'Оплата')]//following::div[2]//button";
}
