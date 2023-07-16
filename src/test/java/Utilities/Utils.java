package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd :: HH:mm");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
//    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {
//        URL url = new URL("http://192.168.86.53:4444");

//        return new RemoteWebDriver(url, new ChromeOptions());
//
//    };

    public static ChromeDriver getChromeDriver(){


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;


    }
    public static void takeScreenshot(WebDriver driver) throws IOException {

        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd :: HH:mm");


        destinationFile = System.getProperty("user.dir") + "/logs/printscreen-" + formatter.format(LocalDateTime.now()) + ".png";
        FileUtils.copyFile(source, new File(destinationFile));


    }

}
