package ru.antipov.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class SearchPage extends BasePage {
    @FindBy(name = "Введите запрос")
    public WebElement title;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }

    public void fillField(String fieldName, String value){fillField(title, value);}

    public void checkFieldErrorMessage(String field, String errorMessage){
        String xpath = "//*[text()='"+field+"']/..//*[@class='validation-error']";
        String actualValue = driver.findElement(By.xpath(xpath)).getText();

        assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, errorMessage),
                actualValue.contains(errorMessage));

    }
}

