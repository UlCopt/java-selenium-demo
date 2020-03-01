package cl.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePageAbstract {

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    //todo: identificadores de la pagina


    //create account
    @FindBy(id = "email_create")
    WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    WebElement submitCreate;

    //sign in
    @FindBy(id = "email")
    WebElement emailElement;

    @FindBy(id = "passwd")
    WebElement passwordElement;

    @FindBy(linkText = "http://automationpractice.com/index.php?controller=password")
    WebElement forgotPassword;

    @FindBy(id = "SubmitLogin")
    WebElement submitLogin;


    public void setEmailCreate(String email) throws Exception {
        PageObjectHelper.setWebElement(driver, emailCreate, email);
    }

    public void submitCreateOption() throws Exception {
        PageObjectHelper.clickElement(driver, submitCreate);
    }

    public void setEmail(String email) throws Exception {
        PageObjectHelper.setWebElement(driver, emailElement, email);
    }

    public void setPassword(String password) throws Exception {
        PageObjectHelper.setWebElement(driver, passwordElement, password);
    }

    public void submitLoginOption() throws Exception {
        PageObjectHelper.clickElement(driver, submitLogin);
    }





}
