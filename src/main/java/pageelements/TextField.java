package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextField extends BaseElement {

    public TextField(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public TextField(WebElement elementToParse, String xpath) {
        super(elementToParse, xpath);

    }

    public String getText(){
        return this.element.getText();
    }

}
