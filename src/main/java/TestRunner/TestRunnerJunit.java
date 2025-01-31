package TestRunner;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/TestGoogleJunit.feature",
        glue = {"steps"},
        plugin= {"pretty", "html:target/cucumber-reports" },monochrome=true)
public class TestRunnerJunit {
}

