package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExamSchedulePage extends PageFactory {

    private final WebDriver driver;
    public static final String PAGE_HEADER = "EXAM SCHEDULE";
    public static final String PAGE_HEADER_LOWER = "Exam Schedule";

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement examSchedulePageHeader;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[4]/ul/li[1]")
    public WebElement examScheduleDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[4]/ul/li[1]/ul/li")
    public WebElement examScheduleDropdownProcedures;

    public ExamSchedulePage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return getExamSchedulePageHeader().trim().contains(PAGE_HEADER)
                || getExamSchedulePageHeader().trim().contains(PAGE_HEADER_LOWER)
                || examSchedulePageHeader.isDisplayed();
    }

    public String getExamSchedulePageHeader() {
        return examSchedulePageHeader.getText();
    }

    public boolean isDropdownOpened() {
        return examScheduleDropdown.getAttribute("class").contains("open")
                || examScheduleDropdownProcedures.isDisplayed();
    }
}