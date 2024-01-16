package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CuraHealthcare {

    public static final String MENU= ".btn.btn-dark.btn-lg.toggle";
    public static final String LOGIN = "Login";
    public static final String USER_NAME = "txt-username";
    public static final String PASSWORD = "txt-password";
    public static final String LOGIN_BUTTON = "btn-login";
    public static final String MAKE_APPOINTMENT = "btn-make-appointment";
    public static final String PLEASE_LOGIN_TEXT = ".lead";

    public static final String LOGIN_FAILED = ".lead.text-danger";
    public static final String HOME = "Home";



    @FindBy(css = MENU)
    public WebElement menu;
    @FindBy(linkText = LOGIN)
    public WebElement login;
    @FindBy(id = USER_NAME)
    public WebElement userName;
    @FindBy(id = PASSWORD)
    public WebElement password;
    @FindBy(id = LOGIN_BUTTON)
    public WebElement login_button;
    @FindBy(id = MAKE_APPOINTMENT)
    public WebElement make_appointment;
    @FindBy(css = PLEASE_LOGIN_TEXT)
    public WebElement login_text;
    @FindBy(css = LOGIN_FAILED)
    public WebElement login_failed;
    @FindBy(linkText = HOME)
    public WebElement home;

    public CuraHealthcare(WebDriver driver) {
        PageFactory.initElements(driver, this);



    }







}
