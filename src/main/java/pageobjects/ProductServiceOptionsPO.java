package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageelements.Button;
import pageelements.Checkbox;
import pageelements.DropDown;
import pageelements.TextField;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static locators.ProductServicesLocators.*;

public class ProductServiceOptionsPO extends BasePageObject {

    private WebElement element;

    private Select prodOptionDropdown;
    private Checkbox prodOptionCheckbox;
    private String checkboxValue;
    private int priceInt;
    private String priceString;
    private Button info;
    private List<WebElement> dropdOptions;


    public ProductServiceOptionsPO(WebDriver driver) {

        super(driver);
    }

    public ProductServiceOptionsPO(WebDriver driver, WebElement element) {
        super(driver);
        this.element = element;
    }

    /**
     * Method finds the dropdown element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return the dropdown element.
     */
    public ProductServiceOptionsPO getDropdown() {
        prodOptionDropdown = new DropDown(element, ADDITIONAL_SERVICE_DROPDOWN).getSelect();
        return this;
    }

    /**ToDo
     * Method finds the options of the dropdown element.
     * Method which finds the dropdown is above
     * (see getDropdown()).
     * @return the dropdown element.
     */


    /**
     * Method reads the option value.
     * Method which gets the options is above
     * (see getOptions()).
     * @param option - desirable dropdown option.
     * @return the ProductServiceOptionsPO object.
     */
    public ProductServiceOptionsPO readOption (WebElement option) {
        option.getText();
        return this;
    }

    /**
     * Method selects the options of the dropdown element.
     * Method which gets the options is above
     * (see getOptions()).
     * @return the ProductServiceOptionsPO object.
     */
   public ProductServiceOptionsPO selectOptionByIndex(int i) {
       prodOptionDropdown.selectByIndex(i);
        return this;
    }

    /**
     * Method finds the checkbox element in product service item and reads it.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return the dropdown element.
     */
    public String readCheckbox() {
       checkboxValue = new TextField (element, ADDITIONAL_SERVICE_CHECKBOX).getText();
       return checkboxValue;
    }

    /**
     * Method finds the checkbox element in product service item and enables it.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return the dropdown element.
     */
    public ProductServiceOptionsPO clickCheckbox() {
        prodOptionCheckbox = new Checkbox(element, ADDITIONAL_SERVICE_CHECKBOX).click();
        return this;
    }

    /**
     * Method finds the price element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return String with a price.
     */
    public int getPriceInt() {
       String tempPriceString = new TextField(element, ADDITIONAL_SERVICE_PRICE).getText();
        String regex = "[\\d\\s]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(tempPriceString);

        if (m.find()) {
            String substring = tempPriceString.substring(m.start(), m.end());
            substring = substring.trim();
            substring = substring.replace(" ", "");
            priceInt = Integer.parseInt(substring);
        }
        return priceInt;
    }
    public String getPriceString() {
        priceString = new TextField(element, ADDITIONAL_SERVICE_PRICE).getText();
        String regex = "[\\d\\s]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(priceString);

        if (m.find()) {
            String substring = priceString.substring(m.start(), m.end());
            substring = substring.trim();
            substring = substring.replace(" ", "");
            priceString = substring;
        }
        return priceString;
    }

    /**
     * Method finds the info button element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return ProductServiceOptionsPO object.
     */
    public ProductServiceOptionsPO clickInfo() {
        info = new Button(element, ADDITIONAL_SERVICE_INFO).click();
        return this;
    }


}



