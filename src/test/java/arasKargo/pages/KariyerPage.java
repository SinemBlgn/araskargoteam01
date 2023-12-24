package arasKargo.pages;
import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KariyerPage {
    public KariyerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[11]")
    public WebElement kariyer;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[12]")
    public WebElement araslar;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[13]")
    public WebElement gelecegin;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[14]")
    public WebElement iyiBirDunya;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[15]")
    public WebElement Teknoloji;


}
