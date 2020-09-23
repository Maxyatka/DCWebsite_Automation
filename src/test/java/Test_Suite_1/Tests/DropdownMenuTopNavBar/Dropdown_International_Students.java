package Test_Suite_1.Tests.DropdownMenuTopNavBar;

import Resources.PO.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static Resources.Utils.HelperMethods.WebDriverSetUp.getDriver;


public class Dropdown_International_Students {
    WebDriver driver;
    MainPage mainPage;
    DropdownMenuNavigationElement dropdownMenu;

    IntStudProgramsPage intStudProgramsPage;
    ScholarshipsAwardsIntPage scholarshipsAwardsIntPage;
    PostGraduationWorkPermitPage postGraduationWorkPermitPage;


    @BeforeEach
    public void createDriver(TestInfo testInfo) {
        driver = getDriver(testInfo.getDisplayName());
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    /**
     * International Students - International Student Programs (ISPR)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘International Students’ dropdown list <p>
     * 3. Select ‘International Students Programs’ <p>
     * 4. ‘International Students Programs’ page should be loaded <p>
     * 5. ‘University Transfer’ Tab should be opened <p>
     * 6. Select ‘Degrees at Douglas’ tab <p>
     * 7. ‘Degrees at Douglas’ Tab should be opened <p>
     * 8. Select ‘Career Programs’ tab <p>
     * 9. ‘Career Programs’ Tab should be opened <p>
     * 10. Select ‘Post Degree Programs’ tab <p>
     * 11. ‘Post Degree Programs’ Tab should be opened
     */

    @Test
    public void Test_17_DropdownMenu_ISPR() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        intStudProgramsPage = new IntStudProgramsPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        intStudProgramsPage = new IntStudProgramsPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.internationalStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.internationalStudentPrograms);

        Assertions.assertTrue(intStudProgramsPage.isPageLoaded());
        Assertions.assertTrue(intStudProgramsPage
                .optionIsSelected(intStudProgramsPage.universityTransfer));

        intStudProgramsPage.selectOption(intStudProgramsPage.degreesAtDouglas);
        Assertions.assertTrue(intStudProgramsPage
                .optionIsSelected(intStudProgramsPage.degreesAtDouglas));

        intStudProgramsPage.selectOption(intStudProgramsPage.careerPrograms);
        Assertions.assertTrue(intStudProgramsPage
                .optionIsSelected(intStudProgramsPage.careerPrograms));

        intStudProgramsPage.selectOption(intStudProgramsPage.postDegreePrograms);
        Assertions.assertTrue(intStudProgramsPage
                .optionIsSelected(intStudProgramsPage.postDegreePrograms));
    }

    /**
     * International Students - Scholarships and Awards (ISSA)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘International Students’ dropdown list <p>
     * 3. Select ‘Scholarships and Awards’ <p>
     * 4. ‘Scholarships and Awards’ page should be loaded <p>
     */

    @Test
    public void Test_18_DropdownMenu_ISSA() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        scholarshipsAwardsIntPage = new ScholarshipsAwardsIntPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        scholarshipsAwardsIntPage = new ScholarshipsAwardsIntPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.internationalStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.scholarshipsAndAwards);

        Assertions.assertTrue(scholarshipsAwardsIntPage.isPageLoaded());
    }

    /**
     * International Students - Post-Graduation Work Permit (ISPG)
     * <p>
     * 1. Open main page <p>
     * 2. Hover over ‘International Students’ dropdown list <p>
     * 3. Select ‘Post-Graduation Work Permit’ <p>
     * 4. ‘Post-Graduation Work Permit’ page should be loaded <p>
     */

    @Test
    public void Test_19_DropdownMenu_ISPG() {
        // Uncomment this if want element highlighting
//        EventFiringWebDriver events = new EventFiringWebDriver(driver);
//        events.register(new HighLighterEventListener());
//
//        mainPage = new MainPage(events);
//        dropdownMenu = new DropdownMenuNavigationElement(events);
//        postGraduationWorkPermitPage = new PostGraduationWorkPermitPage(events);

        mainPage = new MainPage(driver);
        dropdownMenu = new DropdownMenuNavigationElement(driver);
        postGraduationWorkPermitPage = new PostGraduationWorkPermitPage(driver);

        mainPage.open();

        dropdownMenu.openDropdownMenu(dropdownMenu.internationalStudentsDropdown);
        dropdownMenu.openMenuItem(dropdownMenu.postGradWorkPermit);

        Assertions.assertTrue(postGraduationWorkPermitPage.isPageLoaded());
    }
}