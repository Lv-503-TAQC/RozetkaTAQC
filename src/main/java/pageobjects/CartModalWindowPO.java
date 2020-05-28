package pageobjects;

import locators.CartModalWindowLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CartModalWindowPO extends BasePageObject {

    private List<ProductInCartPO> productsInCartList;
    private int totalModalInt;
    private String totalModalString;

    public CartModalWindowPO(WebDriver driver) {

        super(driver);
    }

    public ProductInCartPO getProducActionsBlock() {
        return new ProductInCartPO(driver);
    }

    public List<ProductInCartPO> getProductsInCartList() {
    productsInCartList = new ArrayList<ProductInCartPO>();

    List<WebElement> listOfProducts = driver.findElements(CartModalWindowLocators.PRODUCT_IN_CART.getPath());
    for (WebElement listItem : listOfProducts) {
        productsInCartList.add(new ProductInCartPO(driver, listItem));
    }
    return productsInCartList;
}

    public int getTotalModalInt() {
                String priceString = new TextField(driver, CartModalWindowLocators.CART_TOTAL_MODAL).getText();
        Pattern p = Pattern.compile("[\\d\\s]+");
        Matcher m = p.matcher(priceString);

        if (m.find()) {
            String substring = priceString.substring(m.start(), m.end());
            substring = substring.trim();
            substring = substring.replace(" ", "");
            totalModalInt = Integer.parseInt(substring);
        }
        return totalModalInt;
    }
    public String getTotalModalString() {
        totalModalString = new TextField(driver, CartModalWindowLocators.CART_TOTAL_MODAL).getText();
        Pattern p = Pattern.compile("[\\d\\s]+");
        Matcher m = p.matcher(totalModalString);

        if (m.find()) {
            String substring = totalModalString.substring(m.start(), m.end());
            substring = substring.trim();
            substring = substring.replace(" ", "");
            totalModalString = substring;
        }
        return totalModalString;
    }

}
