package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Resources.Utils.HelperMethods.*;

public class MSSignInPage extends PageFactory {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"idSIButton9\"]")
    public WebElement msLoginNextButton;

    public MSSignInPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        switchToCurrentTab(this.driver);
        return msLoginNextButton.isDisplayed();
    }
}