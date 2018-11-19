package ru.sbrf.autotests.steps;

import ru.sbrf.autotests.pages.ChoiceInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 18.11.2018.
 */

public class ChoiceInsuranceSteps {
    @Step("выполнено нажатие на кнопку Оформить онлайн")
    public void goToSendAppPage(){
        new ChoiceInsurancePage().sendAppBtn.click();
    }


    @Step("заголовок страницы - Путешествия и покупки равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new ChoiceInsurancePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнить переход на новую вкладку")
    public void goToNewPage() {
        new BaseSteps().swetchPage();
    }
}
