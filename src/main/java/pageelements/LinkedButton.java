package pageelements;

import org.openqa.selenium.WebDriver;

public class LinkedButton extends Button {
    public LinkedButton(WebDriver driver, String xpath) {
        super(driver, xpath);
    }
    public Button click() {
        this.element.click();
        return this;
    }
}
