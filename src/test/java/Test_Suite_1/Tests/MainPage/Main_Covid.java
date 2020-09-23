package Test_Suite_1.Tests.MainPage;

import Resources.PO.CovidFAQPage;
import Resources.PO.CovidPage;
import Resources.PO.MainPage;
import Resources.PO.PastCampusUpdatesPage;
import static Resources.Utils.HelperMethods.WebDriverSetUp.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class Main_Covid {

    WebDriver driver;
    MainPage mainPage;
    CovidPage covidPage;
    CovidFAQPage covidFAQPage;
    PastCampusUpdatesPage pastCampusUpdatesPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * Covid Link in the Nav Bar (CLNB)
     * <p>
     * 1. Open main page <p>
     * 2. Click ‘Covid 19 Information And Resources’ CTA <p>
     * 3. Page should be loaded with covid dropdown opened on the left <p>
     * <p>
     * 4. Click ‘Covid FAQ’ in the dropdown options <p>
     * 5. Page should be loaded with covid dropdown opened on the left <p>
     * <p>
     * 6. Click ‘Past Campus Updates’ in the dropdown options <p>
     * 7. Page should be loaded with covid dropdown opened on the left <p>
     */

    @Test
    public void Test_01_Main_CLNB() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        covidPage = new CovidPage(events);
//        covidFAQPage = new CovidFAQPage(events);
//        pastCampusUpdatesPage = new PastCampusUpdatesPage(events);

        mainPage = new MainPage(driver);
        covidPage = new CovidPage(driver);
        covidFAQPage = new CovidFAQPage(driver);
        pastCampusUpdatesPage = new PastCampusUpdatesPage(driver);

        mainPage.open();
        mainPage.openCovidPage();

        Assertions.assertTrue(covidPage.isPageLoaded());
        Assertions.assertTrue(covidPage.isDropdownOpened());

        covidPage.openFAQ();

        Assertions.assertTrue(covidFAQPage.isPageLoaded());
        Assertions.assertTrue(covidFAQPage.isDropdownOpened());

        covidFAQPage.openPastUpdates();

        Assertions.assertTrue(pastCampusUpdatesPage.isPageLoaded());
        Assertions.assertTrue(pastCampusUpdatesPage.isDropdownOpened());
    }
}