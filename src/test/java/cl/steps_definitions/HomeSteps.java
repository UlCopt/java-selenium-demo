package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.HomePage;

public class HomeSteps {

    private AuthenticationPage authenticationPage;
    private HomePage homePage;
    private TestContext testContext;


    public HomeSteps(TestContext testContext) {
        this.testContext = testContext;
        authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

}
