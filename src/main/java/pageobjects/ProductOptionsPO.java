package pageobjects;

import locators.ProductServicesLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageelements.Button;
import pageelements.Checkbox;
import pageelements.DropDown;
import pageelements.TextField;

import java.util.List;

public class ProductOptionsPO extends BasePageObject {


    private DropDown prodOptionDropdown;
    private Checkbox prodOptionCheckbox;
    private String price;
    private Button info;
    private List<WebElement> dropdOptions;


    public ProductOptionsPO(WebDriver driver) {
        super(driver);
    }


    public DropDown getDropdown(WebElement listItem) {
        prodOptionDropdown = new DropDown(listItem, ProductServicesLocators.ADDITIONAL_SERVICE_DROPDOWN);
        return prodOptionDropdown;
    }

    public ProductOptionsPO clickCheckbox(WebElement listItem) {
        WebElement locator = driver.findElement(By.xpath(ProductServicesLocators.ADDITIONAL_SERVICE_CHECKBOX));
       // prodOptionCheckbox = new Checkbox(listItem, ProductServicesLocators.ADDITIONAL_SERVICE_CHECKBOX).click();
        locator.click();
        return this;
    }

    public String getPrice(WebElement listItem) {
        price = new TextField(listItem, ProductServicesLocators.ADDITIONAL_SERVICE_PRICE).getText();
        return price;
    }

    public ProductOptionsPO clickInfo(WebElement listItem) {
        info = new Button(listItem, ProductServicesLocators.ADDITIONAL_SERVICE_INFO).click();
        return this;
    }

    public List<WebElement> getOptions (DropDown dropDown) {
        dropdOptions = dropDown.getOptions(dropDown);
        return dropdOptions;
    }
}



