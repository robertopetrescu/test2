package steps;


public class TestGooglePage {

    public void testGoogleSearch() {
        // Navigate to Google
        Driver.getDriver().get().get("https://www.google.com");

        // Verify the title
        String title = Driver.getDriver().get().getTitle();
        System.out.println("Testng Page title is: " + title);
    }

    public void testGoogleSearch2() {
        // Navigate to Google
        Driver.getDriver().get().get("https://www.google.com");


        // Verify the title
        String title = Driver.getDriver().get().getTitle();
        System.out.println("Testng Page title is2: " + title);
    }


}