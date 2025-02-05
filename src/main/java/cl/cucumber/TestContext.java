package cl.cucumber;

import cl.managers.PageObjectManager;
import cl.managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;


    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
    //public data
    public boolean isSelectedMr = false;
    public boolean isSelectedMrs = false;
    public String firstName = "";
    public String lastName = "";
    public String email = "";

}
