package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseElement {


    public Checkbox(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public Checkbox(WebElement elementToParse, String xpath) {
        super(elementToParse, xpath);
    }

    public Checkbox click(){
        this.element.click();
        return this;
    }
}
