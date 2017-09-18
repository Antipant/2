package ru.antipov.autotest.steps;




import ru.antipov.autotest.pages.BasePage;
import ru.antipov.autotest.pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationSteps extends BasePage {


    @Step("поле {0} заполняется значением {1}")
    public void fillLogin(String field, String value){
        new RegistrationPage().fillLogin(field, value);

    }


    @Step("нажато далее")
    public void clickNext1(){
        new RegistrationPage().nextBtn1.click();

    }


}
