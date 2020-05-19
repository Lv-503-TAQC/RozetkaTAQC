package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.Checkbox;
import pageelements.DropDown;
import pageelements.TextField;

public class ProductOptionsPO extends BasePageObject {


    private DropDown prodOptionDropdown;
    private Checkbox prodOptionCheckbox;
    private String price;
    private Button info;


    public ProductOptionsPO(WebDriver driver) {
        super(driver);
    }


    public DropDown getDropdown(WebElement listItem) {
        prodOptionDropdown = new DropDown(listItem, AllAboutProductLocators.ADDITIONAL_SERVICE_DROPDOWN);
        return prodOptionDropdown;
    }

    public Checkbox getCheckbox(WebElement listItem) {
        prodOptionCheckbox = new Checkbox(listItem, AllAboutProductLocators.ADDITIONAL_SERVICE_CHECKBOX);
        return prodOptionCheckbox;
    }

    public String getPrice(WebElement listItem) {
        price = new TextField(listItem, AllAboutProductLocators.SELLER_FEEDBACK).getText();
        return price;
    }

    public ProductOptionsPO clickInfo(WebElement listItem) {
        info = new Button(listItem, AllAboutProductLocators.ADDITIONAL_SERVICE_INFO).click();
        return this;
    }
}



