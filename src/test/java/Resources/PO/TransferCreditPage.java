package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class TransferCreditPage extends PageFactory {
    public static final String PAGE_HEADER = "Transfer Credit";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement transferCreditHeader;

    public TransferCreditPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return transferCreditHeader.getText().contains(PAGE_HEADER)
                || transferCreditHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || transferCreditHeader.isDisplayed();
    }
}