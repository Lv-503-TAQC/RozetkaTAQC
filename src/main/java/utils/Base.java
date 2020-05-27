package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static utils.Constants.*;

public class Base {
    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");

        try {
            Properties prop = new Properties();
            prop.load(fis);

            String browserName = prop.getProperty("browser");
            String osName = prop.getProperty("osName");

            ChromeOptions options = new ChromeOptions();
            if (browserName.contains("headless")) {
                options.addArguments("headless");
            }

            if (browserName.contains("chrome")) {
                switch (osName) {
                    case "windows":
                        System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);
                        break;
                    case "linux":
                        System.setProperty(KEY_TO_LINUX_CHROME_DRIVER, PATH_TO_LINUX_CHROME_DRIVER);
                        break;
                }

                driver = new ChromeDriver(options);

            } else if (browserName.contains("firefox")) {
                switch (osName) {
                    case "windows":
                        System.setProperty(KEY_TO_WINDOWS_FIREFOX_DRIVER, PATH_TO_WINDOWS_FIREFOX_DRIVER);
                        break;
                    case "linux":
                        //currently not available
                        break;
                }

                driver = new FirefoxDriver();
            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            return driver;
        } finally {
            fis.close();
        }
    }
}
