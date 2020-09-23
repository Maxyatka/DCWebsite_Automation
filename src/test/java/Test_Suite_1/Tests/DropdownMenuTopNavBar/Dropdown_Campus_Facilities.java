package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.CampusFacilitiesPage;
import Resources.PO.DropdownMenuNavigationElement;
import Resources.PO.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Dropdown_Campus_Facilities {
    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;

    CampusFacilitiesPage campusFacilitiesPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * About Douglas - Campus Facilities (ADCF)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘About Douglas’ dropdown list <p>
     * 3. Select ‘Campus Facilities’ <p>
     * 4. ‘Campus Facilities’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_25_DropdownMenu_SSID() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        campusFacilitiesPage = new CampusFacilitiesPage(events);

        // Comment this out if want element highlighting
        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        campusFacilitiesPage = new CampusFacilitiesPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.aboutDouglasDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.campusFacilities);

        Assertions.assertTrue(campusFacilitiesPage.isPageLoaded());
        Assertions.assertTrue(campusFacilitiesPage.isDropdownOpened());
    }
}