package locators;

import org.openqa.selenium.By;

public enum SingleCommentLocators implements Locator {
    GO_BACK(By.xpath("//*[@class = 'single-comment__back-link button button_size_medium button_with_icon button_type_link']")),
    COMMENT(By.xpath("//*[@class = 'product-comment']"));

    @Override
    public By getPath() {
        return path;
    }

    private By path;
    SingleCommentLocators(By path) {
        this.path = path;
    }
}
