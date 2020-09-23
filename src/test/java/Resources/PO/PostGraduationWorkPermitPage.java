package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PostGraduationWorkPermitPage extends PageFactory {

    private final WebDriver driver;
    public static final String PAGE_HEADER = "POST-GRADUATION WORK PERMIT";
    public static final String PAGE_HEADER_LOWER = "Post-Graduation Work Permit";

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    public PostGraduationWorkPermitPage(WebDriver driver) {
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
}
