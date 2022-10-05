package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluTest extends TestBaseRapor {
        /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Test","Gecerli kullanici adi ve password ile giriş yapıldı");
        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");

       // -login butonuna bas
        BrcPage brc=new BrcPage();
        brc.brclogin.click();
        extentTest.info("login butonuna basildi");

        //-test data user email: customer@bluerentalcars.com
        brc.userEmail.sendKeys(ConfigReader.getProperty("brcUserEmail"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcPass"))
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici email ve password girildi");
        extentTest.info("İkinci login butonuna basildi");

        //test data password : 12345 dataları girip login e basın
        String actualUserName=brc.basariliGiris.getText();
        String expectedUserName="John Walker";
        Assert.assertEquals(expectedUserName,actualUserName);
        extentTest.info("Sayfaya basarili bir sekilde girildi");

        //eğer hata raporu alırsak ve raporda resmi görüntülemek istersek rapor üzerine sağ click
        //open, explorer secip resimli raporu görüntüleyebiliriz.



    }
}
