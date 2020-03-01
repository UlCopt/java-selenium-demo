package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.AuthenticationPage;
import cl.page_objects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {

    private AuthenticationPage authenticationPage;
    private HomePage homePage;
    private TestContext testContext;


    public HomeSteps(TestContext testContext) {
        this.testContext = testContext;
        authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }


    @Given("Navigate to site")
    public void navigate_to_site() {
        homePage.navigateToHome();
    }

    @When("I open Signin")
    public void i_open_Signin() throws Exception {
        homePage.signIn();
    }

}
