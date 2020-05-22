package locators;

import org.openqa.selenium.By;

public enum ProductServicesLocators implements Locator {
    //Locators to find the desirable element of the desirable additional service
    ADDITIONAL_SERVICE_CHECKBOX(By.xpath("//*[@class = 'additional-service__checkbox']")),
    ADDITIONAL_SERVICE_INFO(By.xpath("//button")),
    ADDITIONAL_SERVICE_DROPDOWN(By.xpath("//select")),
    ADDITIONAL_SERVICE_PRICE(By.xpath("//*[@class = 'additional-service__price']"));


    @Override
    public By getPath() {
        return path;
    }

    private By path;
    private ProductServicesLocators(By path) {
        this.path = path;
    }


}
