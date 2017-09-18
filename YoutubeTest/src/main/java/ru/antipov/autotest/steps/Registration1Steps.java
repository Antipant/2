package ru.antipov.autotest.steps;




import ru.antipov.autotest.pages.BasePage;
import ru.antipov.autotest.pages.Registration1Page;
import ru.yandex.qatools.allure.annotations.Step;

public class Registration1Steps extends BasePage {



    @Step("поле {0} заполняется значением {1}")
    public void fillPassword(String field, String value){
        new Registration1Page().fillPassword(field, value);

    }


    @Step("нажато далее")
    public void clickNext2(){
        new Registration1Page().nextBtn2.click();

    }

}
