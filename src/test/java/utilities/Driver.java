package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
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


    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
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