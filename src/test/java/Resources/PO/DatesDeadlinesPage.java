package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DatesDeadlinesPage extends PageFactory {

    private final WebDriver driver;
    public static final String PAGE_HEADER = "DATES AND DEADLINES";
    public static final String PAGE_HEADER_LOWER = "Dates and deadlines";

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement datesDeadlinesPageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-0\"]")
    public WebElement firstSemester;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-1\"]")
    public WebElement secondSemester;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-2\"]")
    public WebElement thirdSemester;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-3\"]")
    public WebElement fourthSemester;

    public DatesDeadlinesPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return getPageHeader().trim().contains(PAGE_HEADER)
                || getPageHeader().trim().contains(PAGE_HEADER_LOWER);
    }

    public String getPageHeader() {
        return datesDeadlinesPageHeader.getText();
    }

    public boolean semesterIsSelected(WebElement element) {
        return element.getAttribute("aria-selected").equals("true")
                || element.getAttribute("class").equals("is-selected");
    }

    public void selectSemester(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
        }
    }
}
