package ru.sbrf.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.sbrf.autotests.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Anton on 18.11.2018.
 */


public class TravelInsurancePage extends BasePageObject {

    @FindBy(xpath = "//div[@class='l-header-inside g-cleared']//h2[contains(text(),'Страхование путешественников')]")
    public WebElement title;

    @FindBy(xpath = "//*[@class='b-form-section']//*[@class='b-form-box-block']//*[@class='b-form-prog-box b-form-active-box']")
    public WebElement sendBtnMin;

    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    public WebElement sendBtnFormalize;

    @FindBy(xpath = "//*[contains(@ng-click,'save()')]")
    public WebElement sendBtnNext;


    @FindBy(xpath = "//span[contains(text(),'Введите данные застрахованных латинскими буквами, как в загранпаспорте')]")
    public WebElement pole;

    @FindBy(xpath = "//*[contains(text(),'Заполнены не все обязательные поля')]")
    public WebElement message;

    public TravelInsurancePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(title));

    }

    @FindBy(name = "insured0_surname")
    public WebElement insured0_surname;

    @FindBy(name = "insured0_name")
    public WebElement insured0_name;

    @FindBy(name = "insured0_birthDate")
    public WebElement insured0_birthDate;

    @FindBy(name = "surname")
    public WebElement surname;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "middlename")
    public WebElement middlename;

    @FindBy(name = "birthDate")
    public WebElement birthDate;

    @FindBy(name = "female")
    public WebElement female;

    @FindBy(name = "passport_series")
    public WebElement passport_series;

    @FindBy(name = "passport_number")
    public WebElement passport_number;

    @FindBy(name = "issueDate")
    public WebElement issueDate;

    @FindBy(name = "issuePlace")
    public WebElement issuePlace;

    public void fillField(String fieldename, String value) {
        switch (fieldename) {
            case "первая фамилия":
                fillField(insured0_surname, value);
                break;
            case "первое имя":
                fillField(insured0_name,value);
                break;
            case "первая др":
                fillField(insured0_birthDate, value);
                break;
            case "фамилия":
                fillField(surname,value);
                break;
            case "имя":
                fillField(name, value);
                break;
            case "отчество":
                fillField(middlename,value);
                break;
            case "др":
                fillField(birthDate, value);
                break;
            case "серия":
                fillField(passport_series,value);
                break;
            case "номер":
                fillField(passport_number, value);
                break;
            case "дата":
                fillField(issueDate,value);
                break;
            case "кем":
                fillField(issuePlace,value);
                break;
            default: throw new AssertionError("Поле "+fieldename+"не объявлено");
        }

    }

    public String getFillField(String fieldName){
        switch (fieldName){
            case  "первая фамилия":
                return insured0_surname.getAttribute("value");
            case  "первое имя":
                return insured0_name.getAttribute("value");
            case  "первая др":
                return insured0_birthDate.getAttribute("value");
            case  "фамилия":
                return surname.getAttribute("value");
            case  "имя":
                return name.getAttribute("value");
            case  "отчество":
                return middlename.getAttribute("value");
            case  "др":
                return birthDate.getAttribute("value");
            case  "серия":
                return passport_series.getAttribute("value");
            case  "номер":
                return passport_number.getAttribute("value");
            case  "дата":
                return issueDate.getAttribute("value");
            case  "кем":
                return issuePlace.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

}
