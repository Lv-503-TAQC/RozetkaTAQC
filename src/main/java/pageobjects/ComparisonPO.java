package pageobjects;

import locators.HeaderLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.helpers.Hacks;
import pageobjects.helpers.Product;

import java.util.List;

public class ComparisonPO extends BasePageObject {
    public ComparisonPO(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
        if(this.isComparisonEmpty()) {
            System.out.println(Hacks.sms("ComparisonPO list is empty!", "x"));
        }
    }

    public String diffToString() {
        List<WebElement> rows = driver.findElements(By.cssSelector(".comparison-t-row[name='different']"));
        String result = "";
        for(WebElement row : rows) {

             String str = Hacks.sms(row.findElement(By.cssSelector(".comparison-t-cell-first")).getText(), ".");
             List<WebElement> pair = row.findElements(By.cssSelector(".chars-value-inner"));
             for(int i = 0; i < pair.size(); i++) {
                 str += "\n" + (i+1) + ". " + pair.get(i).getText() + "\n";
             }
            result += Hacks.sms(str, "~");
        }
        return result;
    }









}
