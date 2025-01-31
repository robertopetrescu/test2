package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;

public class BeforeAfter {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before
    public void setup() {

        // Create ChromeOptions to enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode


        driver.set(new ChromeDriver(options));
        //System.out.println(System.getenv("PROJECT"));
    }

    @After
    public void takeScreenshot(Scenario scenario){
        File file = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot)driver.get()).getScreenshotAs(OutputType.BASE64);
        scenario.attach(screenshotBase64, "image/png","image");
    }
    @After
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.get().quit();
        }
    }
}