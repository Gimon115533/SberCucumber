package ru.sbrf.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.sbrf.autotests.steps.BaseSteps;

import java.util.ArrayList;

/**
 * Created by Anton on 18.11.2018.
 */

public class ChoiceInsurancePage extends BasePageObject {
    @FindBy(xpath = "//h3[contains(text(),'Страхование путешественников')]")
    public WebElement title;

    @FindBy(xpath = "//*[contains(@data-pid,'2247407')]//*[@class='kit-button kit-button_color_green kit-button_size_m']")
    public WebElement sendAppBtn;

    public ChoiceInsurancePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

}
