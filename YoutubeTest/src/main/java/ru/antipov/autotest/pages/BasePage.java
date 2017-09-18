package ru.antipov.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.antipov.autotest.steps.BaseSteps;

import static org.junit.Assert.assertEquals;


public class BasePage{

    WebDriver driver;

    public BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public boolean isElementPresent(By by) {
        try {
            BaseSteps.getDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);

    }

    public void checkFillField(String value, WebElement element) {
        assertEquals(value, element.getAttribute("value"));
    }
}
