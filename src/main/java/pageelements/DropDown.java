package pageelements;


import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown extends BaseElement {

    private Select select;

    public DropDown(WebDriver driver, Locator locator) {
        super(driver, locator);
    }

    public DropDown(WebElement elementToParse, Locator locator) {
        super(elementToParse, locator);
    }

    public DropDown(WebElement element) {
        super(element);
    }


    public Select getSelect() {
        return select;
    }

    public List<WebElement> getOptions(DropDown dropdownToParse) {
        return this.select.getAllSelectedOptions();
    }
}
