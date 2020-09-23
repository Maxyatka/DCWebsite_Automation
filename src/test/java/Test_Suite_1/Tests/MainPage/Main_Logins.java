package Test_Suite_1.Tests.MainPage;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Main_Logins {

    WebDriver driver;
    MainPage mainPage;
    MSSignInPage msSignInPage;
    MyAccountSignInPage myAccountSignInPage;
    BlackBoardSignInPage blackBoardSignInPage;
    MyCareerSignInPage myCareerSignInPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * MS Office 365 Login (O365)
     * <p>
     * 1. Open main page <p>
     * 2. Select ‘Office 365 & Email’ from Logins dropdown menu <p>
     * 3. Microsoft Sign In page should be loaded
     */

    @Test
    public void Test_04_Main_O365_login() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        msSignInPage = new MSSignInPage(events);

        mainPage = new MainPage(driver);
        msSignInPage = new MSSignInPage(driver);

        mainPage.open();
        mainPage.hoverOverLoginsDDM();
        mainPage.openMSOffice365Login();

        Assertions.assertTrue(msSignInPage.isPageLoaded());
    }

    /**
     * MyAccount Login (MACT)
     * <p>
     * 1. Open main page <p>
     * 2. Select ‘MyAccount’ from Logins dropdown menu <p>
     * 3. MyAccount User Login page should be loaded
     */

    @Test
    public void Test_05_Main_MACT_login() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        myAccountSignInPage = new MyAccountSignInPage(events);

        mainPage = new MainPage(driver);
        myAccountSignInPage = new MyAccountSignInPage(driver);

        mainPage.open();
        mainPage.hoverOverLoginsDDM();
        mainPage.openMyAccountLogin();

        Assertions.assertTrue(myAccountSignInPage.isPageLoaded());
    }

    /**
     * BlackBoard Login (BLBD)
     * <p>
     * 1. Open main page <p>
     * 2. Select ‘BlackBoard Community’ from Logins dropdown menu <p>
     * 3. BlackBoard Community page should be loaded
     */

    @Test
    public void Test_06_Main_BLBD_login() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        blackBoardSignInPage = new BlackBoardSignInPage(events);

        mainPage = new MainPage(driver);
        blackBoardSignInPage = new BlackBoardSignInPage(driver);

        mainPage.open();
        mainPage.hoverOverLoginsDDM();
        mainPage.openBlackBoardLogin();

        Assertions.assertTrue(blackBoardSignInPage.isPageLoaded());
    }

    /**
     * MyCareer Login (MCAR)
     * <p>
     * 1. Open main page <p>
     * 2. Select ‘MyCareer’ from Logins dropdown menu <p>
     * 3. CareerHUB page should be loaded
     */

    @Test
    public void Test_07_Main_MCAR_login() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        myCareerSignInPage = new MyCareerSignInPage(events);

        mainPage = new MainPage(driver);
        myCareerSignInPage = new MyCareerSignInPage(driver);

        mainPage.open();
        mainPage.hoverOverLoginsDDM();
        mainPage.openMyCareerLogin();

        Assertions.assertTrue(myCareerSignInPage.isPageLoaded());
    }
}