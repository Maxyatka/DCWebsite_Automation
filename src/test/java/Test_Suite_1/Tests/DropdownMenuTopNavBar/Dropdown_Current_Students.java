package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;

public class Dropdown_Current_Students {
    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;

    CourseSchedulingToolPage courseSchedulingToolPage;
    CSTPage cstPage;
    GraduationPage graduationPage;
    RegisterPage registerPage;
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
     * Current Students - Course Scheduling Tool (CSCS)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Current Students’ dropdown list <p>
     * 3. Select ‘Course Scheduling Tool’ <p>
     * 4. ‘Course Scheduling Tool’ page should be loaded <p>
     * 5. Click to view CST <p>
     * 6. Course Scheduling Tool should be loaded (new tab)
     */

    @Test
    public void Test_12_DropdownMenu_CSCS() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        courseSchedulingToolPage = new CourseSchedulingToolPage(events);
//        cstPage = new CSTPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        courseSchedulingToolPage = new CourseSchedulingToolPage(driver);
        cstPage = new CSTPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.currentStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.courseSchedulingTool);

        Assertions.assertTrue(courseSchedulingToolPage.isPageLoaded());
        courseSchedulingToolPage.openCST();

        Assertions.assertTrue(cstPage.isPageLoaded());
    }

    /**
     * Current Students - Graduation (CSGR)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Current Students’ dropdown list <p>
     * 3. Select ‘Graduation’ <p>
     * 4. ‘Graduation’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_13_DropdownMenu_CSGR() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        graduationPage = new GraduationPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        graduationPage = new GraduationPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.currentStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.graduation);

        Assertions.assertTrue(graduationPage.isPageLoaded());
        Assertions.assertTrue(graduationPage.isDropdownOpened());
    }

    /**
     * Current Students - Register For Programs/Courses (CSRG)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Current Students’ dropdown list <p>
     * 3. Select ‘Register For Programs/Courses’ sub-header <p>
     * 4. ‘Register’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_14_DropdownMenu_CSRG() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        registerPage = new RegisterPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        registerPage = new RegisterPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.currentStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.registerSubHeader);

        Assertions.assertTrue(registerPage.isPageLoaded());
        Assertions.assertTrue(registerPage.isDropdownOpened());
    }

    /**
     * Current Students - Exam Schedule (CSES)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Current Students’ dropdown list <p>
     * 3. Select ‘Exam Schedule’ <p>
     * 4. ‘Exam Schedule’ page should be loaded with appropriate dropdown menu opened
     */

    @Test
    public void Test_15_DropdownMenu_CSES() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        examSchedulePage = new ExamSchedulePage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        examSchedulePage = new ExamSchedulePage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.currentStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.examSchedule);

        Assertions.assertTrue(examSchedulePage.isPageLoaded());
        Assertions.assertTrue(examSchedulePage.isDropdownOpened());
    }

    /**
     * Current Students - Dates and Deadlines (CSDD)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘Current Students’ dropdown list <p>
     * 3. Select ‘Dates and Deadlines’ <p>
     * 4. ‘Dates and Deadlines’ page should be loaded <p>
     * 5. First semester in the list should be loaded <p>
     * 6. Select second semester option <p>
     * 7. Second semester in the list should be loaded <p>
     * 8. Select third semester option <p>
     * 9. Third semester in the list should be loaded <p>
     * 10. Select fourth semester option <p>
     * 11. Fourth semester in the list should be loaded
     */

    @Test
    public void Test_16_DropdownMenu_CSDD() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        datesDeadlinesPage = new DatesDeadlinesPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        datesDeadlinesPage = new DatesDeadlinesPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.currentStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.datesAndDeadlines);

        Assertions.assertTrue(datesDeadlinesPage.isPageLoaded());
        Assertions.assertTrue(datesDeadlinesPage
                .semesterIsSelected(datesDeadlinesPage.firstSemester));

        datesDeadlinesPage.selectSemester(datesDeadlinesPage.secondSemester);
        Assertions.assertTrue(datesDeadlinesPage
                .semesterIsSelected(datesDeadlinesPage.secondSemester));

        datesDeadlinesPage.selectSemester(datesDeadlinesPage.thirdSemester);
        Assertions.assertTrue(datesDeadlinesPage
                .semesterIsSelected(datesDeadlinesPage.thirdSemester));

        datesDeadlinesPage.selectSemester(datesDeadlinesPage.fourthSemester);
        Assertions.assertTrue(datesDeadlinesPage
                .semesterIsSelected(datesDeadlinesPage.fourthSemester));
    }
}