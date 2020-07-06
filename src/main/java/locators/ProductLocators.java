package locators;

import org.openqa.selenium.By;

public enum ProductLocators implements Locator {
    //кнопка для додання товару до порівнянь
    BUTTON_COMPARE(By.cssSelector(".compare-button")),
    //та сама кнопка, але активна(товар вже додано до порівнянь). При кліку переключить до порівнянь
    BUTTON_COMPARE_ACTIVE(By.cssSelector(".compare-button_state_active"));


    ProductLocators(By path) {
        this.path = path;
    }
    private By path;
    @Override
    public By getPath() {
        return path;
    }
}
