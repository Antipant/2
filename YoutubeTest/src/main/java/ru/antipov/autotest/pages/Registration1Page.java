package ru.antipov.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Registration1Page extends BasePage {




    @FindBy(name = "password")
    WebElement password;



    @FindBy(xpath = ".//*[@id='passwordNext']/content/span")
    public WebElement nextBtn2;



    public void fillPassword(String fieldName, String value) {
        switch (fieldName) {

            case "password":
                fillField(password, value);
                break;

            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
    public void clickNext2(String itemName){
        nextBtn2.click();
    }
}
