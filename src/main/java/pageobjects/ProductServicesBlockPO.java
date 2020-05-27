package pageobjects;

import locators.AllAboutProductLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductServicesBlockPO extends BasePageObject{

    private List<ProductServiceOptionsPO> serviceList;

    public ProductServicesBlockPO(WebDriver driver) {
        super(driver);
    }

    /**
     * @return list of all the available additional services to the product
     */
    public List<ProductServiceOptionsPO> createListOfCervices() {
        serviceList = new ArrayList<ProductServiceOptionsPO>();

        List<WebElement> listOfServices = driver.findElements(AllAboutProductLocators.ADDITIONAL_SERVICES_LIST.getPath());
        for (WebElement listItem : listOfServices) {
            serviceList.add(new ProductServiceOptionsPO(driver, listItem));
        }
        return serviceList;
    }
}
