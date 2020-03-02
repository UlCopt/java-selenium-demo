package cl.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePageAbstract {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "contact-link")
    WebElement contactLink;

    @FindBy(className = "header_user_info")
    WebElement singIn;

    public void navigateToHome() {
        driver.get("http://automationpractice.com");
    }

    public void signIn() throws Exception {
        PageObjectHelper.clickElement(driver, singIn);
    }


}
