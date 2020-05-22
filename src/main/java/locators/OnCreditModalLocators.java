package locators;

import org.openqa.selenium.By;

public enum OnCreditModalLocators implements Locator {
    CLOSE_THE_MODAL(By.cssSelector(".modal__close")),
    STANDARD_CREDIT_SELECT(By.xpath("//*[contains (text(), 'Стандарт')]//following::div[1]//select")),
    STANDARD_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'Стандарт')]//following::div[2]//button")),
    ALPHA_CREDIT_SELECT(By.xpath("//*[contains (text(), 'Альфа')]//following::div[1]//select")),
    ALPHA_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'Альфа')]//following::div[2]//button")),
    MONO_CREDIT_SELECT(By.xpath("//*[contains (text(), 'monobank')]//following::div[1]//select")),
    MONO_CREDIT_BUTTON(By.xpath("//*[contains (text(), 'monobank')]//following::div[2]//button")),
    THREE_MONTH_CONCES_SELECT(By.xpath("//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[1]//select")),
    THREE_MONTH_CONCES_BUTTON(By.xpath("//*[contains (text(), '0,01')][contains (text(), '3')]//following::div[2]//button")),
    TEN_MONTH_CONCES_SELECT(By.xpath("//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[1]//select")),
    TEN_MONTH_CONCES_BUTTON(By.xpath("//*[contains (text(), '0,01')][contains (text(), '10')]//following::div[2]//button")),
    PAY_IN_PARTS_SELECT(By.xpath("//*[contains (text(), 'Оплата')]//following::div[1]//select")),
    PAY_IN_PARTS_BUTTON(By.xpath("//*[contains (text(), 'Оплата')]//following::div[2]//button"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private OnCreditModalLocators(By path) {
        this.path = path;
    }

}
