package Resources.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class HelperMethods {
    public static final String SAUCE_USERNAME = "YOUR_SAUCE_USERNAME_HERE";
    public static final String SAUCE_KEY = "YOUR_SAUCE_KEY_HERE";
    public static final String SAUCE_URL = "YOUR_SAUCE_URL_HERE";

    public static final String WINDOWS_10 = "Windows 10";
    public static final String MAC_OS_10_15 = "macOS 10.15";

    public static final String CHROME = "Chrome";
    public static final String MICROSOFT_EDGE = "MicrosoftEdge";
    public static final String FIREFOX = "firefox";
    public static final String SAFARI = "safari";

    /**
     * Utility method that helps to switch to a current browser tab
     *
     * @param driver instance of currently used web-driver
     */
    public static void switchToCurrentTab(WebDriver driver) {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }

    /*
     * Methods to set up remote drivers on SauceLabs
     */
    public static WebDriver getSauceWindows10ChromeLatest(String testName) {
        return setUpSauceLabs(testName, WINDOWS_10, CHROME);
    }

    public static WebDriver getSauceWindows10EdgeLatest(String testName) {
        return setUpSauceLabs(testName, WINDOWS_10, MICROSOFT_EDGE);
    }

    public static WebDriver getSauceWindows10FirefoxLatest(String testName) {
        return setUpSauceLabs(testName, WINDOWS_10, FIREFOX);
    }

    public static WebDriver getSauceMacOS10_15ChromeLatest(String testName) {
        return setUpSauceLabs(testName, MAC_OS_10_15, CHROME);
    }

    public static WebDriver getSauceMacOS10_15SafariLatest(String testName) {
        return setUpSauceLabs(testName, MAC_OS_10_15, SAFARI);
    }

    public static WebDriver getSauceMacOS10_15FirefoxLatest(String testName) {
        return setUpSauceLabs(testName, MAC_OS_10_15, FIREFOX);
    }

    /*
     * Utility method to set up desired saucelabs capabilities
     */
    public static WebDriver setUpSauceLabs(String testName, String osName, String browserName) {
        testName = testName.replace("()", "");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", SAUCE_USERNAME);
        capabilities.setCapability("accessKey", SAUCE_KEY);
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("platform", osName);
        capabilities.setCapability("version", "latest");
        capabilities.setCapability("name", testName);

        try {
            return new RemoteWebDriver(new URL(SAUCE_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }


    /*
     * Methods to set up local drivers
     */
    public static WebDriver getLocalChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver getLocalFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public static WebDriver getLocalSafariDriver() {
        return new SafariDriver();
    }

    public static WebDriver getLocalEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    public static WebDriver getLocalIEDriver() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }


    /* CALL A DESIRED DRIVER HERE */
    public static class WebDriverSetUp {
        public static WebDriver getDriver(String testName) {

            /* * DRIVER SELECTION HERE: LOCAL OR SAUCELABS * */
//            WebDriver driver = getSauceWindows10FirefoxLatest(testName);
            WebDriver driver = getLocalChromeDriver();
            /* * * * * * * * * * * * * * * * * * * * * * * * */

            driver.manage().window().maximize();
            return driver;
        }
    }
}