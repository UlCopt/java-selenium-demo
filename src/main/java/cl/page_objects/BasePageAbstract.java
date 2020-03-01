package cl.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageAbstract {

    public WebDriver driver;

    public BasePageAbstract(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
