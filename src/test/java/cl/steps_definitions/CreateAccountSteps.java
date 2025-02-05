package cl.steps_definitions;

import cl.cucumber.TestContext;
import cl.page_objects.CreateAccountPage;
import cl.utils.FunctionsUtils;
import io.cucumber.java.en.Then;

public class CreateAccountSteps {

    private CreateAccountPage createAccountPage;
    private TestContext testContext;


    public CreateAccountSteps(TestContext testContext) {
        this.testContext = testContext;
        createAccountPage = testContext.getPageObjectManager().getCreateAccountPage();
    }

    @Then("I put the title {string}")
    public void i_put_the_title(String genderValue) throws Exception {
        if (genderValue.equalsIgnoreCase("mr.")) {
            createAccountPage.selectMr();
            testContext.isSelectedMr = true;
            testContext.isSelectedMrs = false;
        } else {
            createAccountPage.selectMrs();
            testContext.isSelectedMrs = true;
            testContext.isSelectedMr = false;
        }
    }

    @Then("I put the first name {string}")
    public void i_put_the_first_name(String firstNameValue) throws Exception {
        createAccountPage.setCustomerFirstName(firstNameValue);
        testContext.firstName = firstNameValue;
    }

    @Then("I put the last name {string}")
    public void i_put_the_last_name(String lastNameValue) throws Exception {
        createAccountPage.setCustomerLastName(lastNameValue);
        testContext.lastName = lastNameValue;
    }

    @Then("I see my mail")
    public void i_see_my_mail() throws Exception {
        //todo verify mail
    }

    @Then("I put the password {string}")
    public void i_put_the_password(String passwordValue) throws Exception {
        createAccountPage.setPassword(passwordValue);
    }

    @Then("I select my date of birth {string}")
    public void i_select_my_date_of_birth(String dayOfBirthValue) throws Exception {
        createAccountPage.selectDayOfBirth(FunctionsUtils.getFormattedDate("d", dayOfBirthValue));
        createAccountPage.selectMonthOfBirth(FunctionsUtils.getFormattedDate("M", dayOfBirthValue));
        createAccountPage.selectYearOfBirth(FunctionsUtils.getFormattedDate("yyyy", dayOfBirthValue));
    }

    @Then("I put my address first name {string}")
    public void i_put_my_address_first_name(String addressValue) throws Exception {
        createAccountPage.setFirstNameAddress(addressValue);
    }

    @Then("I put my address last name {string}")
    public void i_put_my_address_last_name(String addressValue) throws Exception {
        createAccountPage.setLastNameAddress(addressValue);
    }

    @Then("I put my company {string}")
    public void i_put_my_company(String companyValue) throws Exception {
        createAccountPage.setCompany(companyValue);
    }

    @Then("I put my address company {string}")
    public void i_put_my_address_company(String addressValue) throws Exception {
        createAccountPage.setAddress1(addressValue);
    }

    @Then("I put my address company cont {string}")
    public void i_put_my_address_company_cont(String addressValue) throws Exception {
        createAccountPage.setAddress2(addressValue);
    }

    @Then("I put my city {string}")
    public void i_put_my_city(String cityValue) throws Exception {
        createAccountPage.setCity(cityValue);
    }

    @Then("I select my state {string}")
    public void i_select_my_state(String stateValue) throws Exception {
        createAccountPage.selectState(stateValue);
    }

    @Then("I put my zipcode {string}")
    public void i_put_my_zipcode(String zipcodeValue) throws Exception {
        createAccountPage.setPostCode(zipcodeValue);
    }

    @Then("I put my country {string}")
    public void i_put_my_country(String countryValue) throws Exception {
        createAccountPage.selectCountry(countryValue);
    }

    @Then("I put some additional information {string}")
    public void i_put_some_additional_information(String additionalInformationValue) throws Exception {
        createAccountPage.setAdditionalInformation(additionalInformationValue);
    }

    @Then("I put home phone {string}")
    public void i_put_home_phone(String phoneValue) throws Exception {
        createAccountPage.setPhone(phoneValue);
    }

    @Then("I put mobile phone {string}")
    public void i_put_mobile_phone(String phoneMobileValue) throws Exception {
        createAccountPage.setPhoneMobile(phoneMobileValue);
    }

    @Then("I put my alias {string}")
    public void i_put_my_alias_alias(String aliasValue) throws Exception {
        createAccountPage.setAlias(aliasValue);
    }

    @Then("I register my account")
    public void i_register_my_account() throws Exception {
        createAccountPage.submitAccountOption();
    }

}
