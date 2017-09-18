package ru.antipov.autotest.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ru.antipov.autotest.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


import static ru.antipov.autotest.steps.BaseSteps.driver;
import static ru.antipov.autotest.steps.BaseSteps.getDriver;


public class MainSteps   {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }


    @Step("добавить видео")
    public void addVideo(String fileName){
        String script = "arguments[0].style.opacity=1;"
                + "arguments[0].type='file';"
                + "arguments[0].style.left='0px';"
                + "arguments[0].style.display='inline';"
                + "arguments[0].style.visibility='visible';"
                + "return true;";
        WebElement element = driver.findElement(By.xpath(".//input[@type='file']"));
        ((JavascriptExecutor) getDriver()).executeScript(script, element);
        element.sendKeys(System.getProperty("file_for_load.path") + fileName);

    }



}
