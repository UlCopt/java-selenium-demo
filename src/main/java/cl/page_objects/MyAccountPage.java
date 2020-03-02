package cl.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePageAbstract {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span")
    WebElement myPersonalInformationOption;

    @FindBy(id = "id_gender1")
    WebElement mrSelect;

    @FindBy(id = "id_gender2")
    WebElement mrsSelect;

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement email;


    public void personalInformation() throws Exception {
        PageObjectHelper.clickElement(driver, myPersonalInformationOption);
    }

    public boolean isSelectMr() { //if true
        return mrSelect.getAttribute("value").trim().equalsIgnoreCase("1");
    }

    public boolean isSelectMrs() { //if true
        return mrsSelect.getAttribute("value").trim().equalsIgnoreCase("1");
    }

    public String getFirstName() throws Exception {
        return firstName.getAttribute("value");
    }

    public String getLastName() throws Exception {
        return lastName.getAttribute("value");
    }

    public String getEmail() throws Exception {
        return email.getAttribute("value");
    }


}
