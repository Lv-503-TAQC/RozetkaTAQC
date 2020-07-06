
import locators.HeaderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ActionsWithProductsBlockPO;
import pageobjects.CartModalWindowPO;
import pageobjects.ComparisonPO;
import pageobjects.ProductInCartPO;
import pageobjects.helpers.Hacks;
import utils.DriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static utils.Constants.*;

public class Main extends DriverManager {
    WebDriver driver = initializeDriver();
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        ComparisonPO po = new ComparisonPO(main.driver, "https://rozetka.com.ua/grafic-tablets/c83199/");
        for(WebElement button : main.driver.findElements(By.cssSelector(".compare-button"))) {
            try {
                if (button.isEnabled()) {
                    button.click();
                }
            } catch(Exception e) {
                System.out.println(Hacks.sms("Ooops...", "."));
            }
        }
        po.comparisonButtonHover();
        List<WebElement> compareElements = main.driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath());
        int howManyElements = compareElements.size();

        System.out.println(Hacks.sms("Comparing list has " + howManyElements + " elements", ":"));


        for(int i = 0; i < howManyElements; i++) {
            compareElements.get(i).findElement(HeaderLocators._HEADER_COMPARISON_LI_DELETE.getPath()).click();
        }

        new WebDriverWait(main.driver, 3).until(ExpectedConditions.numberOfElementsToBe(HeaderLocators.HEADER_COMPARISON_LI.getPath(), 0));
        System.out.println(Hacks.sms(String.valueOf(main.driver.findElements(HeaderLocators.HEADER_COMPARISON_LI.getPath()).size()), "z"));




        main.driver.quit();
    }
}