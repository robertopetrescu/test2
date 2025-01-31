package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

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
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.get().quit();
        }
    }
}