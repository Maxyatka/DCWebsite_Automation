package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PastCampusUpdatesPage extends PageFactory {
    public static final String PAGE_HEADER_LOWER = "Past campus updates";
    public static final String PAGE_HEADER = "PAST CAMPUS UPDATES";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[1]/main/div[2]/div/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[1]/aside/div/nav/ul/li[3]/ul/li[8]")
    public WebElement covidDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[8]/ul/li[2]/div")
    public WebElement covidDropdownPCU;

    public PastCampusUpdatesPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return pageHeader.getText().contains(PAGE_HEADER)
                || pageHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || pageHeader.isDisplayed();
    }

    public String getPageHeader() {
        return pageHeader.getText();
    }

    public boolean isDropdownOpened() {
        return covidDropdown.getAttribute("class").contains("open")
                || covidDropdownPCU.isDisplayed();
    }
}