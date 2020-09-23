package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacultiesPage extends PageFactory {
    public static final String PAGE_HEADER = "Faculties";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[1]")
    public WebElement programsAndCoursesDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-mainnavigation\"]/ul/li[1]/ul/li[3]/div/a")
    public WebElement facultiesDropdownOption;

    public FacultiesPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return pageHeader.getText().contains(PAGE_HEADER)
                || pageHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || pageHeader.isDisplayed();
    }

    public boolean isDropdownOpened() {
        return programsAndCoursesDropdown.getAttribute("class").contains("open")
                || (facultiesDropdownOption.isDisplayed()
                    && facultiesDropdownOption.getAttribute("class").contains("is-active"));
    }
}
