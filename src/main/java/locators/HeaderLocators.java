package locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements Locator{
    HOME_PAGE(By.cssSelector(".header__logo")),
    KATALOG(By.cssSelector(".header-bottomline .menu-toggler")),
    SEARCH(By.cssSelector(".header-bottomline .header-search")),
    COMPARISON(By.cssSelector(".header-actions__item_type_comparison")),
    WISH(By.cssSelector(".header-actions__item_type_wish")),
    CART(By.cssSelector(".header-actions__item_type_cart")),
    //коли відсутні елементи для порівнянь, з'являється при наведенні на кнопку
    HEADER_COMPARISON_DUMMY(By.cssSelector(".header-actions__item_type_comparison .header-actions__dummy-title")),
    //елемент(и) списку, який з'являється при наведенні на COMPARISON
    HEADER_COMPARISON_LI(By.cssSelector(".header-comparison__list li")),
    //відносно окремого HEADER_COMPARISON_LI
    _HEADER_COMPARISON_LI_DELETE(By.cssSelector("svg"));


    HeaderLocators(By path) {
        this.path = path;
    }
    private By path;
    @Override
    public By getPath() {
        return path;
    }
}
