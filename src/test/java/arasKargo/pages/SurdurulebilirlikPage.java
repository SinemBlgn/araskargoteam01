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
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[1]/file-box-grey/div/div/div")
    public WebElement MukemmellikteKararlilik;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/h3")
    public WebElement belgeler;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[2]/file-box-grey/div/div/div")
    public WebElement HizmetYeterlilikBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[3]/file-box-grey/div/div/div")
    public WebElement turkiyemukemmellikodulu;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[4]/file-box-grey/div/div/div")
    public WebElement BilgiGuvenligiYonetimSistemiBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[5]/file-box-grey/div/div/div")
    public WebElement MukemmellikteYetkinlik3Yildiz;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[8]/file-box-grey/div/div/div")
    public WebElement KaliteYonetimSistemiBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[9]/file-box-grey/div/div/div")
    public WebElement MusteriMemnuniyetiYonetimSistemiBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[10]/file-box-grey/div/div/div")
    public WebElement cevreYonetimSistemiBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[11]/file-box-grey/div/div/div")
    public WebElement isSagligiveGuvenligiYonetimSistemiBelgesi;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[6]/file-box-grey/div/div/div")
    public WebElement dortyildiz;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/app-sustainability-pages/div/div/div/div[2]/div/div/div[7]/file-box-grey/div/div/div")
    public WebElement besyildiz;




}
