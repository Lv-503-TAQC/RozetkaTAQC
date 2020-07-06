package locators;

import org.openqa.selenium.By;

public enum ComparisonLocators implements Locator {
    COMPARISON_CONTAINER(By.cssSelector("[name='comparison_container']")),





    ;



    ComparisonLocators(By path) {
        this.path = path;
    }
    private By path;
    @Override
    public By getPath() {
        return path;
    }
}
