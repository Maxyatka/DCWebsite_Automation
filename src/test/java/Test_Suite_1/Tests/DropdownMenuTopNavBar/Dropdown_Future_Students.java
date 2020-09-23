package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;


public class Dropdown_Future_Students {
    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;
    EngProfReqPage engProfReqPage;
    TransferCreditPage transferCreditPage;
    TranscriptsPage transcriptsPage;
    ApplyToDouglasPage applyToDouglasPage;

    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * Future Students - English Requirements (FSER)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Future Students’ dropdown list <p>
     * 3. Select ‘English Proficiency Requirement’ <p>
     * 4. ‘English Proficiency Requirement’ page should be loaded
     */

    @Test
    public void Test_08_DropdownMenu_FSER() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        engProfReqPage = new EngProfReqPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        engProfReqPage = new EngProfReqPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.futureStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.englishRequirements);

        Assertions.assertTrue(engProfReqPage.isPageLoaded());
    }

    /**
     * Future Students - Transfer Credit (FSTC)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Future Students’ dropdown list <p>
     * 3. Select ‘Transfer Credit’ <p>
     * 4. ‘Transfer Credit’ page should be loaded
     */

    @Test
    public void Test_09_DropdownMenu_FSTC() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        transferCreditPage = new TransferCreditPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        transferCreditPage = new TransferCreditPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.futureStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.transferCredit);

        Assertions.assertTrue(transferCreditPage.isPageLoaded());
    }

    /**
     * Future Students - Transcripts (FSTR)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Future Students’ dropdown list <p>
     * 3. Select ‘Transcripts’ <p>
     * 4. ‘Transcripts’ page should be loaded
     */

    @Test
    public void Test_10_DropdownMenu_FSTR() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        transcriptsPage = new TranscriptsPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        transcriptsPage = new TranscriptsPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.futureStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.transcripts);

        Assertions.assertTrue(transcriptsPage.isPageLoaded());
    }

    /**
     * Future Students - Apply To Douglas (FSAD)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Future Students’ dropdown list <p>
     * 3. Select ‘Apply To Douglas’ sub-header <p>
     * 4. ‘Apply To Douglas’ page should be loaded
     */

    @Test
    public void Test_11_DropdownMenu_FSAD() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        applyToDouglasPage = new ApplyToDouglasPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        applyToDouglasPage = new ApplyToDouglasPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.futureStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.applyToDouglasSubHeader);

        Assertions.assertTrue(applyToDouglasPage.isPageLoaded());
    }
}