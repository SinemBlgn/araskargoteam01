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
    @FindBy(xpath = "(//h2)[2]")
    public WebElement sayfayaGiticinKaydirma;
    @FindBy(xpath = "//a[@href='/musteri-iliskileri/geri-bildirim-formu'][normalize-space()='Sayfaya Git']")
    public WebElement getGeriBildirimsayfayaGit;

    @FindBy(xpath = "//div[contains(text(),'Bireysel')]")
    public WebElement bireyselSekmesi;
    @FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c84697453-15 ng-star-inserted']")
    public WebElement kategoriSecin;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    public WebElement bilgi;

    // @FindBy(xpath = "//span[@class='mat-select-min-line ng-tns-c84697453-3 ng-star-inserted']")
    // public WebElement secenekDogrulama;

    @FindBy(xpath = "//span[@class='mat-option-text'][contains(text(),'İŞLEM - TALEP')]")
    public WebElement islemTalep;

    @FindBy(xpath = "//span[contains(text(),'ÖNERİ')]")
    public WebElement oneri;

    @FindBy(xpath = "//span[contains(text(),'ŞİKAYET - PROBLEM')]")
    public WebElement sikayetProblem;

    @FindBy(xpath = "//span[contains(text(),'TEŞEKKÜRLER')]")
    public WebElement tesekkurler;





}
