package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.AuthenticationPage;
import cl.utils.FunctionsUtils;
import io.cucumber.java.en.Then;


public class AuthenticationSteps {

    private AuthenticationPage authenticationPage;
    private TestContext testContext;

    public AuthenticationSteps(TestContext testContext) {
        this.testContext = testContext;
        authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
    }

    @Then("I put a mail to create a new user account and confirm")
    public void i_put_a_mail_to_create_a_new_user_account_and_confirm() throws Exception {
        testContext.email = FunctionsUtils.getNewMail();
        authenticationPage.setEmailCreate(testContext.email);
        authenticationPage.submitCreateOption();
    }
}
