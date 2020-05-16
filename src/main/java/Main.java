import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static utils.Constants.KEY_TO_WINDOWS_CHROME_DRIVER;
import static utils.Constants.PATH_TO_WINDOWS_CHROME_DRIVER;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ps4.in.ua");

        Thread.sleep(2000);

        driver.quit();
    }
}
