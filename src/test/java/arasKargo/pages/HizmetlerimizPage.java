package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HizmetlerimizPage {
    public HizmetlerimizPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[7]")
    public WebElement hizmetlerimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[8]")
    public WebElement bireyselHizmetlerimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[9]")
    public WebElement kurumsalHizmetlerimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[10]")
    public WebElement ambalajUrunlerimiz;
}
