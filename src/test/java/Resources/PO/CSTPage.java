package Resources.PO;

import Resources.Utils.HelperMethods;
import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CSTPage extends PageFactory {
    public static final String PAGE_HEADER = "Select Term";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr[1]/td[1]/h2")
    public WebElement cstHeader;

    public CSTPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        HelperMethods.switchToCurrentTab(driver);
        return cstHeader.getText().contains(PAGE_HEADER)
                || cstHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || cstHeader.isDisplayed();
    }
}
