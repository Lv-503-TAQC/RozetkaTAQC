package pageelements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown extends BaseElement {

    private Select select;

    public DropDown(WebDriver driver, String xpath) {
        super(driver, xpath);
        select = new Select(element);
    }

    public DropDown(WebElement elementToParse, String xpath) {
        super(elementToParse, xpath);
        select = new Select(element);

    }

    public Select getSelect() {
        return select;
    }

    public List<WebElement> getOptions(DropDown dropdownToParse) {
        return this.select.getAllSelectedOptions();
    }
}
