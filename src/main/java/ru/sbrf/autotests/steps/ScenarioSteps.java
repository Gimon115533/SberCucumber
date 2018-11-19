package ru.sbrf.autotests.steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;

/**
 * Created by Anton on 09.11.2018.
 */
public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    ChoiceInsuranceSteps choiceInsuranceSteps = new ChoiceInsuranceSteps();

    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("^выбран вид страхования \"(.+)\"$")
    public void selectMenuInsurance(String menuName){
        mainPageSteps.selectMenuInsurance(menuName);
    }

    @Then("^заголовок страницы - Путешествия и покупки равен \"(.+)\"$")
    public void checkTitleDMSPage(String title){
        choiceInsuranceSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку Оформить онлайн$")
    public void clickBtnSendApp(){
        choiceInsuranceSteps.goToSendAppPage();
    }

    @When("^выполнить переход на новую вкладку$")
    public void goToNewOpenPage(){
        choiceInsuranceSteps.goToNewPage();
    }

    @Then("^заголовок страницы - Страхование путешественников равен \"(.+)\"$")
    public void checkTitleTravelInsurancePage(String title){
        travelInsuranceSteps.checkPageTitle(title);
    }

    @When("^выполнить нажатие на кнопку Минимальная$")
    public void clickBtnMin(){
        travelInsuranceSteps.BtnMin();
    }

    @When("^выполнить нажатие на кнопку Оформить$")
    public void clickBtnFormalize(){
        travelInsuranceSteps.BtnFormalize();
    }

    @Then("^появилось поле на вкладке Оформление равное \"(.+)\"$")
    public void checkPoleTravelInsurancePage(String pole){
        travelInsuranceSteps.checkPagePole(pole);
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> travelInsuranceSteps.fillField(field, value));

    }

    @When("^выполнить нажатие на кнопку Продолжить$")
    public void clickBtnNext(){
        travelInsuranceSteps.BtnNext();
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> travelInsuranceSteps.checkFillField(field, value));
    }

    @Then("^присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String errorMessage){
        travelInsuranceSteps.checkErrorMessageField(errorMessage);

    }

}

