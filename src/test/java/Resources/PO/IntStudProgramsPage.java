package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IntStudProgramsPage extends PageFactory {

    private final WebDriver driver;
    public static final String PAGE_HEADER = "INTERNATIONAL STUDENT PROGRAMS";
    public static final String PAGE_HEADER_LOWER = "International Student Programs";

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-0\"]")
    public WebElement universityTransfer;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-1\"]")
    public WebElement degreesAtDouglas;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-2\"]")
    public WebElement careerPrograms;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-3\"]")
    public WebElement postDegreePrograms;

    public IntStudProgramsPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return getPageHeader().trim().contains(PAGE_HEADER)
                || getPageHeader().trim().contains(PAGE_HEADER_LOWER)
                || pageHeader.isDisplayed();
    }

    public String getPageHeader() {
        return pageHeader.getText();
    }

    public boolean optionIsSelected(WebElement element) {
        return element.getAttribute("aria-selected").equals("true")
                || element.getAttribute("class").equals("is-selected");
    }

    public void selectOption(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
        }
    }
}
