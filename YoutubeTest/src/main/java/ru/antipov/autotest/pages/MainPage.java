package ru.antipov.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.antipov.autotest.steps.BaseSteps;


public class MainPage extends BasePage {

    @FindBy(xpath="(//paper-button//*[text()='Войти'])[1]")
    WebElement comeInBtn;

    @FindBy(xpath="//*[contains(text(),'Добавить видео')][contains(@class,'btn')]")
    WebElement addVideo;


    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        comeInBtn.click();
    }


}
