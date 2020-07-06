package pageobjects;

import org.openqa.selenium.WebDriver;
import pageobjects.helpers.Header;


public abstract class BasePageObject implements Header {

    protected WebDriver driver;
    protected String url;


    public BasePageObject(WebDriver driver) {

        this.driver = driver;
    }

    public BasePageObject goToUrl(String url) {
        driver.get(url);
        this.url = url;
        return this;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }


    /**
     *
     * abstract class Father{
     *     public Father returnChild() {
     *         return this;
     *     }
     * }
     *
     *
     * class Child extends Father {
     *     (Child) returnChild();
     * }
     *
     */
}
