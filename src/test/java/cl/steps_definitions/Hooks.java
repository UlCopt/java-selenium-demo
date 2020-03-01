package cl.steps_definitions;

import cl.cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void beforeScenario() {

    }

    @After
    public void afterScenario() {
        testContext.getWebDriverManager().closeDriver();
    }


}
