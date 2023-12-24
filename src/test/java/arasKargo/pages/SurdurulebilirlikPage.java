package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurdurulebilirlikPage {
    public SurdurulebilirlikPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[16]")
    public WebElement surdurulebilirlik;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[17]")
    public WebElement surdurulebilirlikRotasi;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[18]")
    public WebElement sosyalSorumluluk;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[19]")
    public WebElement kaliteYonetim;

}
