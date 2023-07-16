package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ajax {

    private static final String WEB = "(//option[@value='1'])[1]";
    private static final String DESKTOP = "(//option[@value='2'])[1]";
    private static final String SERVER = "(//option[@value='3'])[1]";

    private static final String JAVASCRIPT = "(//option[@value='1'])[2]";
    private static final String VBSCRIPT = "(//option[@value='1'])[2]";
    private static final String FLASH = "(//option[@value='2'])[2]";


    private static final String C_PLUS_PLUS = "//option[@value='10']";
    private static final String ASEEMBLER = "//option[@value='11']";
    private static final String C = "//option[@value='12']";
    private static final String VISUAL_BASIC = "//option[@value='13']";

    private static final String COBOL ="//option[@value='20']";
    private static final String FORTRAN = "//option[@value='21']";
    private static final String C_PLUS_PLUS_2 = "//option[@value='22']";
    private static final String JAVA = "//option[@value='23']";


    private static final String CATEGORY_FIELD = "combo1";
    private static final String LANGUAGE = "combo2";
    private static final String SUBMIT_BUTTON = "//input[@class='styled-click-button']";

    private static final String BACK_TO_FORM_BUTTON = "back_to_form";

    private static final String VALUE_ID = "_valueid";
    private static final String LANGUAGE_ID = "_valuelanguage_id";

    @FindBy(xpath = WEB)
    public WebElement web;

    @FindBy(xpath = SERVER)
    public WebElement server;

    @FindBy(xpath = DESKTOP)
    public WebElement desktop;

    @FindBy(xpath = JAVASCRIPT)
    public WebElement javaScript;

    @FindBy(xpath = VBSCRIPT)
    public WebElement vbScript;

    @FindBy(xpath = FLASH)
    public WebElement flash;

    @FindBy(xpath = C_PLUS_PLUS)
    public WebElement cPLus1;

    @FindBy(xpath = ASEEMBLER)
    public WebElement assembler;

    @FindBy(xpath = C)
    public WebElement c;

    @FindBy(xpath = VISUAL_BASIC)
    public WebElement visualBasic;
    @FindBy(xpath = COBOL)
    public WebElement cobol;

    @FindBy(xpath = FORTRAN)
    public WebElement fortran;

    @FindBy(xpath = C_PLUS_PLUS_2)
    public WebElement cPlus2;

    @FindBy(xpath = JAVA)
    public WebElement javaElement;
    @FindBy(id = CATEGORY_FIELD)
    public WebElement category;
    @FindBy(id = LANGUAGE)
    public WebElement language;
    @FindBy(xpath = SUBMIT_BUTTON)
    public WebElement submitButton;
    @FindBy(id = BACK_TO_FORM_BUTTON)
    public WebElement backToFormButton;
    @FindBy(id = VALUE_ID)
    public WebElement valueId;
    @FindBy(id = LANGUAGE_ID)
    public WebElement languageId;




    public Ajax (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
