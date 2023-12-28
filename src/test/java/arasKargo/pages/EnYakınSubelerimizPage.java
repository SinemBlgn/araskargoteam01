package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnYakınSubelerimizPage {
    public EnYakınSubelerimizPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement closePopUp;
    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement enyakınSubelerPop;
    @FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c84697453-18 ng-star-inserted']")
    public  WebElement aramaİslemiSeciniz;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    public WebElement arasBurasıNoktalarButon;
    @FindBy(xpath = "//img[@src='/assets/images/icons/esnaf.svg']")
    public WebElement esnaf;
    @FindBy(xpath = "//div[@class='delivery-points-tabbed__button-icon']")
    public WebElement dolap;
    @FindBy(xpath = "//div[@class='mt-4 pt-3 mapform__location']")
    public WebElement konumumdanBul;

    @FindBy(xpath = "/input[@class='mat-input-element mat-form-field-autofill-control mat-autocomplete-trigger aras-form-input ng-tns-c2842056177-25 ng-pristine ng-invalid cdk-/text-field-autofill-monitored ng-touched']")
    public WebElement ilIlceGiriniz;

    @FindBy(xpath = "//div[@class='leaflet-container leaflet-touch leaflet-retina leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']")
    public WebElement harita;







}
