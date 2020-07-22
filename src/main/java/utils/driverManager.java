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

public class driverManager {
    public static WebDriver driver;
    public Properties prop;

    public  WebDriver initializeDriver() throws IOException {
        prop= new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
        prop.load(fis);

        String browserName=prop.getProperty("browser");
        String osName=prop.getProperty("osName");

        if(browserName.contains("chrome"))
        {

            if(osName.contains("windows")){
                System.setProperty(KEY_TO_WINDOWS_CHROME_DRIVER, PATH_TO_WINDOWS_CHROME_DRIVER);

            }else if(osName.contains("linux")){
                System.setProperty(KEY_TO_LINUX_CHROME_DRIVER, PATH_TO_LINUX_CHROME_DRIVER);
            }

            ChromeOptions options = new ChromeOptions();

            if(browserName.contains("headless")) {
                options.addArguments("headless");
            }

            driver= new ChromeDriver(options);


        }
        else if (browserName.contains("firefox"))
        {
            if(osName.contains("windows")){
                System.setProperty(KEY_TO_WINDOWS_FIREFOX_DRIVER, PATH_TO_WINDOWS_FIREFOX_DRIVER);

            }else if(osName.contains("linux")){
                //currently not available
            }

            driver= new FirefoxDriver();
        }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;

    }


}
