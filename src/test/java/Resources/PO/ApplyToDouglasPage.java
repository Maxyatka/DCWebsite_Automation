package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApplyToDouglasPage extends PageFactory {
    public static final String PAGE_HEADER = "Apply to Douglas";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement applyToDouglasHeader;

    public ApplyToDouglasPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return applyToDouglasHeader.getText().contains(PAGE_HEADER)
                || applyToDouglasHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || applyToDouglasHeader.isDisplayed();
    }
}