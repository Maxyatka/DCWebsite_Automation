package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProgramsPage extends PageFactory {
    public static final String PAGE_HEADER = "Programs";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-programscoursestabblock\"]/ul/li[1]/a")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[1]")
    public WebElement programsAndCoursesDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[1]/ul/li[1]/div/a")
    public WebElement programsDropdownOption;

    public ProgramsPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return (pageHeader.getText().contains(PAGE_HEADER)
                || pageHeader.getText().equalsIgnoreCase(PAGE_HEADER))
                && pageHeader.getAttribute("class").contains("active")
                || pageHeader.isDisplayed();
    }

    public boolean isDropdownOpened() {
        return programsAndCoursesDropdown.getAttribute("class").contains("open")
                || programsDropdownOption.isDisplayed();
    }
}