import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSeleniumTestNg {
    private WebDriver driver;

    @BeforeClass
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
        System.out.println("Testng Page title is: " + title);
    }

    @Test
    public void testGoogleSearch2() {
        // Navigate to Google
        driver.get("https://www.google.com");


        // Verify the title
        String title = driver.getTitle();
        System.out.println("Testng Page title is2: " + title);
    }

    @AfterClass
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}