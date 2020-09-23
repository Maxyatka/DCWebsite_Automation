package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class TranscriptsPage extends PageFactory {
    public static final String PAGE_HEADER = "Transcripts";
    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-douglas-page-title\"]")
    public WebElement transcriptsHeader;

    public TranscriptsPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        return transcriptsHeader.getText().contains(PAGE_HEADER)
                || transcriptsHeader.getText().equalsIgnoreCase(PAGE_HEADER)
                || transcriptsHeader.isDisplayed();
    }
}