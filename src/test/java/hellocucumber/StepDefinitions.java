package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class StepDefinitions {

    @Given("User logged in to fresenius URL")
    public void user_logged_in_to_fresenius_url() throws MalformedURLException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        FreseniusTest ft=new FreseniusTest();
        ft.setUp();
        //ft.fresenius();
        //ft.tearDown();
    }
}
