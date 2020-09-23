package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends PageFactory {

    private final WebDriver driver;
    public static final String PAGE_HEADER = "Search for ";
    private final String searchQuery;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]/h1")
    public WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"___gcse_0\"]/div//*/div[1]/div[1]/div[1]/div/a")
    public WebElement firstResultTitle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"___gcse_0\"]/div//*/div[1]/div[3]/div/div[3]")
    public WebElement firstResultBody;

    public SearchPage(WebDriver driver, String searchQuery) {
        this.driver = driver;
        this.searchQuery = searchQuery;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isResultFound(String searchParameter) {
//        return !notFoundResult.getText().equalsIgnoreCase("No Results");
        String firstResultTitleText = firstResultTitle.getText();
        String firstResultBodyText = firstResultBody.getText();
        return firstResultTitleText.contains(searchParameter)
                || firstResultBodyText.contains(searchParameter);
    }

    public boolean isPageLoaded() {
//        System.out.println(PAGE_HEADER + searchQuery);
//        System.out.println(getPageHeader());
        return (PAGE_HEADER + searchQuery).equalsIgnoreCase(getPageHeader());
    }

    public String getPageHeader() {
        return pageHeader.getText();
    }

    public void selectFirstResultOption() {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("arguments[0].click();", firstResultTitle);
//        firstResultTitle.click();
    }
}
