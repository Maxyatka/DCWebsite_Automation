package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IDCardsPage extends PageFactory {
    public static final String PAGE_HEADER = "ID cards";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]")
    public WebElement studentResourcesDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[5]/div/a")
    public WebElement idCardsOption;

    public IDCardsPage(WebDriver driver) {
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
                || (idCardsOption.isDisplayed()
                    && idCardsOption.getAttribute("class").contains("is-active"));
    }
}