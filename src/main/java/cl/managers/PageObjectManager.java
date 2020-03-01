package cl.managers;

import cl.page_objects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private AuthenticationPage authenticationPage;
    private HomePage homePage;
    private CreateAccountPage createAccountPage;
    private MyAccountPage myAccountPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public AuthenticationPage getAuthenticationPage() {
        return (authenticationPage == null) ? authenticationPage = new AuthenticationPage(driver) : authenticationPage;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public CreateAccountPage getCreateAccountPage() {
        return (createAccountPage == null) ? createAccountPage = new CreateAccountPage(driver) : createAccountPage;
    }

    public MyAccountPage getMyAccountPage() {
        return (myAccountPage == null) ? myAccountPage = new MyAccountPage(driver) : myAccountPage;
    }

}
