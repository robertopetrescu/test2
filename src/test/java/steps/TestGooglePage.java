package steps;

import static steps.BeforeAfter.driver;


public class TestGooglePage {

    public void testGoogleSearch() {
        // Navigate to Google
        driver.get().get("https://www.google.com");

        // Verify the title
        String title = driver.get().getTitle();
        System.out.println("Testng Page title is: " + title);
    }

    public void testGoogleSearch2() {
        // Navigate to Google
        driver.get().get("https://www.google.com");


        // Verify the title
        String title = driver.get().getTitle();
        System.out.println("Testng Page title is2: " + title);
    }


}