package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Ajax;


public class AjaxTest<ajaxPage> {


    private ChromeDriver driver;
    private Ajax ajaxPage;


    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    @BeforeSuite(dependsOnMethods = "initializeDriver")
    public void initializePage() {
        ajaxPage = new Ajax(driver);
    }


    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }


    @DataProvider(name = "myDataProvider")
    public Object[][] myDataProvider() {
        return new Object[][]{
                {ajaxPage.web, ajaxPage.javaScript},
                {ajaxPage.web, ajaxPage.vbScript},
                {ajaxPage.web,ajaxPage.flash},
                {ajaxPage.desktop,ajaxPage.cPLus1},
                {ajaxPage.desktop, ajaxPage.assembler},
                {ajaxPage.desktop, ajaxPage.c},
                {ajaxPage.desktop, ajaxPage.visualBasic},
                {ajaxPage.server, ajaxPage.cobol},
                {ajaxPage.server, ajaxPage.fortran},
                {ajaxPage.server, ajaxPage.cPlus2},
                {ajaxPage.server, ajaxPage.javaElement}
        };
    }

    @Test(dataProvider = "myDataProvider", testName = "Testing different URL for Ajax page")
    public void ajaxTestUrl(WebElement category, WebElement language) throws InterruptedException {
        String categoryValue = category.getAttribute("value");
        Select selectCategory = new Select(ajaxPage.category);
        selectCategory.selectByValue(categoryValue);
        ajaxPage.category.click();
        Thread.sleep(3000);
        String languageValue = language.getAttribute("value");
        Select selectLanguage = new Select(ajaxPage.language);
        selectLanguage.selectByValue(languageValue);
        ajaxPage.language.click();

        ajaxPage.submitButton.click();


        Thread.sleep(3000);
        Assert.assertEquals(categoryValue, ajaxPage.valueId.getText());
        Assert.assertEquals(languageValue, ajaxPage.languageId.getText());
        Thread.sleep(2000);

        ajaxPage.backToFormButton.click();
        Thread.sleep(3000);

    }

}



