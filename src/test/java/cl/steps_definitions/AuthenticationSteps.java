package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.AuthenticationPage;
import cl.page_objects.HomePage;
import io.cucumber.java.en.Then;


public class AuthenticationSteps {

    private AuthenticationPage authenticationPage;
    private HomePage homePage;
    private TestContext testContext;


    public AuthenticationSteps(TestContext testContext) {
        this.testContext = testContext;
        authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Then("I put a mail to create a new user account and confirm")
    public void i_put_a_mail_to_create_a_new_user_account_and_confirm() throws Exception{
        authenticationPage.setEmailCreate("qeqweq@asdasd.cl");
        authenticationPage.submitCreateOption();
    }
}
