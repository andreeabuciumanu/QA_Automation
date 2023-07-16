package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTutorial {

    private static ChromeDriver driver;



    @BeforeSuite
    public void initializeDriver(){
        driver = Utils.getChromeDriver();

    }

    @AfterSuite
    public void closeDriver(){

        driver.quit();
    }




//    public static void main(String[] args) throws IOException {
//        driver = getChromeDriver();
//
//        try{
//            driver.get("https://demoqa.com/alerts");
//
////            timerAlertButtonTest();
////            alertButtonTest();
////            acceptOrCancelAlertButton();
////            textBoxAlertTest();
//
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            takeScreenshot(driver);
//
//
//        }finally {
//            driver.quit();
//        }
//
//
//    }



    @Test(testName = "Verify alert box text returns expected message on web page.")
    public void textBoxAlertTest() {
        driver.get("https://demoqa.com/alerts");
        String messageToEnter = "This message";
        WebElement promptButton = driver.findElement(By.id("promtButton"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(messageToEnter);
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        String actualResultOnPage = promptResult.getText();
        Assert.assertEquals(actualResultOnPage, "You entered " + messageToEnter);
    }

    @Test(testName = "Click on accept/cancel button")
    public void acceptOrCancelAlertButton(){
        driver.get("https://demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
//            alert.accept();
        alert.dismiss();
        WebElement succesMessage = driver.findElement(By.cssSelector(".text-success"));
        Assert.assertEquals(succesMessage.getText(), "You selected Cancel");

    }
    @Test(testName = "Alert button test - after click, alert will apear after 5 seconds")
    public void timerAlertButtonTest() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
        Thread.sleep(Duration.ofSeconds(7));
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test(testName = "Simple click on alert button")
    public void alertButtonTest() {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Alert alert =  driver.switchTo().alert();
        String message = alert.getText();
        alert.accept();
        Assert.assertEquals(message, "You clicked a button");}

}
