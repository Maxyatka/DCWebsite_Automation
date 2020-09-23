package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DropdownMenuNavigationElement extends PageFactory {

    private final WebDriver driver;
    private final Actions action;

    // Future Students Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[1]")
    public WebElement futureStudentsDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[1]/div/div/div[3]/nav/ul/li[2]/ul/li[1]/a")
    public WebElement englishRequirements;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[1]/div/div/div[3]/nav/ul/li[2]/ul/li[8]/a")
    public WebElement transcripts;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[1]/div/div/div[3]/nav/ul/li[2]/ul/li[7]/a")
    public WebElement transferCredit;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[1]/div/div/div[3]/nav/ul/li[3]/a")
    public WebElement applyToDouglasSubHeader;

    // Current Students Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[2]")
    public WebElement currentStudentsDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[2]/div/div/div[3]/nav/ul/li[2]/ul/li[1]/a")
    public WebElement courseSchedulingTool;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[2]/div/div/div[3]/nav/ul/li[2]/ul/li[6]/a")
    public WebElement graduation;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[2]/div/div/div[3]/nav/ul/li[3]/a")
    public WebElement registerSubHeader;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[2]/div/div/div[3]/nav/ul/li[4]/ul/li[1]/a")
    public WebElement examSchedule;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[2]/div/div/div[3]/nav/ul/li[4]/ul/li[2]/a")
    public WebElement datesAndDeadlines;

    // International Students Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[3]")
    public WebElement internationalStudentsDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[3]/div/div/div[3]/nav/ul/li[1]/ul/li[1]/a")
    public WebElement internationalStudentPrograms;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[3]/div/div/div[3]/nav/ul/li[1]/ul/li[4]/a")
    public WebElement scholarshipsAndAwards;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[3]/div/div/div[3]/nav/ul/li[3]/ul/li[6]/a")
    public WebElement postGradWorkPermit;

    // Programs and Courses Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[4]")
    public WebElement programsAndCoursesDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[4]/div/div/div[3]/nav/ul/li[1]/ul/li[1]/a")
    public WebElement programs;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[4]/div/div/div[3]/nav/ul/li[1]/ul/li[2]/a")
    public WebElement courses;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[4]/div/div/div[3]/nav/ul/li[1]/ul/li[3]/a")
    public WebElement faculties;

    // Student Services Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[5]")
    public WebElement studentServicesDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[5]/div/div/div[3]/nav/ul/li[3]/ul/li[5]/a")
    public WebElement idCards;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[5]/div/div/div[3]/nav/ul/li[3]/ul/li[6]/a")
    public WebElement uPass;

    // About Douglas Menu
    @FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/ul/li[6]")
    public WebElement aboutDouglasDropdown;

    @FindBy(how = How.XPATH, using = "*//header/div[2]/div/ul/li[6]/div/div/div[3]/nav/ul/li[3]/ul/li[1]/a")
    public WebElement campusFacilities;


    public DropdownMenuNavigationElement(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public void openDropdownMenu(WebElement dropdownElement) {
        action.moveToElement(dropdownElement).build().perform();
    }

    public void openMenuItem(WebElement menuItem) {
        if (menuItem.isDisplayed())
            menuItem.click();
    }
}