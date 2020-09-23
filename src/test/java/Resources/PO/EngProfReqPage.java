package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EngProfReqPage extends PageFactory {
    public static final String PAGE_HEADER = "English Proficiency Requirement";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement engProfReqHeader;

    public EngProfReqPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return engProfReqHeader.getText().contains(PAGE_HEADER)
                || engProfReqHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || engProfReqHeader.isDisplayed();
    }
}