package steps;

import org.openqa.selenium.WebDriver;

public class Driver {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static ThreadLocal<WebDriver> getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driverRef) {
       driver.set(driverRef);
    }
}
