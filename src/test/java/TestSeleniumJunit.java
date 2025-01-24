
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class TestSeleniumJunit {
    private WebDriver driver;

    @BeforeEach
    public void setup() {

        // Create ChromeOptions to enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode


        driver = new ChromeDriver(options);
        //System.out.println(System.getenv("PROJECT"));
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");


        // Verify the title
        String title = driver.getTitle();
        System.out.println("Junit Page title is: " + title);
    }

    @AfterEach
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
