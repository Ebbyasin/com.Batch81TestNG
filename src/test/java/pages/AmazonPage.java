package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {   //page sayfalarinda zorunlu olmasada page ismini kullanin
    //  dikkat edilmesi gereken durum;page sayfasi olustugunda mutlaka constructor olusturulmali.
    public AmazonPage(){ // Constructor olusturup public yapmamiz gerekir.(nasil anliyoruz constructor oldugunu:class
        // ismi ile ayni isimde olacak,method gibi yaninda parantezi var.this de sunu diyor :bu classtaki driver,aslinda
        // driver classindaki getDriver dan gelen driver.Bu ikisini eslestiriyoruz..(13.satir bu isi yapiyor)

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

    /*
    -page sayfalarinda oncelikle icinde page olan hatirlayabilecegimiz bir isimle olustururuz classi.
    -sonra ilk olarak constructor olustururuz,class ismiyle ayni olan ,yaninda method parantezi olan.
    -bu constructor un icinde page fabrikasina gideriz,(PageFactory ile) sonra initElements deyip,driverimi bu class a
    tanitacagim.(benim driverim Driver clasin daki getDriver) ,this le gosteririz.
     */
}
