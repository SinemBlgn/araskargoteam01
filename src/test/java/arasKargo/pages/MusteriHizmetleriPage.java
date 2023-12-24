package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusteriHizmetleriPage {
    public MusteriHizmetleriPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[26]")
    public WebElement musteriHizmetleri;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[27]")
    public WebElement arasAsor;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[28]")
    public WebElement cagriMerkezi;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[29]")
    public WebElement hasarTanzim;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[30]")
    public WebElement geriBildirim;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[31]")
    public WebElement sss;
}
