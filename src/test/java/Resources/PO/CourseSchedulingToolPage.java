package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CourseSchedulingToolPage extends PageFactory {
    public static final String PAGE_HEADER = "Course Scheduling Tool";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement courseSchedulingToolHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-content\"]/article/div/div/div/p[2]/a")
    public WebElement viewCST;

    public CourseSchedulingToolPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return courseSchedulingToolHeader.getText().contains(PAGE_HEADER)
                || courseSchedulingToolHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || courseSchedulingToolHeader.isDisplayed();
    }

    public void openCST() {
        if (viewCST.isDisplayed())
            viewCST.click();
    }
}