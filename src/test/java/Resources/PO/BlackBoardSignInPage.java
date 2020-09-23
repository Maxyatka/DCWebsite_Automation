package Resources.PO;

import Resources.Utils.VisibleAjaxElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Resources.Utils.HelperMethods.*;

public class BlackBoardSignInPage extends PageFactory {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"agree_button\"]")
    public WebElement cookiesOkButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"$fixedId\"]/div/form/p/input")
    public WebElement blackBoardLoginButton;

    public BlackBoardSignInPage(WebDriver driver) {
        this.driver = driver;
        initElements(new VisibleAjaxElementFactory(driver, 30), this);
    }

    public boolean isPageLoaded() {
        switchToCurrentTab(this.driver);
        cookiesOkButton.click();
        return blackBoardLoginButton.isDisplayed();
    }
}