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

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "days")
    WebElement birthDay;

    @FindBy(id = "months")
    WebElement birthMonth;

    @FindBy(id = "years")
    WebElement birthYear;

    //Address

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
    WebElement additionalInformation;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "phone_mobile")
    WebElement phoneMobile;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(id = "submitAccount")
    WebElement submitAccount;


    public void selectMr() throws Exception {
        PageObjectHelper.clickElement(driver, mrSelect);
    }

    public void selectMrs() throws Exception {
        PageObjectHelper.clickElement(driver, mrsSelect);
    }

    public void setCustomerFirstName(final String firstNameValue) throws Exception {
        PageObjectHelper.setWebElement(driver, firstName, firstNameValue);
    }

    public void setCustomerLastName(final String lastNameValue) throws Exception {
        PageObjectHelper.setWebElement(driver, lastName, lastNameValue);
    }

    public void setEmail(final String emailValue) throws Exception {
        PageObjectHelper.setWebElement(driver, email, emailValue);
    }

    public void setPassword(final String passwordValue) throws Exception {
        PageObjectHelper.setWebElement(driver, password, passwordValue);
    }

    public void selectDayOfBirth(final String dayOfBirthValue) throws Exception {
        PageObjectHelper.scrollVertical(driver, "0", "500");
        PageObjectHelper.selectItemBox(driver, birthDay, dayOfBirthValue);
    }

    public void selectMonthOfBirth(final String dayOfBirthValue) throws Exception {
        PageObjectHelper.selectItemBox(driver, birthMonth, dayOfBirthValue);
    }

    public void selectYearOfBirth(final String dayOfBirthValue) throws Exception {
        PageObjectHelper.selectItemBox(driver, birthYear, dayOfBirthValue);
    }

    public void setFirstNameAddress(final String firstNameAddressValue) throws Exception {
        PageObjectHelper.setWebElement(driver, firstNameAddress, firstNameAddressValue);
    }

    public void setLastNameAddress(final String lastNameAddressValue) throws Exception {
        PageObjectHelper.setWebElement(driver, lastNameAddress, lastNameAddressValue);
    }

    public void setCompany(final String companyValue) throws Exception {
        PageObjectHelper.setWebElement(driver, company, companyValue);
    }

    public void setAddress1(final String address1Value) throws Exception {
        PageObjectHelper.setWebElement(driver, address1, address1Value);
    }

    public void setAddress2(final String address2Value) throws Exception {
        PageObjectHelper.scrollVertical(driver, "0", "500");
        PageObjectHelper.setWebElement(driver, address2, address2Value);
    }

    public void setCity(final String cityValue) throws Exception {
        PageObjectHelper.setWebElement(driver, city, cityValue);
    }

    public void selectState(final String stateValue) throws Exception {
        PageObjectHelper.selectItemBox(driver, state, stateValue);
    }

    public void setPostCode(final String postCodeValue) throws Exception {
        PageObjectHelper.setWebElement(driver, postalCode, postCodeValue);
    }

    public void selectCountry(final String countryValue) throws Exception {
        PageObjectHelper.selectItemBox(driver, country, countryValue);
    }

    public void setAdditionalInformation(final String additionalInformationValue) throws Exception {
        PageObjectHelper.scrollVertical(driver, "0", "600");
        PageObjectHelper.setWebElement(driver, additionalInformation, additionalInformationValue);
    }

    public void setPhone(final String phoneValue) throws Exception {
        PageObjectHelper.setWebElement(driver, phone, phoneValue);
    }

    public void setPhoneMobile(final String phoneMobileValue) throws Exception {
        PageObjectHelper.setWebElement(driver, phoneMobile, phoneMobileValue);
    }

    public void setAlias(final String aliasValue) throws Exception {
        PageObjectHelper.setWebElement(driver, alias, aliasValue);
    }

    public void submitAccountOption() throws Exception {
        PageObjectHelper.clickElement(driver, submitAccount);
    }


}
