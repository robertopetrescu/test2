package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BeforeAfter {


    @Before
    public void setup() {

        // Create ChromeOptions to enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode


        Driver.setDriver(new ChromeDriver(options));
        //System.out.println(System.getenv("PROJECT"));
    }

    @After(order=1)
    public void takeScreenshot(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot)Driver.getDriver().get()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }

    @After(order=0)
    public void tearDown() {
        // Close the browser
        if (Driver.getDriver() != null) {
            Driver.getDriver().get().quit();
        }
    }
}