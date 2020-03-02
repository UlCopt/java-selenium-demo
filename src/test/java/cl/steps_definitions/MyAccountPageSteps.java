package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.MyAccountPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyAccountPageSteps {

    private MyAccountPage myAccountPage;
    private TestContext testContext;

    public MyAccountPageSteps(TestContext testContext) {
        this.testContext = testContext;
        myAccountPage = testContext.getPageObjectManager().getMyAccountPage();
    }

    @Then("I Verify my account")
    public void i_Verify_my_account() throws Exception {
        myAccountPage.personalInformation();

        Assert.assertEquals("Error: El genero registrado es incorrecto"
                , testContext.isSelectedMr
                , myAccountPage.isSelectMr());

        Assert.assertEquals("Error: El genero registrado es incorrecto"
                , testContext.isSelectedMrs
                , myAccountPage.isSelectMrs());

        Assert.assertEquals("Error: FirstName registrado es incorrecto"
                , testContext.firstName
                , myAccountPage.getFirstName());

        Assert.assertEquals("Error: LastName registrado es incorrecto"
                , testContext.lastName
                , myAccountPage.getLastName());

        Assert.assertEquals("Error: Email registrado es incorrecto"
                , testContext.email
                , myAccountPage.getEmail());
    }

}
