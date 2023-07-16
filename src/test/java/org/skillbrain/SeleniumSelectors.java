package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumSelectors {

    private static ChromeDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
    @Test
    public void firstName(){
        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        firstNameTextBox.sendKeys("Cristian-Claudiu");
        String firstName = firstNameTextBox.getDomProperty("value");
        Assert.assertEquals(firstName, "Cristian-Claudiu");
    }

    @Test
    public void lastName(){
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        lastNameTextBox.sendKeys("Sandu");
        String lastNameTextBoxText = lastNameTextBox.getDomProperty("value");
        Assert.assertEquals(lastNameTextBoxText, "Sandu");
    }
    @Test
    public void radioButton(){
        WebElement radioButtonMale = driver.findElement(By.cssSelector(".custom-control-label"));
        radioButtonMale.click();
    }






//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        // id selector -> in pagin web se cauta dupa #numeId
//        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
//        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
//
//        // cssSelector ->  .className -> cauta dupa clasa
//        WebElement radioButtonMale = driver.findElement(By.cssSelector(".custom-control-label"));
//
//        firstNameTextBox.sendKeys("Cristian-Claudiu");
//        lastNameTextBox.sendKeys("Sandu");
//        radioButtonMale.click();
//
//        driver.quit();
//
//
//
//
//
//
//    }


}
