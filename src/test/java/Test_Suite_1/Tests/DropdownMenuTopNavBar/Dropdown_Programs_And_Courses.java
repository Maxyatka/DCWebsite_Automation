package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Dropdown_Programs_And_Courses {

    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;

    ProgramsPage programsPage;
    CoursesPage coursesPage;
    FacultiesPage facultiesPage;


    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * Programs & Courses - Programs (PCPR)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Programs & Courses’ dropdown list <p>
     * 3. Select ‘Programs’ <p>
     * 4. ‘Programs’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_20_DropdownMenu_PCPR() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        programsPage = new ProgramsPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        programsPage = new ProgramsPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.programsAndCoursesDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.programs);

        Assertions.assertTrue(programsPage.isPageLoaded());
        Assertions.assertTrue(programsPage.isDropdownOpened());
    }

    /**
     * Programs & Courses - Courses (PCCO)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Programs & Courses’ dropdown list <p>
     * 3. Select ‘Courses’ <p>
     * 4. ‘Courses’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_21_DropdownMenu_PCCO() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        coursesPage = new CoursesPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        coursesPage = new CoursesPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.programsAndCoursesDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.courses);

        Assertions.assertTrue(coursesPage.isPageLoaded());
        Assertions.assertTrue(coursesPage.isDropdownOpened());
    }

    /**
     * Programs & Courses - Faculties (PCFA)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Programs & Courses’ dropdown list <p>
     * 3. Select ‘Faculties’ <p>
     * 4. ‘Faculties’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_22_DropdownMenu_PCFA() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        facultiesPage = new FacultiesPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        facultiesPage = new FacultiesPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.programsAndCoursesDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.faculties);

        Assertions.assertTrue(facultiesPage.isPageLoaded());
        Assertions.assertTrue(facultiesPage.isDropdownOpened());
    }
}