package ru.sbrf.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.sbrf.autotests.steps.BaseSteps;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage extends BasePageObject{


    @FindBy(xpath = "//*[@class='bd-designMode-null  webkit ya-page_js_yes']')]")
    WebElement menuItems;
//
//    @FindBy(xpath = "//div[contains(@class,'grid rgs-main-menu')]")
//    WebElement menuInsurance;
//
    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//li[contains(@class,'lg-menu')]//*[contains(text(),'"+itemName+"')]")).click();
    }

//    public void selectInsuranceItem(String itemName){
//        menuInsurance.findElement(By.xpath(".//li[contains(@class,'line3-link')]//a[contains(text(),'"+itemName+"')]")).click();
//    }
}

