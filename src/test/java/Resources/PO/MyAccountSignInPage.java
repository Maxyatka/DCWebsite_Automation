package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Resources.Utils.HelperMethods.*;

public class MyAccountSignInPage extends PageFactory {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/form/p/input[1]")
    public WebElement myAccountLoginButton;

    public MyAccountSignInPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        switchToCurrentTab(this.driver);
        return myAccountLoginButton.isDisplayed();
    }
}