package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IsOrtagimizOlunPage {
    public IsOrtagimizOlunPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[20]")
    public WebElement isOrtagimizOlun;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[21]")
    public WebElement acentemizOlun;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[22]")
    public WebElement arasBurdaNoktasi;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[23]")
    public WebElement esnafKurye;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[24]")
    public WebElement araciniziKiralayin;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[25]")
    public WebElement sikSorulanSorular;
}
