package Test_Suite_1.Tests.MainPage;

import Resources.PO.DatesDeadlinesPage;
import Resources.PO.ExamSchedulePage;
import Resources.PO.MainPage;
import Resources.PO.SearchPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Main_Search {

    public static final String SEARCH_PARAMETER_ONE = "Exam Schedule";
    public static final String SEARCH_PARAMETER_TWO = "Dates and deadlines";

    WebDriver driver;
    MainPage mainPage;
    SearchPage searchPage;
    ExamSchedulePage examSchedulePage;
    DatesDeadlinesPage datesDeadlinesPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * Search (Main section)
     * <p>
     * 1. Open main page <p>
     * 2. Enter ‘Exam Schedule’ search text into search box on main page <p>
     * 3. Page should be loaded with appropriate search results
     * <p>
     * 4. Click the first search result option <p>
     * 5. Exam Schedule page should be loaded <p>
     */

    @Test
    public void Test_02_Main_SRCH_main() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        searchPage = new SearchPage(events, SEARCH_PARAMETER);
//        examSchedulePage = new ExamSchedulePage(events);

        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver, SEARCH_PARAMETER_ONE);
        examSchedulePage = new ExamSchedulePage(driver);

        mainPage.open();
        mainPage.searchMain(SEARCH_PARAMETER_ONE);

        Assertions.assertTrue(searchPage.isPageLoaded()
                && searchPage.isResultFound(SEARCH_PARAMETER_ONE));

        searchPage.selectFirstResultOption();

        Assertions.assertTrue(examSchedulePage.isPageLoaded());
    }

    /**
     * Search (Navigation bar)
     * <p>
     * 1. Open main page <p>
     * 2. Enter ‘Dates and Deadlines’ search text into search box in the top navigation bar <p>
     * 3. Page should be loaded with appropriate search results
     * <p>
     * 4. Click the first search result option <p>
     * 5. Dates and Deadlines page should be loaded <p>
     */

    @Test
    public void Test_03_Main_SRCH_nav() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        searchPage = new SearchPage(events, SEARCH_PARAMETER_TWO);
//        datesDeadlinesPage = new DatesDeadlinesPage(events);

        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver, SEARCH_PARAMETER_TWO);
        datesDeadlinesPage = new DatesDeadlinesPage(driver);

        mainPage.open();
        mainPage.searchNav(SEARCH_PARAMETER_TWO);

        Assertions.assertTrue(searchPage.isPageLoaded()
                && searchPage.isResultFound(SEARCH_PARAMETER_TWO));

        searchPage.selectFirstResultOption();

        Assertions.assertTrue(datesDeadlinesPage.isPageLoaded());
    }
}