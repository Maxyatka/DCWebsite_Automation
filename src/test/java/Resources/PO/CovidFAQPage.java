package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CovidFAQPage extends PageFactory {
    public static final String PAGE_HEADER = "COVID-19 Frequently Asked Questions";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement covidFAQHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[8]")
    public WebElement covidDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[8]/ul/li[2]/div/a")
    public WebElement covidDropdownPCU;

    public CovidFAQPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return getPageHeader().contains(PAGE_HEADER)
                || getPageHeader().equalsIgnoreCase(PAGE_HEADER)
                || covidFAQHeader.isDisplayed();
    }

    public String getPageHeader() {
        return covidFAQHeader.getText();
    }

    public boolean isDropdownOpened() {
        return covidDropdown.getAttribute("class").contains("open")
                || covidDropdownPCU.isDisplayed();
    }

    public void openPastUpdates() {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
//        executor.executeScript("arguments[0].scrollIntoView(true);", covidDropdownPCU);
        executor.executeScript("arguments[0].click();", covidDropdownPCU);
    }
}
