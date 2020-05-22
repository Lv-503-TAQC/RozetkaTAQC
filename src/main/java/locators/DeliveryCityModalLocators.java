package locators;

import org.openqa.selenium.By;

public enum DeliveryCityModalLocators implements Locator {
    CLOSE_MODAL_BTN(By.xpath("//*[@class='modal__close']")),
    APPLY_BTN(By.xpath("//*[@class='header-location__footer']//button")),
    AUTOCOMPLETE_INPUT_FIELD(By.xpath("//modal//input")),
    LIST_OF_POPULAR_CITIES_BTNS(By.xpath("//*[@class='header-location__popular']//li")),
    GO_TO_MAIN_PAGE_LINK(By.xpath("//*[@class='header-location__footer']//a"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private DeliveryCityModalLocators(By path) {
        this.path = path;
    }

}
