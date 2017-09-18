package ru.antipov.autotest.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.antipov.autotest.pages.MediaPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.antipov.autotest.steps.BaseSteps.driver;
import static ru.antipov.autotest.steps.BaseSteps.getDriver;

public class MediaSteps {
    @Step("добавить видео")
    public void addVideo(String fileName){WebElement element=driver.findElement(By.xpath(".//input[@type='file']"));
        element.sendKeys(fileName);
    }
    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new MediaPage(getDriver()).fillField(field, value);
    }

}
