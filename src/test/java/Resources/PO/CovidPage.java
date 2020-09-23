package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CovidPage extends PageFactory {
    public static final String PAGE_HEADER = "COVID-19 resources & information";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement covid19Header;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[8]")
    public WebElement covidDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[3]/ul/li[8]/ul/li[1]/div/a")
    public WebElement covidDropdownFAQ;

    public CovidPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return covid19Header.getText().contains(PAGE_HEADER)
                || covid19Header.getText().equalsIgnoreCase(PAGE_HEADER)
                || covid19Header.isDisplayed();
    }

    public boolean isDropdownOpened() {
        return covidDropdown.getAttribute("class").contains("open")
                || covidDropdownFAQ.isDisplayed();
    }

    public void openFAQ() {
        covidDropdownFAQ.click();
    }
}
