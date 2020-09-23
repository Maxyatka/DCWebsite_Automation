package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GraduationPage extends PageFactory {
    public static final String PAGE_HEADER = "Graduation";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement graduationHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[2]/ul/li[6]")
    public WebElement graduationDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[2]/ul/li[6]/ul/li[2]")
    public WebElement graduationDropdownFAQ;

    public GraduationPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return graduationHeader.getText().contains(PAGE_HEADER)
                || graduationHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || graduationHeader.isDisplayed();
    }

    public boolean isDropdownOpened() {
        return graduationDropdown.getAttribute("class").contains("open")
                || graduationDropdownFAQ.isDisplayed();
    }
}