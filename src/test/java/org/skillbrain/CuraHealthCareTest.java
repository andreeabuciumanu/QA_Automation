package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.CuraHealthcare;

public class CuraHealthCareTest {

    private ChromeDriver driver;
    private CuraHealthcare healthcarePage;

    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();

    }

    @BeforeSuite(dependsOnMethods = "initializeDriver")
    public void initializePage() {
        healthcarePage = new CuraHealthcare(driver);

    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    @Test(testName = "Checking if you need to login for appointment")
    public void getAppointment() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        healthcarePage.make_appointment.click();
        String message = "Please login to make appointment.";
        WebElement appointmentConditionMessage = driver.findElement(By.cssSelector(".lead"));
        Assert.assertTrue(message.contains(appointmentConditionMessage.getText()));
        Thread.sleep(10);
    }

    @Test(testName = "Testing login button with invalid credentials")
    public void failedLogin() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        healthcarePage.menu.click();
        Thread.sleep(5);
//        healthcarePage.home.click();
        healthcarePage.login.click();
        Thread.sleep(10);
        healthcarePage.userName.sendKeys("acesta nu este un user");
        healthcarePage.password.sendKeys("0000");
        Thread.sleep(3);
        healthcarePage.login_button.click();
        Thread.sleep(3);
        Assert.assertTrue(healthcarePage.login_failed.getText().contains("failed"));
        Thread.sleep(10);
    }



    @Test(testName = "Testing login button with valid credentials")
    public void login() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        healthcarePage.menu.click();
        Thread.sleep(5);
        healthcarePage.login.click();
        healthcarePage.userName.sendKeys("John Doe");
        Thread.sleep(5);
        healthcarePage.password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(5);
        healthcarePage.login_button.click();
        Thread.sleep(30);

//    Alert alert = driver.switchTo().alert();
//    alert.accept();

    }


    @Test(testName = "Make appointment with a past date")
    public void makeAppointment() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        healthcarePage.make_appointment.click();

        if (driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/profile.php#login")) {
            healthcarePage.userName.sendKeys("John Doe");
            healthcarePage.password.sendKeys("ThisIsNotAPassword");
            healthcarePage.login_button.click();
        }

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        WebElement facility = driver.findElement(By.id("combo_facility"));
        Select select = new Select(facility);
        select.selectByValue("Hongkong CURA Healthcare Center");
        WebElement healthCareProgram = driver.findElement(By.id("radio_program_medicaid"));
        healthCareProgram.click();

        Thread.sleep(20);
        driver.findElement(By.id("txt_visit_date")).click();
        WebElement selectMonth = driver.findElement(By.cssSelector(".datepicker-days thead tr:nth-child(2) th:nth-child(1)"));
        selectMonth.click();
        selectMonth.click();
        WebElement selectDay = driver.findElement(By.cssSelector(".datepicker-days tbody tr:nth-child(3) td:nth-child(1)"));
       selectDay.click();

        driver.findElement(By.id("appointment")).click();
        driver.findElement(By.id("btn-book-appointment")).click();

        String expectedMessage = "You can't make an appointment with a past date";
        String actualMessage = driver.findElement(By.tagName("h2")).getText();

        System.out.println(expectedMessage == actualMessage? "Test valid":"Test invalid, nu se poate programa la o data in trecut!");

    }
}






