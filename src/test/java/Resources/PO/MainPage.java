package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends PageFactory {
    public static final String URL = "https://www.douglascollege.ca/";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-views-block-events-block-5\"]//*/div[2]/h3/a")
    protected WebElement covid19Header;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]//*[@id=\"edit-keys\"]")
    protected WebElement mainSearchField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]//*[@id=\"edit-submit\"]")
    protected WebElement mainSearchFieldButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[3]")
    protected WebElement navSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-keys\"]")
    protected WebElement navSearchField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-submit\"]")
    protected WebElement navSearchFieldButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[1]/ul/li[1]")
    protected WebElement loginsDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[1]/ul/li[1]/ul/li[1]/a")
    protected WebElement office365Login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[1]/ul/li[1]/ul/li[2]/a")
    protected WebElement myAccountLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[1]/ul/li[1]/ul/li[4]/a")
    protected WebElement blackBoardLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"utility-menu\"]/div[1]/div[2]/div[1]/ul/li[1]/ul/li[6]/a")
    protected WebElement myCareerLogin;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public void open() {
        driver.get(URL);
    }

    public void openCovidPage() {
        covid19Header.click();
    }

    public void searchMain(String searchQuery) {
        mainSearchField.sendKeys(searchQuery);
        mainSearchFieldButton.click();
    }

    public void searchNav(String searchQuery) {
        navSearchButton.click();
        navSearchField.sendKeys(searchQuery);
        navSearchFieldButton.click();
    }

    public void hoverOverLoginsDDM() {
        Actions actions = new Actions(this.driver);
        actions.moveToElement(loginsDropdown).build().perform();
    }

    public void openMSOffice365Login() {
        if (office365Login.isDisplayed())
            office365Login.click();
    }

    public void openMyAccountLogin() {
        if (myAccountLogin.isDisplayed())
            myAccountLogin.click();
    }

    public void openBlackBoardLogin() {
        if (blackBoardLogin.isDisplayed())
            blackBoardLogin.click();
    }

    public void openMyCareerLogin() {
        if (myCareerLogin.isDisplayed())
            myCareerLogin.click();
    }
}
