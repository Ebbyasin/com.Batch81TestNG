package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
    }
    static WebDriver driver;

    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her test methddu
    icin yeni bir pencere(driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
    bir kere driver'i calistirir diyerek bir kere if icini calistiracak. ve driver artik bir kere calistigi icin ve
    deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz ayni pencere(driver) uzerinde
    calisacak
     */
    /*
    Testlerimizi çalıştırdığımızda her seferinde yeni driver oluşturduğu için her test methodu için yeni bir pencere(driver)
    açıyor. Eğer driver'e bir değer atanmamışsa yani driver==null; ise bir kere driver'i çalıştırır diyerek bir kere if()
    içini çalıştıracak.
     */
    //POM'DE Driver icin TestBase class'ina extends etmek yerine Driver class'indan static methodlar kullanarak
    //driver olusturup,ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir.
    //testBase bizi bir kaliba sokar,derki her classtan once acarim sonra kapatirim..ben boyle istemiyorum,istedigim
    // zaman acayim istersem kapatayim.bunu driver bize saglar.test base bizi her seferinde setup ve tearDown
    // olusturmak tan kurtardi ama bizi kaliba soktu.


    public static WebDriver getDriver() {  //bugune kadar TestBase classina extends ederek kullandigimiz driver yerine
        if (driver == null) {           //bundan sonra Driver classindan kullanacagimiz getDriver static methodunu
            // driver==null -->driver a deger atanmamissa calis,atanmissa 34-37 arasi calismaz,direk return a gider.
              switch (ConfigReader.getProperty("browser")){
                  case "chrome":
                      WebDriverManager.chromedriver().setup();
                      driver=new ChromeDriver();
                      break;
                  case "edge":
                      WebDriverManager.edgedriver().setup();
                      driver=new EdgeDriver();
                      break;
                  case "firefox":
                      WebDriverManager.firefoxdriver().setup();
                      driver=new FirefoxDriver();
                      break;
                  case "opera":
                      WebDriverManager.operadriver().setup();
                      driver=new OperaDriver();
                      break;
                  case "headless-chrome" :
                      WebDriverManager.chromedriver().setup();
                      driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                      break;
                  default:
              }


            WebDriverManager.chromedriver().setup();    //kullanacagiz
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { // driver'a değer atanmışsa kapat
            driver.close();
            driver = null; // Kapandıktan sonra sonraki açmaları garanti altına almak için driver'i tekrar null yaptık
        }
    }
    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}
