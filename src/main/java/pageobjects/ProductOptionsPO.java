package pageobjects;

import locators.ProductServicesLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageelements.Button;
import pageelements.Checkbox;
import pageelements.DropDown;
import pageelements.TextField;

import java.util.List;

import static locators.ProductServicesLocators.*;

public class ProductOptionsPO extends BasePageObject {

    private WebElement element;

    private Select prodOptionDropdown;
    private Checkbox prodOptionCheckbox;
    private String checkboxValue;
    private String price;
    private Button info;
    private List<WebElement> dropdOptions;


    public ProductOptionsPO(WebDriver driver) {

        super(driver);
    }

    public ProductOptionsPO(WebDriver driver, WebElement element) {
        super(driver);
        this.element = element;
    }

    /**
     * Method finds the dropdown element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return the dropdown element.
     */
    public Select getDropdown() {
        prodOptionDropdown = new DropDown(element, ADDITIONAL_SERVICE_DROPDOWN).getSelect();
        return prodOptionDropdown;
    }

    /**
     * Method finds the options of the dropdown element.
     * Method which finds the dropdown is above
     * (see getDropdown()).
     * @return the dropdown element.
     */
    public List<WebElement> getOptions () {
        dropdOptions = this.getOptions();
        return dropdOptions;
    }

    /**
     * Method reads the option value.
     * Method which gets the options is above
     * (see getOptions()).
     * @param option - desirable dropdown option.
     * @return the ProductOptionsPO object.
     */
    public ProductOptionsPO readOption (WebElement option) {
        option.getText();
        return this;
    }

    /**
     * Method selects the options of the dropdown element.
     * Method which gets the options is above
     * (see getOptions()).
     * @param option - desirable dropdown option.
     * @return the ProductOptionsPO object.
     */
    public ProductOptionsPO selectOption (WebElement option) {
        option.click();
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
    public ProductOptionsPO clickCheckbox() {
        prodOptionCheckbox = new Checkbox(element, ADDITIONAL_SERVICE_CHECKBOX).click();
        return this;
    }

    /**
     * Method finds the price element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return String with a price.
     */
    public String getPrice() {
        price = new TextField(element, ADDITIONAL_SERVICE_PRICE).getText();
        return price;
    }

    /**
     * Method finds the info button element in product service item.
     * Method which finds the list of all product service items available
     * is a part of AllAboutProductTabPO (see createListOfProductOptions()).
     * @return ProductOptionsPO object.
     */
    public ProductOptionsPO clickInfo() {
        info = new Button(element, ADDITIONAL_SERVICE_INFO).click();
        return this;
    }


}



