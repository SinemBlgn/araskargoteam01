package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePagePage {
    public HomePagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //sinem(15-65)
    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement closePopUp;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[2]")
    public WebElement hakkimizda;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[3]")
    public WebElement vizyon;
    @FindBy(xpath = "//h1")
    public WebElement baslik;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[4]")
    public WebElement yonetimEkibimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[5]")
    public WebElement haberlerDuyurular;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[6]")
    public WebElement reklamlarimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[32]")
    public WebElement arasKargoSporKulubu;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[34]")
    public WebElement bizeUlasin;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[35]")
    public WebElement iletisim;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[36]")
    public WebElement genelMudurluk;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[37]")
    public WebElement bolgeMudurluklerimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[38]")
    public WebElement subelerimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[39]")
    public WebElement arasBurdaNoktalarimiz;
    @FindBy(xpath = "(//a[@class='ng-tns-c588362358-0'])[10]")
    public WebElement musterimizOlun;
    @FindBy(xpath = "(//*[@class='mat-focus-indicator login-btn mat-stroked-button mat-button-base ng-tns-c588362358-0 ng-star-inserted'])")
    public WebElement uyeGirisiButton;
    @FindBy(xpath ="//*[@id='SpanLoginHeadline']")
    public WebElement loginAssert;




























    //Adnan(66-116)


















































   //Arife(117-167)

















































    //Cigdem(167-217)


















































    //Hanzel(218-268)


















































    //Omer(269-319)


















































    //Muhammed(320-370)


















































    //Soner(371 sonrasi)










}

