package cl.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePageAbstract {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    //link http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation

    @FindBy(id = "id_gender1")
    WebElement mrSelect;

    @FindBy(id = "id_gender2")
    WebElement mrsSelect;

    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "days")
    WebElement birthDay;

    @FindBy(id = "months")
    WebElement birthMonth;

    @FindBy(id = "years")
    WebElement birthYear;

    //Adress

    @FindBy(id = "firstname")
    WebElement firstNameAddress;

    @FindBy(id = "lastname")
    WebElement lastNameAddress;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement postalCode;

    @FindBy(id = "id_country")
    WebElement country;

    @FindBy(id = "other")
    WebElement additionalInformartion;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "phone_mobile")
    WebElement phoneMobile;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(id = "submitAccount")
    WebElement submitAccount;









}
