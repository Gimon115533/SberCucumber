package ru.sbrf.autotests.steps;

import ru.sbrf.autotests.pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;


/**
 * Created by Anton on 18.11.2018.
 */


public class TravelInsuranceSteps {

    @Step("заголовок страницы - Страхование путешественников равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new TravelInsurancePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }
    @Step("выполнить нажатие на кнопку Минимальная")
    public void BtnMin(){
        new TravelInsurancePage().sendBtnMin.click();
    }

    @Step("выполнить нажатие на кнопку Оформить")
    public void BtnFormalize(){
        new TravelInsurancePage().sendBtnFormalize.click();
    }

    @Step("появилось поле на вкладке Оформление равное {0}")
    public void checkPagePole(String expectedTitle){
        String actualTitle = new TravelInsurancePage().pole.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new TravelInsurancePage().fillField(field, value);
    }

    @Step("выполнить нажатие на кнопку Продолжить")
    public void BtnNext(){
        new TravelInsurancePage().sendBtnNext.click();
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new TravelInsurancePage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("присутствует сообщение об ошибке {0}")
    public void checkErrorMessageField(String ErrorMessage){
        String actualTitle = new TravelInsurancePage().message.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, ErrorMessage), actualTitle.contains(ErrorMessage));
    }
}
