package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

    private static final String ACCEPT_GDPR = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_BANNER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private static final String MY_ACCOUNT = "my_account";

    @FindBy(css = ACCEPT_GDPR)
    public WebElement acceptGdpr;

    @FindBy(css = GDPR_BANNER)
    public WebElement gdprBanner;

    @FindBy (id = MY_ACCOUNT)
    public WebElement myAccount;

    public EmagHomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }



}


