package ru.sbrf.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.sbrf.autotests.steps.BaseSteps;


/**
 * Created by Anton on 09.11.2018.
 */
public class BasePageObject  {

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

}
