package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Dropdown_Student_Services {

    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;

    IDCardsPage idCardsPage;
    UPassPage uPassPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * Student Services - ID Cards (SSID)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Student Services’ dropdown list <p>
     * 3. Select ‘ID Cards’ <p>
     * 4. ‘ID Cards’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_23_DropdownMenu_SSID() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        idCardsPage = new IDCardsPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        idCardsPage = new IDCardsPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.studentServicesDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.idCards);

        Assertions.assertTrue(idCardsPage.isPageLoaded());
        Assertions.assertTrue(idCardsPage.isDropdownOpened());
    }

    /**
     * Student Services - U-Pass (SSUP)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Student Services’ dropdown list <p>
     * 3. Select ‘U-Pass’ <p>
     * 4. ‘U-Pass’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_24_DropdownMenu_SSUP() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        uPassPage = new UPassPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        uPassPage = new UPassPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.studentServicesDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.uPass);

        Assertions.assertTrue(uPassPage.isPageLoaded());
        Assertions.assertTrue(uPassPage.isDropdownOpened());
    }
}