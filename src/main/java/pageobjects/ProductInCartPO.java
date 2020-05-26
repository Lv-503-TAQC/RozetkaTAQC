package pageobjects;

import locators.ProductInCartLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProductInCartPO extends BasePageObject{
    private WebElement element;
    private int prodPriceModal;

    public ProductInCartPO(WebDriver driver) {
        super(driver);
    }

    public ProductInCartPO(WebDriver driver, WebElement element) {
        super(driver);
        this.element = element;
    }

    public int getProdPriceModal() {
        String priceString = new TextField(element, ProductInCartLocators.PRODUCT_PRICE_MODAL).getText();
        Pattern p = Pattern.compile("[\\d\\s]+");
        Matcher m = p.matcher(priceString);

        if (m.find()) {
            String substring = priceString.substring(m.start(), m.end());
            substring = substring.trim();
            substring = substring.replace(" ", "");
            prodPriceModal = Integer.parseInt(substring);
        }
        return prodPriceModal;
    }


}
