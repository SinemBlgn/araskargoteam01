package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UcretHesaplaPage {
    public UcretHesaplaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
