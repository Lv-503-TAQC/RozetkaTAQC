package pageobjects;

import org.openqa.selenium.WebDriver;
import pageelements.Button;
import pageelements.TextField;

import static locators.AllAboutProductLocators.IN_STOCK_STRING;


public class InStockBlockPO extends BasePageObject {
    private String inStockString;
    private Button notifyWhenInStock;


    public InStockBlockPO(WebDriver driver) {
        super(driver);
    }

    public String inStockString() {
        inStockString = new TextField(driver, IN_STOCK_STRING).getText();
        return inStockString;
    }

    public InStockBlockPO notifyWhenInStock() {
        notifyWhenInStock = new Button(driver, IN_STOCK_STRING).click();
        return this;
    }
    /**
     * Todo:
     *getAttribute - color
     *getAttribute - image
     **/
}
