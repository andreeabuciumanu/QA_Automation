package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ButtonClickTutorial {

    private static ChromeDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    @Test(testName = "Testing a double click button")
    public void doubleClickButton(){
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).build().perform();
        String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals(doubleClickMessage, "You have done a double click");
    }

    @Test(testName = "Testing a right click button")
    public void rightClickButton(){
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).build().perform();
        String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(rightClickMessage, "You have done a right click");

    }

    @Test(testName = "Testing a dynamic click button")
    public void simpleClickButton(){
        driver.get("https://demoqa.com/buttons");
        WebElement clickMeButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        Actions actions = new Actions(driver);
        actions.click(clickMeButton).build().perform();
        String dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        Assert.assertEquals(dynamicClickMessage, "You have done a dynamic click");



    }
//    public static void main(String[] args) {
////        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
////        ChromeDriver driver = new ChromeDriver();
////        driver.manage().window().maximize();
//        ChromeDriver driver  = Utils.getChromeDriver();
//
//        try{
//            driver.get("https://demoqa.com/buttons");
//            WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
//            WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
//            WebElement clickMeButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
//
//            Actions actions = new Actions(driver);
//            actions.doubleClick(doubleClickBtn).build().perform();
//            actions.contextClick(rightClickBtn).build().perform();
//            actions.click(clickMeButton).build().perform();
//
//
//
//
//            String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
//            System.out.println(doubleClickMessage);
//            Thread.sleep(3000);
//
//            String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
//            System.out.println(rightClickMessage);
//            Thread.sleep(3000);
//
//            String dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
//            System.out.println(dynamicClickMessage);
//            Thread.sleep(3000);
//
//            Utils.takeScreenshot(driver);
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            driver.quit();
//        }
//
//
//
//    }
}
