package ru.antipov.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaPage extends BasePage  {
    @FindBy(name = "Загрузка завершена")
    public WebElement title;

    public MediaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }




    @FindBy(name = "textarea[name=\"description\"]")
    WebElement description;

    @FindBy(name = "input.video-settings-add-tag")
    WebElement tag;
    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Описание":
                fillField(description, value);
                break;
            case  "Тэг":
                fillField(tag, value);
                break;

            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }
    public void waitMediaClickable(){

        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//*[contains(text(),'Опубликовать')][contains(@class,'btn')]")))).click();
    }
}
