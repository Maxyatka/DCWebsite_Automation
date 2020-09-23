package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UPassPage extends PageFactory {
    public static final String PAGE_HEADER = "U-Pass BC on Compass Card";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]")
    public WebElement studentResourcesDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[6]/div/a")
    public WebElement uPassOption;

    public UPassPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return pageHeader.getText().contains(PAGE_HEADER)
                || pageHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || pageHeader.isDisplayed();
    }

    public boolean isDropdownOpened() {
        return studentResourcesDropdown.getAttribute("class").contains("open")
                || (uPassOption.isDisplayed()
                    && uPassOption.getAttribute("class").contains("is-active"));
    }
}