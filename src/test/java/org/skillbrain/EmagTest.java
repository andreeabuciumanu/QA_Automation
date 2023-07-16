package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.EmagHomePage;

public class EmagTest {

    private static ChromeDriver driver;
    private static EmagHomePage emagHomePage;

    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
        driver.get("https://www.emag.ro/");
        emagHomePage = new EmagHomePage(driver);
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();

    }




    @Test
    public void gdprBanner() throws InterruptedException {
        Thread.sleep(3000);
        emagHomePage.gdprBanner.click();

    }

    @Test
    public void acceptGdpr() throws InterruptedException {
        Thread.sleep(10000);
        emagHomePage.acceptGdpr.click();

    }

    @Test
    public void myAccount() throws InterruptedException {
        Thread.sleep(2000);
        emagHomePage.myAccount.click();
    }




//    public static void main(String[] args) {
//
//        driver = Utils.getChromeDriver();
//
//        try{
//            driver.get("https://www.emag.ro/");
//
////            simplemagHomePageExemple();
//            emagHomePage = new EmagHomePage(driver);
//            emagHomePage.acceptGdpr.click();
//            emagHomePage.gdprBanner.click();
//            emagHomePage.myAccount.click();
//
//
//
//
////            driver.navigate().refresh();
////            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////            wait.until(ExpectedConditions.visibilityOf(acceptGdpr));
////
//            System.out.println("Test finished successfully");
//
//    }catch (Exception e){
//            e.printStackTrace();
//        }finally{
//            driver.quit();
//        }
//
//    }
//
//    private static void simplemagHomePageExemple() {
//        WebElement acceptGdpr
//                = driver.findElement(By.cssSelector(".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block"));
//        WebElement gdprBanner = driver.findElement(By.cssSelector(".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show"));
//        WebElement ofertaZilei = driver.findElement(By.xpath("//button[@data-ntf='close']"));
//        WebElement myAccount = driver.findElement(By.id("my_account"));
//        acceptGdpr.click();
//        gdprBanner.click();
//        ofertaZilei.click();
//        myAccount.click();
//    }
//

}
