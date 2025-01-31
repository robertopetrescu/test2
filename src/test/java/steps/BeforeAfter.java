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

    @After(order=1)
    public void takeScreenshot(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot)driver.get()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }

    @After(order=0)
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.get().quit();
        }
    }
}