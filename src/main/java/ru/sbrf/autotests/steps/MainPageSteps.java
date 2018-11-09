package ru.sbrf.autotests.steps;

import ru.sbrf.autotests.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anton on 09.11.2018.
 */
public class MainPageSteps {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }

//    @Step("выбран вид страхования {0}")
//    public void selectMenuInsurance(String menuItem){
//        new MainPage().selectInsuranceItem(menuItem);
//    }

}
