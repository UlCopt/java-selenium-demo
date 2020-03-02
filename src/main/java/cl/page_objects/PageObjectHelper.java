package cl.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class PageObjectHelper {
    static Duration timeoutDuration = Duration.ofSeconds(30);
    static Duration pollingDuration = Duration.ofSeconds(5);

    public static boolean fluentWaitElement(WebDriver driver, WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutDuration)
                .pollingEvery(pollingDuration)
                .ignoring(NoSuchElementException.class);

        return wait.until(a -> {
            try {
                return element.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        });
    }

    public static void setWebElement(WebDriver driver, WebElement element, String value) throws Exception {
        if (fluentWaitElement(driver, element)) {
            element.sendKeys(value);
        } else {
            throw new Exception("No se encontró el elemento: " + element.toString());
        }
    }

    public static void clickElement(WebDriver driver, WebElement element) throws Exception {
        if (fluentWaitElement(driver, element)) {
            element.click();
        } else {
            throw new Exception("No se encontró el elemento");
        }
    }

    public static void selectItemBox(WebDriver driver, WebElement element, String value) {
        Select selectBox = new Select(element);
        selectBox.selectByValue(value);
    }

    public static void scrollVertical(WebDriver driver, String x, String y) {
        ((JavascriptExecutor) driver).executeScript("scroll(" + x + "," + y + ");");
    }


}
