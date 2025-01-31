package steps;

import io.cucumber.java.en.Given;

public class TestGoogleStep {
    TestGooglePage tg = new TestGooglePage();
    @Given("today is Sunday")
    public void todayIsSunday() {
        tg.testGoogleSearch();
    }

    @Given("today is Sunday part two")
    public void todayIsSundaytwo() {
        tg.testGoogleSearch2();
    }
}